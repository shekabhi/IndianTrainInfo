package com.abhishek.com.TrainInfo.model.livetrainstatus;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status",
        "response_code",
        "train",
        "start_date",
        "station",
        "debit",
        "position"
})
public class TrainInfo {

    @JsonProperty("status")
    private Status status;
    @JsonProperty("response_code")
    private Integer responseCode;
    @JsonProperty("train")
    private Train train;
    @JsonProperty("start_date")
    private String startDate;
    @JsonProperty("station")
    private Station station;
    @JsonProperty("debit")
    private Integer debit;
    @JsonProperty("position")
    private String position;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("response_code")
    public Integer getResponseCode() {
        return responseCode;
    }

    @JsonProperty("response_code")
    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    @JsonProperty("train")
    public Train getTrain() {
        return train;
    }

    @JsonProperty("train")
    public void setTrain(Train train) {
        this.train = train;
    }

    @JsonProperty("start_date")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("station")
    public Station getStation() {
        return station;
    }

    @JsonProperty("station")
    public void setStation(Station station) {
        this.station = station;
    }

    @JsonProperty("debit")
    public Integer getDebit() {
        return debit;
    }

    @JsonProperty("debit")
    public void setDebit(Integer debit) {
        this.debit = debit;
    }

    @JsonProperty("position")
    public String getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(String position) {
        this.position = position;
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
