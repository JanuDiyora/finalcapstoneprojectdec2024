import React from 'react';
import IndustryCard from './IndustryCard';
import './IndustryGrid.css'; 
import { MdHome, MdBusiness, MdLocalParking, MdPower } from 'react-icons/md';
import { FaRoad, FaBuilding } from 'react-icons/fa';

function RealEstate() {
  return (
    <div>
      <h1><center>Real Estate and Infrastructure</center></h1>
      <div className="industry-grid-container">
        <div className="grid">
          <IndustryCard title="Smart Home" icon={<MdHome size={50} className="multicolor-icon" />} link="http://localhost:8012/smartHome" />
          <IndustryCard title="Smart Building" icon={<FaBuilding size={50} className="icon-color-1" />} link="http://localhost:8012/smartBuilding" />
          <IndustryCard title="Smart Office" icon={<MdBusiness size={50} className="icon-color-2" />} link="http://localhost:8012/smartOffice" />
          <IndustryCard title="Smart Highway" icon={<FaRoad size={50} className="multicolor-icon" />} link="http://localhost:8012/smartHighway" />
          <IndustryCard title="Smart Parking" icon={<MdLocalParking size={50} className="icon-color-1" />} link="http://localhost:8012/smartHome" />
          <IndustryCard title="Smart Energy Management" icon={<MdPower size={50} className="icon-color-2" />} link="http://localhost:8012/smartHome" />
        </div>
      </div>
    </div>
  );
}

export default RealEstate;
