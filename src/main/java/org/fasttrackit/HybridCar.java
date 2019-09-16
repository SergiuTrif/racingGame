package org.fasttrackit;

//overriding
//not overwriting
public class HybridCar extends Vehicle {


    // co-variant return type
    @Override
    protected HybridCar clone() throws CloneNotSupportedException {
        return new HybridCar();
    }

    public void fly() {
        System.out.println("Yeeey");
    }

    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println(getName() + " is accelerating with " + speed + " for " + durationInHours + "h");
        double actualSpeed = 2 * speed;

        double distance = actualSpeed * durationInHours;

       // traveledDistance += distance;
        setTraveledDistance(getTraveledDistance() + distance);

       // System.out.println("Cheater!!!");
        return distance;




    }

}

