package by.htp.aggregationAndComposition.task2;

import java.util.ArrayList;
import java.util.Objects;

public class Car implements CarImpl {
    private String model;
    private boolean isMove;
    private int inTank;
    private Engine engine;
    private ArrayList<Wheel> wheels;

    public Car(String model, int inTank, Engine engine, ArrayList<Wheel> wheels) {
        this.model = model;
        this.isMove = false;
        this.inTank = inTank;
        this.engine = engine;
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isMove() {
        return isMove;
    }

    public void setMove(boolean move) {
        isMove = move;
    }

    public int getInTank() {
        return inTank;
    }

    public void setInTank(int inTank) {
        this.inTank = inTank;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(ArrayList<Wheel> wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        this.isMove = true;
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        this.isMove = false;
        System.out.println("Car stopped");
    }

    @Override
    public void fillUp(int liters) {
        this.inTank += liters;
        System.out.println("In tank = " + this.inTank);
    }

    @Override
    public void changeWheel(Wheel wheel, int num) {
        if (isMove) {
            System.out.println("Stop to change the wheel");
        } else {
            wheels.set(num, wheel);
            System.out.println("Wheel number " + num + " was changed");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return isMove == car.isMove &&
                inTank == car.inTank &&
                Objects.equals(model, car.model) &&
                Objects.equals(engine, car.engine) &&
                Objects.equals(wheels, car.wheels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, isMove, inTank, engine, wheels);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", isMove=" + isMove +
                ", inTank=" + inTank +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }
}
