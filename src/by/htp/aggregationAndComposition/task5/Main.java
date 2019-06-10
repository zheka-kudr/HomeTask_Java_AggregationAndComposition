package by.htp.aggregationAndComposition.task5;

import by.htp.aggregationAndComposition.task5.beans.Tour;
import by.htp.aggregationAndComposition.task5.beans.TourName;
import by.htp.aggregationAndComposition.task5.beans.Transport;
import by.htp.aggregationAndComposition.task5.lists.TourList;
import by.htp.aggregationAndComposition.task5.logic.TourLogic;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tour tour1 = new Tour(TourName.cruise,180, Transport.bus,true,18);
        Tour tour2 = new Tour(TourName.rest,560,Transport.plane,true,12);

        TourList tourList = new TourList();
        tourList.addTour(tour1);
        tourList.addTour(tour2);

        TourLogic tourLogic = new TourLogic();
        List<Tour> busTour = tourLogic.findByTransport(tourList,Transport.bus);
        List<Tour> foodTour = tourLogic.findByFood(tourList,true);
        List<Tour> cruiseTour = tourLogic.findByName(tourList,TourName.cruise);
        List<Tour> numberOfDaysTour = tourLogic.findByNumberOfDays(tourList,10,16);

        System.out.println(busTour);
        System.out.println(foodTour);
        System.out.println(cruiseTour);
        System.out.println(numberOfDaysTour);
    }
}
