import java.util.*;

public class AlertReceiver {

    // Simulating an alert listener
    public interface AlertListener {
        void onAlertReceived(String alertMessage);
    }

    // Example implementation of an alert listener
    public static class ExampleAlertListener implements AlertListener {
        @Override
        public void onAlertReceived(String alertMessage) {
            System.out.println("Received Alert: " + alertMessage);
            // You can implement your logic here to handle the received alert
        }
    }

    // Class representing the mobile application
    public static class MobileApplication {
        private List<AlertListener> alertListeners;

        public MobileApplication() {
            this.alertListeners = new ArrayList<>();
        }

        // Method to register an alert listener
        public void registerAlertListener(AlertListener listener) {
            alertListeners.add(listener);
        }

        // Method to simulate receiving an alert
        public void receiveAlert(String alertMessage) {
            // Notify all registered alert listeners
            for (AlertListener listener : alertListeners) {
                listener.onAlertReceived(alertMessage);
            }
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the mobile application
        MobileApplication mobileApp = new MobileApplication();

        // Creating an instance of the example alert listener
        AlertListener exampleListener = new ExampleAlertListener();

        // Registering the example alert listener with the mobile application
        mobileApp.registerAlertListener(exampleListener);

        // Simulating receiving an alert
        mobileApp.receiveAlert("Critical Alert: Equipment malfunction detected!");
    }
}
