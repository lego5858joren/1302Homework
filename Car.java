package prob1;

public class Car {

    private double fuelCapacity;

    private double 	fuelEfficiency;

    private double fuelLevel;

    private double totalDistance;

    Car(double fuelCapacity, double fuelEfficiency){
        this.fuelCapacity=fuelCapacity;
        this.fuelEfficiency=fuelEfficiency;
    }

    Car(double fuelCapacity, double fuelEfficiency, double fuelLevel){
        this.fuelCapacity=fuelCapacity;
        this.fuelEfficiency=fuelEfficiency;
        this.fuelLevel=fuelLevel;
    }

    public void drive(double time, double rate) {
        if (time < 0 || rate < 0) {
            throw new IllegalArgumentException("Time and rate must be non-negative.");
        }

        double potentialDistance = time * rate; // Calculate potential distance that could be traveled
        double requiredFuel = potentialDistance / fuelEfficiency; // Calculate fuel needed for this distance

        if (requiredFuel <= fuelLevel) {
            // There is enough fuel to drive the full potential distance
            fuelLevel -= requiredFuel;
            totalDistance += potentialDistance;
        } else {
            // Not enough fuel to drive the full potential distance
            double possibleDistance = fuelLevel * fuelEfficiency; // Calculate the maximum distance with available fuel
            totalDistance += possibleDistance;
            fuelLevel = 0; // Use up all the fuel
        }
    }

    public void fillUp(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount of fuel cannot be negative.");
        }

        fuelLevel += amount;

        if (fuelLevel > fuelCapacity) {
            fuelLevel = fuelCapacity;  // Ensure fuelLevel does not exceed fuelCapacity
        }
    }

    public double getFuelCapacity(){
        return fuelCapacity;
    }

    public double getFuelEfficiency(){
        return fuelEfficiency;
    }

    public double getFuelLevel(){
        return fuelLevel;
    }

    public double getTotalDistance(){
        return totalDistance;
    }

    @Override
    public String toString() {
        return String.format("fuelLevel=%.2f, totalDistance=%.2f, fuelCapacity=%.2f, fuelEfficiency=%.2f", fuelLevel, totalDistance, fuelCapacity, fuelEfficiency);
    }




    public static void main(String[]args){

    }
}
