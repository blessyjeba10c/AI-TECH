import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LogDataActivity extends AppCompatActivity {

    private EditText flowRateInput, concentrationInput, efficiencyInput;
    private Button logButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_data);

        // Initialize views
        flowRateInput = findViewById(R.id.flow_rate_input);
        concentrationInput = findViewById(R.id.concentration_input);
        efficiencyInput = findViewById(R.id.efficiency_input);
        logButton = findViewById(R.id.log_button);

        // Set click listener for log button
        logButton.setOnClickListener(view -> logData());
    }

    private void logData() {
        // Retrieve data from input fields
        String flowRate = flowRateInput.getText().toString();
        String concentration = concentrationInput.getText().toString();
        String efficiency = efficiencyInput.getText().toString();

        // Validate input
        if (flowRate.isEmpty() || concentration.isEmpty() || efficiency.isEmpty()) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        // Perform data logging (You need to implement this part)
        // Here, you can save the data locally or send it to a server
        // For demonstration, we'll just display a toast message with the logged data
        String logMessage = "Flow Rate: " + flowRate + " L/s\n" +
                            "Pollutant Concentration: " + concentration + " ppm\n" +
                            "Treatment Efficiency: " + efficiency + " %";
        Toast.makeText(this, "Data logged:\n" + logMessage, Toast.LENGTH_LONG).show();

        // Optionally, you can clear the input fields after logging
        clearInputFields();
    }

    private void clearInputFields() {
        flowRateInput.getText().clear();
        concentrationInput.getText().clear();
        efficiencyInput.getText().clear();
    }
}
