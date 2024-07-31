public class MainActivity extends AppCompatActivity {

    private AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Show alert notification
        showNotification("Alert Message Here");
    }

    private void showNotification(String message) {
        // Create an AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View dialogView = getLayoutInflater().inflate(R.layout.alert_notification, null);
        builder.setView(dialogView);

        // Initialize views
        TextView alertMessageTextView = dialogView.findViewById(R.id.alertMessageTextView);
        Button dismissButton = dialogView.findViewById(R.id.dismissButton);
        Button viewDetailsButton = dialogView.findViewById(R.id.viewDetailsButton);

        // Set alert message
        alertMessageTextView.setText(message);

        // Dismiss button click listener
        dismissButton.setOnClickListener(v -> alertDialog.dismiss());

        // View details button click listener
        viewDetailsButton.setOnClickListener(v -> {
            // Handle view details action
            // You can navigate to a details screen or perform any other action here
            alertDialog.dismiss();
        });

        // Create and show the dialog
        alertDialog = builder.create();
        alertDialog.show();
    }
}
