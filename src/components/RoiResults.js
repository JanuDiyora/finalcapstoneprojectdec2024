import React, { useRef } from 'react';
import { useLocation, useNavigate } from 'react-router-dom';
import { Bar } from 'react-chartjs-2';
import jsPDF from 'jspdf';
import html2canvas from 'html2canvas';
import './RoiResults.css';
// Register Chart.js components
import {
    Chart as ChartJS,
    CategoryScale,
    LinearScale,
    BarElement,
    Title,
    Tooltip,
    Legend
} from 'chart.js';

ChartJS.register(CategoryScale, LinearScale, BarElement, Title, Tooltip, Legend);

const RoiResults = () => {
    const navigate = useNavigate();
    const { state } = useLocation();
    const chartRef = useRef(null); // Reference for the chart

    const formData = state?.formData; // Ensure formData exists
    if (!formData) {
        navigate('/calculator'); // Redirect if formData is missing
        return null;
    }

    const totalInvestmentCosts = parseFloat(formData.deviceCost) + parseFloat(formData.softwareCost) +
                                 parseFloat(formData.installationCost) + parseFloat(formData.trainingCost);
    const totalAnnualCosts = parseFloat(formData.annualOperatingCost);
    const totalAnnualBenefits = parseFloat(formData.annualBenefit);
    const netAnnualBenefit = totalAnnualBenefits - totalAnnualCosts;
    const roiPercentage = ((netAnnualBenefit * formData.investmentPeriod - totalInvestmentCosts) / totalInvestmentCosts) * 100;

    const data = {
        labels: ['Total Investment Costs', 'Annual Operating Costs', 'Total Annual Benefits'],
        datasets: [
            {
                label: 'Amount ($)',
                data: [totalInvestmentCosts, totalAnnualCosts, totalAnnualBenefits],
                backgroundColor: ['#4caf50', '#ff9800', '#3f51b5']
            }
        ]
    };

    const options = {
        responsive: true,
        maintainAspectRatio: false,  // Allows custom size
        plugins: {
            legend: { display: true, position: 'top' },
            title: { display: false }
        },
        scales: {
            x: { beginAtZero: true },
            y: { beginAtZero: true }
        }
    };

    const generatePdf = () => {
        const doc = new jsPDF();

        // Add text content to the PDF
        doc.text('ROI Calculation', 10, 10);
        doc.text(`Total Investment Costs: $${totalInvestmentCosts.toFixed(2)}`, 10, 20);
        doc.text(`Annual Operating Costs: $${totalAnnualCosts.toFixed(2)}`, 10, 30);
        doc.text(`Total Annual Benefits: $${totalAnnualBenefits.toFixed(2)}`, 10, 40);
        doc.text(`Net Annual Benefit: $${netAnnualBenefit.toFixed(2)}`, 10, 50);
        doc.text(`Investment Period (Years): ${formData.investmentPeriod}`, 10, 60);
        doc.text(`ROI (%): ${roiPercentage.toFixed(2)}`, 10, 70);

        // Capture the chart as an image and add it to the PDF
        html2canvas(chartRef.current).then((canvas) => {
            const imgData = canvas.toDataURL('image/png');
            doc.addImage(imgData, 'PNG', 10, 80, 180, 90); // Adjust position and size as needed
            doc.save('ROI_Report.pdf');
        });
    };

    return (
        <div>
            <h2><center>Remote Patient Monitoring ROI Calculation</center></h2>
            <h3><center>Results:</center></h3>
            <br />
            <table>
                <thead>
                    <tr>
                        <th>Description</th>
                        <th>Amount ($)</th>
                    </tr>
                </thead>
                <tbody>
                    <tr><td>Total Investment Costs</td><td>{totalInvestmentCosts.toFixed(2)}</td></tr>
                    <tr><td>Annual Operating Costs</td><td>{totalAnnualCosts.toFixed(2)}</td></tr>
                    <tr><td>Total Annual Benefits</td><td>{totalAnnualBenefits.toFixed(2)}</td></tr>
                    <tr><td>Net Annual Benefit</td><td>{netAnnualBenefit.toFixed(2)}</td></tr>
                    <tr><td>Investment Period (Years)</td><td>{formData.investmentPeriod}</td></tr>
                    <tr><td>ROI (%)</td><td>{roiPercentage.toFixed(2)}%</td></tr>
                </tbody>
            </table>
            <br />
            <div ref={chartRef} style={{ width: '400px', height: '300px', margin: '20px auto' }}>
                <Bar data={data} options={options} />
            </div>
            <br />
            <div style={{ textAlign: 'center', color:'grey' }}>
                <button onClick={() => navigate('/RpmCalculator')}>Back to Form</button>
                <button onClick={generatePdf}>Create Report (PDF)</button>
            </div>
            <br /><br />
        </div>
    );
};

export default RoiResults;
