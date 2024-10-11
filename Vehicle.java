

class Vehicle {
    protected int numWheels;
    protected double price;

    public Vehicle(int numWheels, double price) {
        this.numWheels = numWheels;
        this.price = price;
    }

    public void print() {
        System.out.println("Number of wheels: " + numWheels);
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Subclass: Truck
class Truck extends Vehicle {
    private int numDoors;

    public Truck(int numWheels, double price, int numDoors) {
        super(numWheels, price);
        this.numDoors = numDoors;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Number of doors: " + numDoors);
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
}

// Subclass: Bicycle
class Bicycle extends Vehicle {
    private String bikeType;

    public Bicycle(int numWheels, double price, String bikeType) {
        super(numWheels, price);
        this.bikeType = bikeType;
    }

    @Override
    public void print() {
        System.out.println("Bike type: " + bikeType);
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }
}

// Subclass: Convertible
class Convertible extends Vehicle {
    private String roofType;

    public Convertible(int numWheels, double price, String roofType) {
        super(numWheels, price);
        this.roofType = roofType;
    }

    @Override
    public void print() {
        System.out.println("Roof type: " + roofType);
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }
}

// Main Class to Test the Inheritance Structure
class Main {
    public static void main(String[] args) {
        Truck truck = new Truck(6, 45000, 4);
        truck.print();

        Bicycle bike = new Bicycle(2, 1500, "Mountain Bike");
        bike.print();

        Convertible convertible = new Convertible(4, 60000, "Hard Top");
        convertible.print();
    }
}
