CREATE SCHEMA `smart_retail` ;

-- Create UseCase table
CREATE TABLE use_case (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL
);

-- Create Item table
CREATE TABLE item (
    id INT AUTO_INCREMENT PRIMARY KEY,
    use_case_id INT NOT NULL,
    name VARCHAR(255) NOT NULL,
    price_per_unit DECIMAL(10, 2) NOT NULL,
    description VARCHAR(255),
    FOREIGN KEY (use_case_id) REFERENCES use_case(id),
    category VARCHAR(255)
);

INSERT INTO use_case (id, name, description) VALUES
(1, 'Smart Store', 'Inventory tracking and management in retail stores.'),
(2, 'Smart Delivery', 'Optimizing last-mile delivery systems.'),
(3, 'Smart Pricing', 'Dynamic pricing systems based on market trends.'),
(4, 'Smart Logistics', 'Efficient warehouse and logistics management.'),
(5, 'Smart Customer Analytics', 'Insights for better customer understanding and targeting.'),
(6, 'Smart Inventory', 'Automating inventory restocking and monitoring systems.');

INSERT INTO item (id, use_case_id, name, price_per_unit, description, category)
VALUES
(1, 1, 'RFID Systems', 2000.00, 'Tracks inventory with real-time updates.', 'Smart Store'),
(2, 1, 'Smart Shelves', 1500.00, 'Sensors to monitor stock levels.', 'Smart Store'),
(3, 1, 'Smart Checkout Systems', 3000.00, 'Enables seamless cashier-less checkout.', 'Smart Store'),
(4, 1, 'Digital Signage Systems', 1200.00, 'Displays promotions dynamically.', 'Smart Store'),
(5, 1, 'Inventory Drones', 5000.00, 'Automates inventory counting using drones.', 'Smart Store'),
(6, 2, 'Delivery Drones', 10000.00, 'Automates delivery to customers.', 'Smart Delivery'),
(7, 2, 'Automated Sorting Systems', 8000.00, 'Speeds up sorting for delivery.', 'Smart Delivery'),
(8, 2, 'Route Optimization Software', 3000.00, 'Optimizes delivery routes for efficiency.', 'Smart Delivery'),
(9, 3, 'Dynamic Pricing Algorithms', 8000.00, 'Updates prices based on demand and trends.', 'Smart Pricing'),
(10, 3, 'Market Trend Monitoring Tools', 5000.00, 'Analyzes market and competitor data.', 'Smart Pricing'),
(11, 3, 'Price Optimization Dashboards', 4000.00, 'Visualizes pricing strategies and results.', 'Smart Pricing'),
(12, 4, 'IoT Sensors for Logistics', 2500.00, 'Tracks environmental conditions in warehouses.', 'Smart Logistics'),
(13, 4, 'Automated Forklifts', 15000.00, 'Automates material handling in warehouses.', 'Smart Logistics'),
(14, 4, 'Warehouse Management Systems', 10000.00, 'Integrates operations for efficiency.', 'Smart Logistics'),
(15, 5, 'Customer Analytics Platform', 7000.00, 'Provides actionable customer insights.', 'Smart Customer Analytics'),
(16, 5, 'Heat Mapping Tools', 3000.00, 'Tracks customer movements in-store.', 'Smart Customer Analytics'),
(17, 5, 'Personalized Marketing Systems', 4000.00, 'Creates personalized customer campaigns.', 'Smart Customer Analytics'),
(18, 6, 'Inventory Monitoring Sensors', 1500.00, 'Tracks inventory in real-time.', 'Smart Inventory'),
(19, 6, 'Restocking Robots', 12000.00, 'Automates restocking in warehouses.', 'Smart Inventory'),
(20, 6, 'Supply Chain Visibility Tools', 3000.00, 'Tracks inventory across supply chains.', 'Smart Inventory');

