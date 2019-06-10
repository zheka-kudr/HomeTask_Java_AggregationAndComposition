package by.htp.aggregationAndComposition.task3.lists;

import by.htp.aggregationAndComposition.task3.beans.Area;

import java.util.ArrayList;
import java.util.List;

public class AreaList {
    private List<Area> areas;

    public AreaList() {
        this.areas = new ArrayList<>();
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    public void addArea(Area area) {
        this.areas.add(area);
    }

    public void removeArea(Area area) {
        this.areas.remove(area);
    }
}
