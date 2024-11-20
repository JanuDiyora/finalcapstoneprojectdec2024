// src/App.js
import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import IndustryGrid from './components/IndustryGrid';
import RealEstate from './components/RealEstate';
import Retail from'./components/Retail';
import HealthCare from './components/HealthCare';
import RpmCalculator from './components/RpmCalculator';
import RoiResults from './components/RoiResults';
import Transportation from './components/Transportation';
import Manufacturing from './components/Manufacturing';
import Agriculture from './components/Agriculture';
import Header from './components/Header';
import Footer from './components/Footer';

function App() {
  return (
    <Router>
    <div className="App">
      <Header />
      <main>
        <Routes>
          <Route path="/" element={<IndustryGrid />} />
          <Route path="/realestate" element={<RealEstate />} />
            <Route path="/retail" element={<Retail />} />
            <Route path="/manufacturing" element={<Manufacturing />} />
            {/* <Route path="/HealthCare" element={<HealthCare />} /> */}
            <Route
              path="/healthcare/healthcare-list"
              element={() => {
                window.location.href = "http://localhost:8080/healthcare/healthcare-list";
                return null;
              }}
            />
            <Route path="/Agriculture" element={<Agriculture />} />
            <Route path="/Transportation" element={<Transportation />} />
            <Route path="/RpmCalculator" element={<RpmCalculator />} />

          <Route path="/RoiResults" element={<RoiResults />} />

          {/* Add more routes as needed */}
        </Routes>
      </main>
      <Footer />
    </div>
  </Router>
  );
}

export default App;
