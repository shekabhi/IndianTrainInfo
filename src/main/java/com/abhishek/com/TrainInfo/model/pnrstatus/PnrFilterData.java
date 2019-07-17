package com.abhishek.com.TrainInfo.model.pnrstatus;

public class PnrFilterData {

    private  String trainNumber ;
    private  String trainName ;
    private  String trainJourneyClass ;
    private  String boardingPoint ;
    private  String reservationUpto ;
    private  String bookingStatus ;
    private  String currentStatus ;
    private  String dateOfJounery ;

    public PnrFilterData() {
    }

    public PnrFilterData(String trainNumber, String trainName, String trainJourneyClass, String boardingPoint, String reservationUpto, String bookingStatus, String currentStatus, String dateOfJounery) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.trainJourneyClass = trainJourneyClass;
        this.boardingPoint = boardingPoint;
        this.reservationUpto = reservationUpto;
        this.bookingStatus = bookingStatus;
        this.currentStatus = currentStatus;
        this.dateOfJounery = dateOfJounery;
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

    public String getTrainJourneyClass() {
        return trainJourneyClass;
    }

    public void setTrainJourneyClass(String trainJourneyClass) {
        this.trainJourneyClass = trainJourneyClass;
    }

    public String getBoardingPoint() {
        return boardingPoint;
    }

    public void setBoardingPoint(String boardingPoint) {
        this.boardingPoint = boardingPoint;
    }

    public String getReservationUpto() {
        return reservationUpto;
    }

    public void setReservationUpto(String reservationUpto) {
        this.reservationUpto = reservationUpto;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getDateOfJounery() {
        return dateOfJounery;
    }

    public void setDateOfJounery(String dateOfJounery) {
        this.dateOfJounery = dateOfJounery;
    }


}
