package by.htp.aggregationAndComposition.task3.beans;

import java.util.Objects;

public class City {
    private String cityName;
    private Area area;
    private Region region;
    private boolean isCapital;
    private boolean isRegionalCenter;
    private double population;

    public City(String cityName, Area area, Region region, boolean isCapital, boolean isRegionalCenter, double population) {
        this.cityName = cityName;
        this.area = area;
        this.region = region;
        this.isCapital = isCapital;
        this.isRegionalCenter = isRegionalCenter;
        this.population = population;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public boolean isRegionalCenter() {
        return isRegionalCenter;
    }

    public void setRegionalCenter(boolean regionalCenter) {
        isRegionalCenter = regionalCenter;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return isCapital == city.isCapital &&
                isRegionalCenter == city.isRegionalCenter &&
                Double.compare(city.population, population) == 0 &&
                Objects.equals(cityName, city.cityName) &&
                Objects.equals(area, city.area) &&
                Objects.equals(region, city.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName, area, region, isCapital, isRegionalCenter, population);
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", area=" + area +
                ", region=" + region +
                ", isCapital=" + isCapital +
                ", isRegionalCenter=" + isRegionalCenter +
                ", population=" + population +
                '}' + "\n";
    }
}
