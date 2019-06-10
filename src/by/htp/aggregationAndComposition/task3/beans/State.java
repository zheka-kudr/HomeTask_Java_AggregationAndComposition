package by.htp.aggregationAndComposition.task3.beans;

import by.htp.aggregationAndComposition.task3.lists.AreaList;
import by.htp.aggregationAndComposition.task3.lists.CityList;
import by.htp.aggregationAndComposition.task3.lists.RegionList;

import java.util.Objects;

public class State {
    private String stateName;
    private double stateSquare;
    private double statePopulation;
    private RegionList regionList;
    private AreaList areaList;
    private CityList cityList;

    public State(String stateName, double stateSquare, double statePopulation, RegionList regionList, AreaList areaList, CityList cityList) {
        this.stateName = stateName;
        this.stateSquare = stateSquare;
        this.statePopulation = statePopulation;
        this.regionList = regionList;
        this.areaList = areaList;
        this.cityList = cityList;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public double getStateSquare() {
        return stateSquare;
    }

    public void setStateSquare(double stateSquare) {
        this.stateSquare = stateSquare;
    }

    public double getStatePopulation() {
        return statePopulation;
    }

    public void setStatePopulation(double statePopulation) {
        this.statePopulation = statePopulation;
    }

    public RegionList getRegionList() {
        return regionList;
    }

    public void setRegionList(RegionList regionList) {
        this.regionList = regionList;
    }

    public AreaList getAreaList() {
        return areaList;
    }

    public void setAreaList(AreaList areaList) {
        this.areaList = areaList;
    }

    public CityList getCityList() {
        return cityList;
    }

    public void setCityList(CityList cityList) {
        this.cityList = cityList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return Double.compare(state.stateSquare, stateSquare) == 0 &&
                Double.compare(state.statePopulation, statePopulation) == 0 &&
                Objects.equals(stateName, state.stateName) &&
                Objects.equals(regionList, state.regionList) &&
                Objects.equals(areaList, state.areaList) &&
                Objects.equals(cityList, state.cityList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stateName, stateSquare, statePopulation, regionList, areaList, cityList);
    }

    @Override
    public String toString() {
        return "State{" +
                "stateName='" + stateName + '\'' +
                ", stateSquare=" + stateSquare +
                ", statePopulation=" + statePopulation +
                ", regionList=" + regionList +
                ", areaList=" + areaList +
                ", cityList=" + cityList +
                '}';
    }
}
