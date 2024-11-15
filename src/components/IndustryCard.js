// src/components/IndustryCard.js
import React from 'react';
import './IndustryCard.css';

function IndustryCard({ title, icon, link }) {
  return (
    <div className="industry-card">
      <a href={link}>
        <div className="icon">
          {icon} {/* Render the icon directly */}
        </div>
        <h3>{title}</h3>
      </a>
    </div>
  );
}

export default IndustryCard;
