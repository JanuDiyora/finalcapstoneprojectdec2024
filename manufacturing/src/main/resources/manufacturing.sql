CREATE DATABASE manufacturing;
use manufacturing;

CREATE TABLE SmartFactoryROI (
    id INT AUTO_INCREMENT PRIMARY KEY,
    factory_name VARCHAR(255) NOT NULL,
    investment_cost DECIMAL(10, 2) NOT NULL,
    operating_cost DECIMAL(10, 2) NOT NULL,
    annual_revenue DECIMAL(10, 2) NOT NULL,
    roi_percentage DECIMAL(5, 2) NOT NULL,
    year INT NOT NULL,
    investment_period INT NOT NULL
);

CREATE TABLE PredictiveMaintenanceCalculations (
    CalculationID INT AUTO_INCREMENT PRIMARY KEY, -- Unique ID for each calculation record
    EquipmentID INT NOT NULL,                     -- ID of the equipment
    EquipmentName VARCHAR(255),                   -- Name of the equipment
    MaintenanceType ENUM('Predictive', 'Preventive', 'Corrective'), -- Type of maintenance
    TotalInvestmentCost DECIMAL(10, 2),           -- Total investment in predictive maintenance tools/systems
    AnnualOperatingCost DECIMAL(10, 2),           -- Annual cost of maintenance operations
    TotalAnnualBenefits DECIMAL(10, 2),           -- Annual benefits (e.g., cost savings from downtime reduction)
    ROI DECIMAL(10, 2),                           -- Return on Investment percentage
    
    DowntimeHours DECIMAL(8, 2),                  -- Downtime hours saved due to predictive maintenance
    MaintenanceCostSavings DECIMAL(10, 2)       -- Cost savings from predictive maintenance
   
);

CREATE TABLE SmartInventory (
    id INT AUTO_INCREMENT PRIMARY KEY,
    itemName VARCHAR(255) NOT NULL,
    category VARCHAR(100) NOT NULL,
    quantity INT NOT NULL,
    unitCost DECIMAL(10, 2) NOT NULL,
    totalValue DECIMAL(10, 2) GENERATED ALWAYS AS (quantity * unitCost) STORED,
    reorderLevel INT DEFAULT 10,
    reorderQuantity INT DEFAULT 50,
    
    stockStatus ENUM('Available', 'Reserved', 'In Transit', 'Out of Stock') DEFAULT 'Available'
); 
CREATE TABLE QualityControlAutomation (
    InspectionID INT AUTO_INCREMENT PRIMARY KEY, -- Unique identifier for each inspection
       
    InspectionType VARCHAR(50),                 -- Type of inspection (e.g., visual, automated, sample-based)
    DefectCount INT DEFAULT 0,                  -- Number of defects found
    DefectType VARCHAR(255),                    -- Description of the defect type(s) found
    PassFailStatus ENUM('PASS', 'FAIL'),        -- Result of the inspection
   InvestmentCost DECIMAL(10, 2),              -- Total investment cost for inspection setup
    OperatingCost DECIMAL(10, 2),               -- Operating cost for the inspection process
    AnnualBenefits DECIMAL(10, 2),              -- Annual benefits from improved quality control
    DowntimeHoursSaved DECIMAL(10, 2),          -- Downtime hours saved through automation
    MaintenanceCostSavings DECIMAL(10, 2)    -- Cost savings from predictive maintenance
    
);
