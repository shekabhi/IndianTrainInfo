package com.abhishek.com.TrainInfo.model.pnrstatus;

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
        "no",
        "booking_status",
        "current_status"
})
public class Passenger {

    @JsonProperty("no")
    private Integer no;
    @JsonProperty("booking_status")
    private String bookingStatus;
    @JsonProperty("current_status")
    private String currentStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("no")
    public Integer getNo() {
        return no;
    }

    @JsonProperty("no")
    public void setNo(Integer no) {
        this.no = no;
    }

    @JsonProperty("booking_status")
    public String getBookingStatus() {
        return bookingStatus;
    }

    @JsonProperty("booking_status")
    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    @JsonProperty("current_status")
    public String getCurrentStatus() {
        return currentStatus;
    }

    @JsonProperty("current_status")
    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
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
