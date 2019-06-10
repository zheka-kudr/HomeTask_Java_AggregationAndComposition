package by.htp.aggregationAndComposition.task3;

import by.htp.aggregationAndComposition.task3.beans.Area;
import by.htp.aggregationAndComposition.task3.beans.City;
import by.htp.aggregationAndComposition.task3.beans.Region;
import by.htp.aggregationAndComposition.task3.beans.State;
import by.htp.aggregationAndComposition.task3.lists.AreaList;
import by.htp.aggregationAndComposition.task3.lists.CityList;
import by.htp.aggregationAndComposition.task3.lists.RegionList;
import by.htp.aggregationAndComposition.task3.logic.StateLogic;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaList areaList = new AreaList();
        Area minskArea = new Area("Minskiy",1902.66,215404);
        Area grodnoArea = new Area("Grodnenskiy",2594.05,49803);
        areaList.addArea(minskArea);
        areaList.addArea(grodnoArea);

        RegionList regionList = new RegionList();
        Region minskRegion = new Region("Minskaya",39854,1426525);
        Region grodnoRegion = new Region("Grodnenskaya",25127,1043681);
        regionList.addRegion(minskRegion);
        regionList.addRegion(grodnoRegion);

        CityList cityList = new CityList();
        City minsk = new City("Minsk",minskArea,minskRegion,true,true,2645500);
        City grodno = new City("Grodno",grodnoArea,grodnoRegion,false,true,373547);
        cityList.addCity(minsk);
        cityList.addCity(grodno);


        State belarus = new State("Belarus",207600,9475174,regionList,areaList,cityList);
        StateLogic stateLogic = new StateLogic();
        City capital = stateLogic.getCapital(belarus);
        System.out.println(capital);
        System.out.println(stateLogic.getRegionNumber(belarus));
        System.out.println(belarus.getStateSquare());
        List<City> regionalCenters;
        regionalCenters = stateLogic.getRegionalCenters(belarus);
        System.out.println(regionalCenters);
    }
}
