package by.htp.aggregationAndComposition.task2;

import java.util.Objects;

public class Engine {
    private int capacity;
    private int power;
    private int mileage;

    public Engine(int capacity, int power, int mileage) {
        this.capacity = capacity;
        this.power = power;
        this.mileage = mileage;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0;
        }
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power > 0) {
            this.power = power;
        } else {
            this.power = 80;
        }
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        if (mileage > 0) {
            this.mileage = mileage;
        } else {
            this.mileage = 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return capacity == engine.capacity &&
                power == engine.power &&
                mileage == engine.mileage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, power, mileage);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "capacity=" + capacity +
                ", power=" + power +
                ", mileage=" + mileage +
                '}';
    }
}
