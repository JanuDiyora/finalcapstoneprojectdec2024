// src/pages/Manufacturing.js
import React from 'react';

import IndustryCard from './IndustryCard';
import './IndustryGrid.css';
import { MdFactory, MdBuild, MdSpeed, MdSettings } from 'react-icons/md'; // Icons for manufacturing
import { FaTruck, FaCog } from 'react-icons/fa'; // Logistics and automation-related icons

function Manufacturing() {
  return (
    <div>
      <h1><center>Manufacturing Industry Solutions</center></h1>
      <div className="industry-grid-container">
        <div className="grid">
          <IndustryCard 
            title="Smart Factory" 
            icon={<MdFactory size={50} style={{ color: '#4CAF50' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Predictive Maintenance" 
            icon={<MdBuild size={50} style={{ color: '#FF9800' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Smart Supply Chain" 
            icon={<FaTruck size={50} style={{ color: '#2196F3' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Quality Control Automation" 
            icon={<MdSettings size={50} style={{ color: '#9C27B0' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Smart Inventory" 
            icon={<MdSpeed size={50} style={{ color: '#FF5722' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Work Safety Monitoring" 
            icon={<FaCog size={50} style={{ color: '#3F51B5' }} />} 
            link="/RPMCalculator" 
          />
        </div>
      </div>
    </div>
  );
}

export default Manufacturing;
