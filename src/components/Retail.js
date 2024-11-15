// src/pages/RealEstate.js
import React from 'react';

import IndustryCard from './IndustryCard';
import './IndustryGrid.css';
import { MdStore, MdDeliveryDining, MdAnalytics, MdPriceCheck } from 'react-icons/md';
import { FaTruck, FaClipboardList } from 'react-icons/fa'; // Logistics and inventory-related icons

function Retail() {
  return (
    <div>
      <h1><center>Retail Industry Solutions</center></h1>
      <div className="industry-grid-container">
        <div className="grid">
          <IndustryCard 
            title="Smart Store" 
            icon={<MdStore size={50} style={{ color: '#4CAF50' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Smart Delivery" 
            icon={<MdDeliveryDining size={50} style={{ color: '#FF9800' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Smart Logistics" 
            icon={<FaTruck size={50} style={{ color: '#2196F3' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Smart Inventory Management" 
            icon={<FaClipboardList size={50} style={{ color: '#9C27B0' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Smart Customer Analytics" 
            icon={<MdAnalytics size={50} style={{ color: '#FF5722' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Smart Pricing" 
            icon={<MdPriceCheck size={50} style={{ color: '#3F51B5' }} />} 
            link="/RPMCalculator" 
          />
        </div>
      </div>
    </div>
  );
}

export default Retail;
