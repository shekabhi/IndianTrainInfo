package com.abhishek.com.TrainInfo.model.tainroute;

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
        "train",
        "debit",
        "response_code",
        "route"
})
public class RouteInfo {

    @JsonProperty("train")
    private Train train;
    @JsonProperty("debit")
    private Integer debit;
    @JsonProperty("response_code")
    private Integer responseCode;
    @JsonProperty("route")
    private List<Route> route = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonProperty("response_code")
    public Integer getResponseCode() {
        return responseCode;
    }

    @JsonProperty("response_code")
    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    @JsonProperty("route")
    public List<Route> getRoute() {
        return route;
    }

    @JsonProperty("route")
    public void setRoute(List<Route> route) {
        this.route = route;
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