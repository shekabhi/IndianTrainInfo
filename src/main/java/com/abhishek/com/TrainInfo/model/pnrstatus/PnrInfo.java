package com.abhishek.com.TrainInfo.model.pnrstatus;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "debit",
        "from_station",
        "journey_class",
        "boarding_point",
        "reservation_upto",
        "to_station",
        "train",
        "pnr",
        "passengers",
        "total_passengers",
        "chart_prepared",
        "doj",
        "response_code"
})
public class PnrInfo {

    @JsonProperty("debit")
    private Integer debit;
    @JsonProperty("from_station")
    private FromStation fromStation;
    @JsonProperty("journey_class")
    private JourneyClass journeyClass;
    @JsonProperty("boarding_point")
    private BoardingPoint boardingPoint;
    @JsonProperty("reservation_upto")
    private ReservationUpto reservationUpto;
    @JsonProperty("to_station")
    private ToStation toStation;
    @JsonProperty("train")
    private Train train;
    @JsonProperty("pnr")
    private String pnr;
    @JsonProperty("passengers")
    private List<Passenger> passengers = null;
    @JsonProperty("total_passengers")
    private Integer totalPassengers;
    @JsonProperty("chart_prepared")
    private Boolean chartPrepared;
    @JsonProperty("doj")
    private String doj;
    @JsonProperty("response_code")
    private Integer responseCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("debit")
    public Integer getDebit() {
        return debit;
    }

    @JsonProperty("debit")
    public void setDebit(Integer debit) {
        this.debit = debit;
    }

    @JsonProperty("from_station")
    public FromStation getFromStation() {
        return fromStation;
    }

    @JsonProperty("from_station")
    public void setFromStation(FromStation fromStation) {
        this.fromStation = fromStation;
    }

    @JsonProperty("journey_class")
    public JourneyClass getJourneyClass() {
        return journeyClass;
    }

    @JsonProperty("journey_class")
    public void setJourneyClass(JourneyClass journeyClass) {
        this.journeyClass = journeyClass;
    }

    @JsonProperty("boarding_point")
    public BoardingPoint getBoardingPoint() {
        return boardingPoint;
    }

    @JsonProperty("boarding_point")
    public void setBoardingPoint(BoardingPoint boardingPoint) {
        this.boardingPoint = boardingPoint;
    }

    @JsonProperty("reservation_upto")
    public ReservationUpto getReservationUpto() {
        return reservationUpto;
    }

    @JsonProperty("reservation_upto")
    public void setReservationUpto(ReservationUpto reservationUpto) {
        this.reservationUpto = reservationUpto;
    }

    @JsonProperty("to_station")
    public ToStation getToStation() {
        return toStation;
    }

    @JsonProperty("to_station")
    public void setToStation(ToStation toStation) {
        this.toStation = toStation;
    }

    @JsonProperty("train")
    public Train getTrain() {
        return train;
    }

    @JsonProperty("train")
    public void setTrain(Train train) {
        this.train = train;
    }

    @JsonProperty("pnr")
    public String getPnr() {
        return pnr;
    }

    @JsonProperty("pnr")
    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    @JsonProperty("passengers")
    public List<Passenger> getPassengers() {
        return passengers;
    }

    @JsonProperty("passengers")
    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    @JsonProperty("total_passengers")
    public Integer getTotalPassengers() {
        return totalPassengers;
    }

    @JsonProperty("total_passengers")
    public void setTotalPassengers(Integer totalPassengers) {
        this.totalPassengers = totalPassengers;
    }

    @JsonProperty("chart_prepared")
    public Boolean getChartPrepared() {
        return chartPrepared;
    }

    @JsonProperty("chart_prepared")
    public void setChartPrepared(Boolean chartPrepared) {
        this.chartPrepared = chartPrepared;
    }

    @JsonProperty("doj")
    public String getDoj() {
        return doj;
    }

    @JsonProperty("doj")
    public void setDoj(String doj) {
        this.doj = doj;
    }

    @JsonProperty("response_code")
    public Integer getResponseCode() {
        return responseCode;
    }

    @JsonProperty("response_code")
    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
