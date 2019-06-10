package by.htp.aggregationAndComposition.task3.beans;

import java.util.Objects;

public class Area {
    private String areaName;
    private double areaAquare;
    private double areaPopulation;

    public Area(String areaName, double areaAquare, double areaPopulation) {
        this.areaName = areaName;
        this.areaAquare = areaAquare;
        this.areaPopulation = areaPopulation;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public double getAreaAquare() {
        return areaAquare;
    }

    public void setAreaAquare(double areaAquare) {
        this.areaAquare = areaAquare;
    }

    public double getAreaPopulation() {
        return areaPopulation;
    }

    public void setAreaPopulation(double areaPopulation) {
        this.areaPopulation = areaPopulation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Area area = (Area) o;
        return Double.compare(area.areaAquare, areaAquare) == 0 &&
                Double.compare(area.areaPopulation, areaPopulation) == 0 &&
                Objects.equals(areaName, area.areaName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaName, areaAquare, areaPopulation);
    }

    @Override
    public String toString() {
        return "Area{" +
                "areaName='" + areaName + '\'' +
                ", areaAquare=" + areaAquare +
                ", areaPopulation=" + areaPopulation +
                '}';
    }
}
