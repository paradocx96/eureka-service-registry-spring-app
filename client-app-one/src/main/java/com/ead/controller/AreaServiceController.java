package com.ead.controller;

import com.ead.model.*;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/areas")
public class AreaServiceController {

    private static Map<String, List<Area>> areaMap;

    static {
        areaMap = new HashMap<>();
        List<Area> areaList;

        areaList = new ArrayList<>();
        areaList.add(new Area("COL", "Colombo"));
        areaList.add(new Area("KDY", "Kandy"));
        areaList.add(new Area("GAL", "Galle"));
        areaMap.put("LK", areaList);

        areaList = new ArrayList<>();
        areaList.add(new Area("TKU", "Turku"));
        areaList.add(new Area("HEL", "Helsinki"));
        areaList.add(new Area("LAP", "Lapland"));
        areaMap.put("FI", areaList);

        areaList = new ArrayList<>();
        areaList.add(new Area("LKP", "Linkoping"));
        areaList.add(new Area("STK", "Stockholm"));
        areaList.add(new Area("GTB", "Gothenburg"));
        areaMap.put("SE", areaList);
    }

    @RequestMapping("/{countryId}")
    public AreaList getAreasOfCountry(@PathVariable("countryId") String countryId) {

        List<Area> areas = areaMap.get(countryId);
        AreaList areaList = new AreaList(areas);
        return areaList;
    }
}