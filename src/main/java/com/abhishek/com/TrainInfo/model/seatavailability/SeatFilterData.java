package com.abhishek.com.TrainInfo.model.seatavailability;

public class SeatFilterData {

    private String availability ;
    private String date ;
    private String journeyClass ;
    private String trainNumber ;
    private String trainName ;
    private String fromStation ;
    private String toStation ;
    private String quota ;

    public SeatFilterData() {
    }

    public SeatFilterData(String availability, String date, String journeyClass, String trainNumber, String trainName, String fromStation, String toStation, String quota) {
        this.availability = availability;
        this.date = date;
        this.journeyClass = journeyClass;
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.fromStation = fromStation;
        this.toStation = toStation;
        this.quota = quota;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getJourneyClass() {
        return journeyClass;
    }

    public void setJourneyClass(String journeyClass) {
        this.journeyClass = journeyClass;
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

    public String getFromStation() {
        return fromStation;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }

    public String getToStation() {
        return toStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation;
    }

    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    @Override
    public String toString() {
        return "SeatFilterData{" +
                "availability='" + availability + '\'' +
                ", date='" + date + '\'' +
                ", journeyClass='" + journeyClass + '\'' +
                ", trainNumber='" + trainNumber + '\'' +
                ", trainName='" + trainName + '\'' +
                ", fromStation='" + fromStation + '\'' +
                ", toStation='" + toStation + '\'' +
                ", quota='" + quota + '\'' +
                '}';
    }
}
