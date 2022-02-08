public class Cafe {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double lattePrice = 4.43;
        double dripPrice = 3;
        double cappucinoPrice = 3.85;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Noah";
        String customer4 = "Jimmy";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        customer1 = "Andrew";
        isReadyOrder2 = false;
        dripPrice = 3.3;

        System.out.println(generalGreeting + customer1);
        if(isReadyOrder2 == true){
            System.out.println(customer2 + readyMessage);
            }
        else{
            System.out.println(customer2 + pendingMessage);
        }
        
        System.out.println(displayTotalMessage + (lattePrice - dripPrice));

    }
}
