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
        "scharr_date",
        "latemin",
        "has_departed",
        "schdep",
        "actarr",
        "scharr",
        "has_arrived",
        "actarr_date",
        "actdep"
})
public class Status {

    @JsonProperty("scharr_date")
    private String scharrDate;
    @JsonProperty("latemin")
    private Integer latemin;
    @JsonProperty("has_departed")
    private Boolean hasDeparted;
    @JsonProperty("schdep")
    private String schdep;
    @JsonProperty("actarr")
    private String actarr;
    @JsonProperty("scharr")
    private String scharr;
    @JsonProperty("has_arrived")
    private Boolean hasArrived;
    @JsonProperty("actarr_date")
    private String actarrDate;
    @JsonProperty("actdep")
    private String actdep;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scharr_date")
    public String getScharrDate() {
        return scharrDate;
    }

    @JsonProperty("scharr_date")
    public void setScharrDate(String scharrDate) {
        this.scharrDate = scharrDate;
    }

    @JsonProperty("latemin")
    public Integer getLatemin() {
        return latemin;
    }

    @JsonProperty("latemin")
    public void setLatemin(Integer latemin) {
        this.latemin = latemin;
    }

    @JsonProperty("has_departed")
    public Boolean getHasDeparted() {
        return hasDeparted;
    }

    @JsonProperty("has_departed")
    public void setHasDeparted(Boolean hasDeparted) {
        this.hasDeparted = hasDeparted;
    }

    @JsonProperty("schdep")
    public String getSchdep() {
        return schdep;
    }

    @JsonProperty("schdep")
    public void setSchdep(String schdep) {
        this.schdep = schdep;
    }

    @JsonProperty("actarr")
    public String getActarr() {
        return actarr;
    }

    @JsonProperty("actarr")
    public void setActarr(String actarr) {
        this.actarr = actarr;
    }

    @JsonProperty("scharr")
    public String getScharr() {
        return scharr;
    }

    @JsonProperty("scharr")
    public void setScharr(String scharr) {
        this.scharr = scharr;
    }

    @JsonProperty("has_arrived")
    public Boolean getHasArrived() {
        return hasArrived;
    }

    @JsonProperty("has_arrived")
    public void setHasArrived(Boolean hasArrived) {
        this.hasArrived = hasArrived;
    }

    @JsonProperty("actarr_date")
    public String getActarrDate() {
        return actarrDate;
    }

    @JsonProperty("actarr_date")
    public void setActarrDate(String actarrDate) {
        this.actarrDate = actarrDate;
    }

    @JsonProperty("actdep")
    public String getActdep() {
        return actdep;
    }

    @JsonProperty("actdep")
    public void setActdep(String actdep) {
        this.actdep = actdep;
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