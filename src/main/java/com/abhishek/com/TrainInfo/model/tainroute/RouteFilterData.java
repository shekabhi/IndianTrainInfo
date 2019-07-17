package com.abhishek.com.TrainInfo.model.tainroute;

import java.util.List;

public class RouteFilterData {

    private String trainNumber ;
    private String trainName ;
    private List<RouteSequenceDetail> trainrote ;

    public RouteFilterData() {
    }

    public RouteFilterData(String trainNumber, String trainName, List<RouteSequenceDetail> trainrote) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.trainrote = trainrote;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public List<RouteSequenceDetail> getTrainrote() {
        return trainrote;
    }

    public void setTrainrote(List<RouteSequenceDetail> trainrote) {
        this.trainrote = trainrote;
    }

    @Override
    public String toString() {
        return "RouteFilterData{" +
                "trainNumber='" + trainNumber + '\'' +
                ", trainName='" + trainName + '\'' +
                ", trainrote=" + trainrote +
                '}';
    }
}
