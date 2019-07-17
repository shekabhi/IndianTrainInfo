package com.abhishek.com.TrainInfo.model.seatavailability;

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
        "response_code",
        "availability",
        "from_station",
        "journey_class",
        "quota",
        "to_station",
        "train",
        "debit"
})
public class SeatAvailabilityInfo {

    @JsonProperty("response_code")
    private Integer responseCode;
    @JsonProperty("availability")
    private List<Availability> availability = null;
    @JsonProperty("from_station")
    private FromStation fromStation;
    @JsonProperty("journey_class")
    private JourneyClass journeyClass;
    @JsonProperty("quota")
    private Quota quota;
    @JsonProperty("to_station")
    private ToStation toStation;
    @JsonProperty("train")
    private Train train;
    @JsonProperty("debit")
    private Integer debit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("response_code")
    public Integer getResponseCode() {
        return responseCode;
    }

    @JsonProperty("response_code")
    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    @JsonProperty("availability")
    public List<Availability> getAvailability() {
        return availability;
    }

    @JsonProperty("availability")
    public void setAvailability(List<Availability> availability) {
        this.availability = availability;
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

    @JsonProperty("quota")
    public Quota getQuota() {
        return quota;
    }

    @JsonProperty("quota")
    public void setQuota(Quota quota) {
        this.quota = quota;
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

    @JsonProperty("debit")
    public Integer getDebit() {
        return debit;
    }

    @JsonProperty("debit")
    public void setDebit(Integer debit) {
        this.debit = debit;
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
