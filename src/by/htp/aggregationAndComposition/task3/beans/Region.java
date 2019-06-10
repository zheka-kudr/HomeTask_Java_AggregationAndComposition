package by.htp.aggregationAndComposition.task3.beans;

import java.util.Objects;

public class Region {
    private String regionName;
    private double regionSquare;
    private double regionPopulation;

    public Region(String regionName, double regionSquare, double regionPopulation) {
        this.regionName = regionName;
        this.regionSquare = regionSquare;
        this.regionPopulation = regionPopulation;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public double getRegionSquare() {
        return regionSquare;
    }

    public void setRegionSquare(double regionSquare) {
        this.regionSquare = regionSquare;
    }

    public double getRegionPopulation() {
        return regionPopulation;
    }

    public void setRegionPopulation(double regionPopulation) {
        this.regionPopulation = regionPopulation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Double.compare(region.regionSquare, regionSquare) == 0 &&
                Double.compare(region.regionPopulation, regionPopulation) == 0 &&
                Objects.equals(regionName, region.regionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionName, regionSquare, regionPopulation);
    }

    @Override
    public String toString() {
        return "Region{" +
                "regionName='" + regionName + '\'' +
                ", regionSquare=" + regionSquare +
                ", regionPopulation=" + regionPopulation +
                '}';
    }
}
