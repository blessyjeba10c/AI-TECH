let intervalId = null;

// Function to start monitoring
const startMonitoring = () => {
  // Simulated real-time data (for demonstration)
  const simulateData = () => {
    const flowRate = (Math.random() * 10).toFixed(2); // Random flow rate between 0 and 10 L/s
    const pollutantConcentration = (Math.random() * 100).toFixed(2); // Random concentration between 0 and 100 ppm
    const efficiency = (Math.random() * 100).toFixed(2); // Random efficiency between 0 and 100 %

    document.getElementById('flowRate').textContent = `${flowRate} L/s`;
    document.getElementById('pollutantConcentration').textContent = `${pollutantConcentration} ppm`;
    document.getElementById('efficiency').textContent = `${efficiency} %`;
  };

  // Update data every 3 seconds
  intervalId = setInterval(simulateData, 3000);

  // Initial data update
  simulateData();
};

// Function to stop monitoring
const stopMonitoring = () => {
  clearInterval(intervalId);
};

// Event listeners for buttons
document.getElementById('startBtn').addEventListener('click', startMonitoring);
document.getElementById('stopBtn').addEventListener('click', stopMonitoring);
