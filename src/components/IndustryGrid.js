import React from 'react';
import IndustryCard from './IndustryCard';
import './IndustryGrid.css';
import { MdHouse } from 'react-icons/md'; // Real Estate icon
import { FaShoppingCart, FaHospital, FaTruck } from 'react-icons/fa'; // Retail, Healthcare, Transportation icons
import { GiBank, GiAbacus } from 'react-icons/gi'; // Manufacturing and Agriculture icons

function IndustryGrid() {
  return (
    <div className="industry-grid-container">
      <div className="grid">
        <IndustryCard title="Real Estate" icon={<MdHouse size={50} className="multicolor-icon" />} link="/realestate" />
        <IndustryCard title="Retail" icon={<FaShoppingCart size={50} className="multicolor-icon" />} link="/retail" />
        <IndustryCard title="Manufacturing" icon={<GiAbacus size={50} className="multicolor-icon" />} link="/manufacturing" />
        <IndustryCard title="Healthcare" icon={<FaHospital size={50} className="multicolor-icon" />} link="/healthcare" />
        <IndustryCard title="Agriculture" icon={<GiBank size={50} className="multicolor-icon" />} link="/agriculture" />
        <IndustryCard title="Transportation" icon={<FaTruck size={50} className="multicolor-icon" />} link="/transportation" />
      </div>
    </div>
  );
}

export default IndustryGrid;
