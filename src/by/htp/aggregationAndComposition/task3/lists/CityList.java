package by.htp.aggregationAndComposition.task3.lists;

import by.htp.aggregationAndComposition.task3.beans.City;

import java.util.ArrayList;
import java.util.List;

public class CityList {
    private List<City> cities;

    public CityList() {
        this.cities = new ArrayList<>();
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public void addCity(City city) {
        this.cities.add(city);
    }

    public void removeCity(City city) {
        this.cities.remove(city);
    }
}
