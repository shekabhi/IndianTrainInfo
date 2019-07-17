package com.abhishek.com.TrainInfo.model.livetrainstatus;

public class TrainFilterData {

    private String trainNo  ;
    private String trainName ;
    private String position ;

    public TrainFilterData() {
    }

    public TrainFilterData(String trainNo, String trainName, String position) {
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.position = position;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "TrainFilterData{" +
                "trainNo='" + trainNo + '\'' +
                ", trainName='" + trainName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
