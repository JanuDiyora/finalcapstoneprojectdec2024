// src/pages/HealthCare.js
import React from 'react';
import IndustryCard from './IndustryCard';
import './IndustryGrid.css';

import { FaHospital, FaStethoscope } from 'react-icons/fa';
import { GiMedicalPack, GiHealthNormal } from 'react-icons/gi';
import { MdTrackChanges, MdLocalHospital } from 'react-icons/md'; // Added hospital icon for Telemedicine

function HealthCare() {
  return (
    <div>
      <h1><center>HealthCare Industry Solutions</center></h1>
      <div className="industry-grid-container">
        <div className="grid">
          <IndustryCard 
            title="Smart Hospital" 
            icon={<FaHospital size={50} style={{ color: '#4CAF50' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Remote Patient Monitoring" 
            icon={<FaStethoscope size={50} style={{ color: '#FF9800' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Smart Pharmacy" 
            icon={<GiMedicalPack size={50} style={{ color: '#2196F3' }} />} 
            link="/RPMCalculator"  
          />
          <IndustryCard 
            title="Medical Asset Tracking" 
            icon={<GiHealthNormal size={50} style={{ color: '#9C27B0' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Smart Diagnostics" 
            icon={<MdTrackChanges size={50} style={{ color: '#FF5722' }} />} 
            link="/RPMCalculator" 
          />
          <IndustryCard 
            title="Telemedicine" 
            icon={<MdLocalHospital size={50} style={{ color: '#3F51B5' }} />} 
            link="/RPMCalculator" 
          />
        </div>
      </div>
    </div>
  );
}

export default HealthCare;
