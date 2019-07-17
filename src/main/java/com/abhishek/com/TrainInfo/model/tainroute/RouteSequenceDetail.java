package com.abhishek.com.TrainInfo.model.tainroute;

public class RouteSequenceDetail {

    private String schdep ;
    private Double distance ;
    private String stationname ;
    private String scharr ;
    private Integer number ;

    public RouteSequenceDetail() {
    }

    public RouteSequenceDetail(String schdep, Double distance, String stationname, String scharr, Integer number) {
        this.schdep = schdep;
        this.distance = distance;
        this.stationname = stationname;
        this.scharr = scharr;
        this.number = number;
    }

    public String getSchdep() {
        return schdep;
    }

    public void setSchdep(String schdep) {
        this.schdep = schdep;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
    }

    public String getScharr() {
        return scharr;
    }

    public void setScharr(String scharr) {
        this.scharr = scharr;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "RouteSequenceDetail{" +
                "schdep='" + schdep + '\'' +
                ", distance=" + distance +
                ", stationname='" + stationname + '\'' +
                ", scharr='" + scharr + '\'' +
                ", number=" + number +
                '}';
    }
}
