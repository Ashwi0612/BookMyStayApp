public class BookMyStayApp {

    public class BookMyStayApp {

        public class BookMyStayApp {

            public static void main(String[] args) {

                System.out.println("====================================");
                System.out.println("   Welcome to BookMyStayApp");
                System.out.println("   Hotel Booking System v1.0");
                System.out.println("====================================\n");

                // Room objects
                Room single = new SingleRoom();
                Room doubleRoom = new DoubleRoom();
                Room suite = new SuiteRoom();

                // Centralized Inventory
                RoomInventory inventory = new RoomInventory();

                System.out.println("Available Rooms:\n");

                single.displayDetails();
                System.out.println("Available: " + inventory.getAvailability("Single Room") + "\n");

                doubleRoom.displayDetails();
                System.out.println("Available: " + inventory.getAvailability("Double Room") + "\n");

                suite.displayDetails();
                System.out.println("Available: " + inventory.getAvailability("Suite Room") + "\n");

                // Optional: show full inventory
                System.out.println("\n--- Inventory Overview ---");
                inventory.displayInventory();
            }
        }


    }
