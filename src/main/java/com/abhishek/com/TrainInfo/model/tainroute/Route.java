package com.abhishek.com.TrainInfo.model.tainroute;

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
        "schdep",
        "distance",
        "day",
        "station",
        "scharr",
        "no",
        "halt"
})
public class Route {

    @JsonProperty("schdep")
    private String schdep;
    @JsonProperty("distance")
    private Double distance;
    @JsonProperty("day")
    private Integer day;
    @JsonProperty("station")
    private Station station;
    @JsonProperty("scharr")
    private String scharr;
    @JsonProperty("no")
    private Integer no;
    @JsonProperty("halt")
    private Integer halt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("schdep")
    public String getSchdep() {
        return schdep;
    }

    @JsonProperty("schdep")
    public void setSchdep(String schdep) {
        this.schdep = schdep;
    }

    @JsonProperty("distance")
    public Double getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @JsonProperty("day")
    public Integer getDay() {
        return day;
    }

    @JsonProperty("day")
    public void setDay(Integer day) {
        this.day = day;
    }

    @JsonProperty("station")
    public Station getStation() {
        return station;
    }

    @JsonProperty("station")
    public void setStation(Station station) {
        this.station = station;
    }

    @JsonProperty("scharr")
    public String getScharr() {
        return scharr;
    }

    @JsonProperty("scharr")
    public void setScharr(String scharr) {
        this.scharr = scharr;
    }

    @JsonProperty("no")
    public Integer getNo() {
        return no;
    }

    @JsonProperty("no")
    public void setNo(Integer no) {
        this.no = no;
    }

    @JsonProperty("halt")
    public Integer getHalt() {
        return halt;
    }

    @JsonProperty("halt")
    public void setHalt(Integer halt) {
        this.halt = halt;
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