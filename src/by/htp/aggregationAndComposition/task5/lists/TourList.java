package by.htp.aggregationAndComposition.task5.lists;

import by.htp.aggregationAndComposition.task5.beans.Tour;

import java.util.ArrayList;
import java.util.List;

public class TourList {
    private List<Tour> tours;

    public TourList() {
        this.tours = new ArrayList<>();
    }

    public List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }

    public void addTour(Tour tour) {
        this.tours.add(tour);
    }

    public void removeTour(Tour tour) {
        this.tours.remove(tour);
    }

    @Override
    public String toString() {
        return "TourList{" +
                "tours=" + tours +
                '}';
    }
}
