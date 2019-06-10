package by.htp.aggregationAndComposition.task3.logic;

import by.htp.aggregationAndComposition.task3.beans.City;
import by.htp.aggregationAndComposition.task3.beans.State;

import java.util.ArrayList;
import java.util.List;

public class StateLogic {
    public City getCapital(State state) {
        List<City> cities;
        cities = state.getCityList().getCities();
        if (cities.isEmpty()) {
            return null;
        } else {
            for (City city : cities) {
                if (city.isCapital()) {
                    return city;
                }
            }
        }
        return null;
    }

    public int getRegionNumber(State state) {
        return state.getRegionList().getRegions().size();
    }

    public ArrayList<City> getRegionalCenters(State state) {
        List<City> cities;
        ArrayList<City> regionalCenters = new ArrayList<>();
        cities = state.getCityList().getCities();
        if (cities.isEmpty()) {
            return null;
        } else {
            for (City city : cities) {
                if (city.isRegionalCenter()) {
                    regionalCenters.add(city);
                }
            }
        }
        return regionalCenters;
    }
}
