import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import './RPMCal.css';

const RpmCalculator = () => {
  const [formData, setFormData] = useState({
    deviceCost: '',
    softwareCost: '',
    installationCost: '',
    trainingCost: '',
    annualOperatingCost: '',
    annualBenefit: '',
    investmentPeriod: ''
  });

  const navigate = useNavigate();

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData((prevData) => ({
        ...prevData,
        [name]: value
    }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    navigate('/RoiResults', { state: { formData } });
  };

  return (
    <div>
        <h2><center>RPM ROI Calculator</center></h2>
        <form onSubmit={handleSubmit}>
            <h3>Investment Costs</h3>

            <div className="input-group">
                <label>Monitoring Devices Cost:</label>
                <input type="number" name="deviceCost" onChange={handleChange} value={formData.deviceCost} />
            </div>
            <div className="paragraph">
                <p>Investment in advanced wearable sensors and smart monitors that track health metrics in real-time.</p>
            </div>

            <div className="input-group">
                <label>Software & Cloud Cost:</label>
                <input type="number" name="softwareCost" onChange={handleChange} value={formData.softwareCost} />
            </div>
            <div className="paragraph">
                <p>Costs for smart software solutions that manage and securely store patient data in the cloud.</p>
            </div>

            <div className="input-group">
                <label>Installation Cost:</label>
                <input type="number" name="installationCost" onChange={handleChange} value={formData.installationCost} />
            </div>
            <div className="paragraph">
                <p>Expenses for setting up the advanced technologies and configuring the monitoring infrastructure.</p>
            </div>

            <div className="input-group">
                <label>Training Cost:</label>
                <input type="number" name="trainingCost" onChange={handleChange} value={formData.trainingCost} />
            </div>
            <div className="paragraph">
                <p>Resources allocated for training healthcare providers to effectively use the smart system.</p>
            </div>

            <div className="input-group">
                <label>Annual Operating Cost:</label>
                <input type="number" name="annualOperatingCost" onChange={handleChange} value={formData.annualOperatingCost} />
            </div>

            <div className="input-group">
                <label>Annual Benefit:</label>
                <input type="number" name="annualBenefit" onChange={handleChange} value={formData.annualBenefit} />
            </div>

            <div className="input-group">
                <label>Investment Period (Years):</label>
                <input type="number" name="investmentPeriod" onChange={handleChange} value={formData.investmentPeriod} />
            </div>

            <div className="button-container">
                <button type="submit">Calculate ROI</button>
            </div>
        </form>
    </div>
  );
};

export default RpmCalculator;
