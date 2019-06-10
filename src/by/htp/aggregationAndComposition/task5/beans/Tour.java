package by.htp.aggregationAndComposition.task5.beans;

import java.util.Objects;

public class Tour {
    private TourName tourName;
    private int price;
    private Transport transport;
    private boolean food;
    private int numberOfDays;

    public Tour(TourName tourName, int price, Transport transport, boolean food, int numberOfDays) {
        this.tourName = tourName;
        this.price = price;
        this.transport = transport;
        this.food = food;
        this.numberOfDays = numberOfDays;
    }

    public TourName getTourName() {
        return tourName;
    }

    public void setTourName(TourName tourName) {
        this.tourName = tourName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return price == tour.price &&
                food == tour.food &&
                numberOfDays == tour.numberOfDays &&
                tourName == tour.tourName &&
                transport == tour.transport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tourName, price, transport, food, numberOfDays);
    }

    @Override
    public String toString() {
        return "Tour{" +
                "tourName=" + tourName +
                ", price=" + price +
                ", transport=" + transport +
                ", food=" + food +
                ", numberOfDays=" + numberOfDays +
                '}';
    }
}
