package labs_examples.objects_classes_methods.labs.objects;

public class Exercise_01 {
    
    public static void main(String[] args) {
       // Create components of the airplane
       Engine airplaneEngine = new Engine(10000);
       Wing leftWing = new Wing("left");
       Wing rightWing = new Wing("right");
       Cockpit cockpit = new Cockpit("Boeing 787");
       Tail airplaneTail = new Tail("standard");
 
       // Create the airplane object
       Airplane myAirplane = new Airplane(airplaneEngine, leftWing, rightWing, cockpit, airplaneTail, 200000.0, 150000.0);
 
       // Print out details of the airplane
       System.out.println("The airplane has a " + myAirplane.cockpit.model + " cockpit, "
           + myAirplane.engine.horsePower + " horsepower engine, "
           + myAirplane.leftWing.position + " wing, "
           + myAirplane.rightWing.position + " wing, "
           + myAirplane.tail.type + " tail, "
           + "with a fuel capacity of " + myAirplane.fuelCapacity + " liters, "
           + "and a current fuel level of " + myAirplane.currentFuelLevel + " liters.");
    }
}

// Create the Airplane class
class Airplane {
   Engine engine;
   Wing leftWing;
   Wing rightWing;
   Cockpit cockpit;
   Tail tail;
   double fuelCapacity;
   double currentFuelLevel;

   public Airplane(Engine engine, Wing leftWing, Wing rightWing, Cockpit cockpit, Tail tail, double fuelCapacity, double currentFuelLevel) {
     this.engine = engine;
     this.leftWing = leftWing;
     this.rightWing = rightWing;
     this.cockpit = cockpit;
     this.tail = tail;
     this.fuelCapacity = fuelCapacity;
     this.currentFuelLevel = currentFuelLevel;
   }
}

// Create the Engine class
class Engine {
   double horsePower;

   public Engine(double horsePower) {
     this.horsePower = horsePower;
   }
}

// Create the Wing class
class Wing {
   String position;

   public Wing(String position) {
     this.position = position;
   }
}

// Create the Cockpit class
class Cockpit {
   String model;

   public Cockpit(String model) {
     this.model = model;
   }
}

// Create the Tail class
class Tail {
   String type;

   public Tail(String type) {
     this.type = type;
   }
}
