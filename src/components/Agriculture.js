// src/pages/Agriculture.js
import React from 'react';

import IndustryCard from './IndustryCard';
import './IndustryGrid.css';
import { MdStore, MdDeliveryDining, MdAnalytics, MdPriceCheck } from 'react-icons/md';
import { FaTruck, FaClipboardList } from 'react-icons/fa'; // Logistics and inventory-related icons
import { GiFarmTractor, GiWateringCan } from 'react-icons/gi'; // Additional icons for agriculture-related solutions

function Agriculture() {
  return (
    <div>
      <h1><center>Agriculture Industry Solutions</center></h1>
      <div className="industry-grid-container">
        <div className="grid">
          <IndustryCard 
            title="Smart Farming" 
            icon={<GiFarmTractor size={50} style={{ color: '#8BC34A' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Precision Agriculture" 
            icon={<MdDeliveryDining size={50} style={{ color: '#FF9800' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Livestock Monitoring" 
            icon={<FaTruck size={50} style={{ color: '#3F51B5' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Smart Irrigation" 
            icon={<GiWateringCan size={50} style={{ color: '#4CAF50' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Crop Disease Detection" 
            icon={<MdAnalytics size={50} style={{ color: '#FF5722' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Smart Greenhouse" 
            icon={<MdPriceCheck size={50} style={{ color: '#9C27B0' }} />} 
            link="/RPMCalculator" 
          />
        </div>
      </div>
    </div>
  );
}

export default Agriculture;
