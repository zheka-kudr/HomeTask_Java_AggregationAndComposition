package by.htp.aggregationAndComposition.task5.logic;

import by.htp.aggregationAndComposition.task5.lists.TourList;
import by.htp.aggregationAndComposition.task5.beans.TourName;
import by.htp.aggregationAndComposition.task5.beans.Tour;
import by.htp.aggregationAndComposition.task5.beans.Transport;

import java.util.ArrayList;
import java.util.List;

public class TourLogic {

    public List<Tour> findByTransport(TourList tourList, Transport transport){
        List<Tour> tours;
        ArrayList<Tour> tourTransport = new ArrayList<>();
        tours = tourList.getTours();
        if (tours.isEmpty()) {
            return null;
        } else {
            for (Tour tour : tours) {
                if (tour.getTransport().equals(transport)) {
                    tourTransport.add(tour);
                }
            }
        }
        return tourTransport;
    }

    public List<Tour> findByFood(TourList tourList,boolean food){
        List<Tour> tours;
        ArrayList<Tour> tourFood = new ArrayList<>();
        tours = tourList.getTours();
        if (tours.isEmpty()) {
            return null;
        } else {
            for (Tour tour : tours) {
                if (tour.isFood()==food) {
                    tourFood.add(tour);
                }
            }
        }
        return tourFood;
    }

    public List<Tour> findByName(TourList tourList, TourName tourName){
        List<Tour> tours;
        ArrayList<Tour> tourFood = new ArrayList<>();
        tours = tourList.getTours();
        if (tours.isEmpty()) {
            return null;
        } else {
            for (Tour tour : tours) {
                if (tour.getTourName().equals(tourName)) {
                    tourFood.add(tour);
                }
            }
        }
        return tourFood;
    }

    public List<Tour> findByNumberOfDays(TourList tourList,int min,int max){
        List<Tour> tours;
        ArrayList<Tour> tourDays = new ArrayList<>();
        tours = tourList.getTours();
        if (tours.isEmpty()) {
            return null;
        } else {
            for (Tour tour : tours) {
                if (tour.getNumberOfDays()>min && tour.getNumberOfDays()<max) {
                    tourDays.add(tour);
                }
            }
        }
        return tourDays;
    }
}
