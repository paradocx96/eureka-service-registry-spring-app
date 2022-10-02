package com.ead.model;

import java.util.List;

public class AreaList {

    private List<Area> areas;

    public AreaList() {
    }

    public AreaList(List<Area> areas) {
        this.areas = areas;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }
}