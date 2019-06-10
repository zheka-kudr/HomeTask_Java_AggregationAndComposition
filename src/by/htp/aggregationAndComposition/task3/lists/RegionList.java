package by.htp.aggregationAndComposition.task3.lists;

import by.htp.aggregationAndComposition.task3.beans.Region;

import java.util.ArrayList;
import java.util.List;

public class RegionList {
    private List<Region> regions;

    public RegionList() {
        this.regions = new ArrayList<>();
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public void addRegion(Region region) {
        this.regions.add(region);
    }

    public void removeRegion(Region region) {
        this.regions.remove(region);
    }
}
