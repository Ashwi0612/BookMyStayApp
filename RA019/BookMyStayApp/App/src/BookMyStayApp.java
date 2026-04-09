public class BookMyStayApp {

    public class BookMyStayApp {

        public static void main(String[] args) {

            System.out.println("====================================");
            System.out.println("   Welcome to BookMyStayApp");
            System.out.println("   Hotel Booking System v1.0");
            System.out.println("====================================\n");

            // Create room objects (Polymorphism)
            Room single = new SingleRoom();
            Room doubleRoom = new DoubleRoom();
            Room suite = new SuiteRoom();

            // Static availability (simple variables)
            int singleAvailable = 5;
            int doubleAvailable = 3;
            int suiteAvailable = 2;

            // Display details
            System.out.println("Available Rooms:\n");

            single.displayDetails();
            System.out.println("Available: " + singleAvailable + "\n");

            doubleRoom.displayDetails();
            System.out.println("Available: " + doubleAvailable + "\n");

            suite.displayDetails();
            System.out.println("Available: " + suiteAvailable + "\n");
        }
    }

}
