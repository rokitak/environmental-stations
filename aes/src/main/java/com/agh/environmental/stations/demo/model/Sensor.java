package com.agh.environmental.stations.demo.model;

public class Sensor {
    Long id;
    Long stationId;
    Param param;

    public Long getId() {
        return id;
    }

    public void setId(Long pId) {
        id = pId;
    }

    public Long getStationId() {
        return stationId;
    }

    public void setStationId(Long pStationId) {
        stationId = pStationId;
    }

    public Param getParam() {
        return param;
    }

    public void setParam(Param pParam) {
        param = pParam;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "id=" + id +
                ", stationId=" + stationId +
                ", param=" + param +
                '}';
    }
}
