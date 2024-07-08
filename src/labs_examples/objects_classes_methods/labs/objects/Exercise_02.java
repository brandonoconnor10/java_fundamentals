public class Exercise_01 {

    public static void main(String[] args) {
        // Demonstrate getting and setting variables and using toString()

        // Create objects
        Engine engine1 = new Engine(5000);
        Wing wing1 = new Wing("left");
        Wing wing2 = new Wing("right");
        Cockpit cockpit1 = new Cockpit("Boeing 777");
        Tail tail1 = new Tail("standard");

        // Create airplane object and set variables
        Airplane airplane1 = new Airplane(engine1, wing1, wing2, cockpit1, tail1, 150000.0, 100000.0);

        // Print status before modification
        System.out.println("Airplane 1 status before modification:");
        System.out.println(airplane1.toString());

        // Demonstrate getting variables
        System.out.println("\nGetting variables:");
        System.out.println("Engine horsepower: " + airplane1.getEngine().getHorsePower());
        System.out.println("Left wing position: " + airplane1.getLeftWing().getPosition());
        System.out.println("Right wing position: " + airplane1.getRightWing().getPosition());
        System.out.println("Cockpit model: " + airplane1.getCockpit().getModel());
        System.out.println("Tail type: " + airplane1.getTail().getType());
        System.out.println("Fuel capacity: " + airplane1.getFuelCapacity());
        System.out.println("Current fuel level: " + airplane1.getCurrentFuelLevel());

        // Demonstrate setting variables
        System.out.println("\nSetting variables:");
        airplane1.getEngine().setHorsePower(6000);
        airplane1.getLeftWing().setPosition("new left");
        airplane1.getRightWing().setPosition("new right");
        airplane1.getCockpit().setModel("Boeing 787");
        airplane1.getTail().setType("enhanced");
        airplane1.setFuelCapacity(200000.0);
        airplane1.setCurrentFuelLevel(120000.0);

        // Print status after modification
        System.out.println("\nAirplane 1 status after modification:");
        System.out.println(airplane1.toString());
    }
}
