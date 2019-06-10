package by.htp.aggregationAndComposition.task2;

import java.util.ArrayList;

public class TestCar {
    public static void main(String[] args) {
        ArrayList<Wheel> wheels = new ArrayList<>();
        Wheel wheel1 = new Wheel(14);
        Wheel wheel2 = new Wheel(14);
        Wheel wheel3 = new Wheel(14);
        Wheel wheel4 = new Wheel(14);
        wheels.add(wheel1);
        wheels.add(wheel2);
        wheels.add(wheel3);
        wheels.add(wheel4);

        Engine engine = new Engine(250, 120, 80000);

        Car car = new Car("Geely", 10, engine, wheels);

        System.out.println(car.getModel());
        System.out.println(car.getInTank());
        car.fillUp(15);
        System.out.println(car.getInTank());

        car.drive();
        System.out.println(car.isMove());

        Wheel wheel = new Wheel(15);
        car.changeWheel(wheel, 3);
        car.stop();
        car.changeWheel(wheel, 2);
        System.out.println(car.getWheels());
        System.out.println(car.getEngine());
        System.out.println(car);
    }
}
