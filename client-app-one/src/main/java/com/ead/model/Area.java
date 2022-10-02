package com.ead.model;

public class Area {

    private String areaId;
    private String areaName;

    public Area() {
    }

    public Area(String areaId, String areaName) {
        this.areaId = areaId;
        this.areaName = areaName;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
}