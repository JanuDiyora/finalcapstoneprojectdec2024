// src/pages/Transportation.js
import React from 'react';

import IndustryCard from './IndustryCard';
import './IndustryGrid.css';
import { MdDirectionsCar, MdTraffic, MdElectricCar, MdCommute, MdAccessibility } from 'react-icons/md';
import { FaParking, FaBicycle } from 'react-icons/fa'; // Parking and transportation-related icons

function Transportation() {
  return (
    <div>
      <h1><center>Transportation Industry Solutions</center></h1>
      <div className="industry-grid-container">
        <div className="grid">
          <IndustryCard 
            title="Smart Traffic Management" 
            icon={<MdTraffic size={50} style={{ color: '#FF5722' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Smart Public Transit" 
            icon={<MdCommute size={50} style={{ color: '#4CAF50' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Fleet Management" 
            icon={<FaBicycle size={50} style={{ color: '#2196F3' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Smart Parking" 
            icon={<FaParking size={50} style={{ color: '#FFC107' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Electric Vehicle Charging Infrastructure" 
            icon={<MdElectricCar size={50} style={{ color: '#8BC34A' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Autonomous Vehicle Support" 
            icon={<MdDirectionsCar size={50} style={{ color: '#9C27B0' }} />} 
            link="/RPMCalculator" 
          />
        </div>
      </div>
    </div>
  );
}

export default Transportation;
