package com.abhishek.com.TrainInfo.dao;

import com.abhishek.com.TrainInfo.model.pnrstatus.PnrFilterData;
import com.abhishek.com.TrainInfo.model.pnrstatus.PnrInfo;
import com.abhishek.com.TrainInfo.model.seatavailability.SeatAvailabilityInfo;
import com.abhishek.com.TrainInfo.model.seatavailability.SeatFilterData;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DaoSeatAvailability {


    public static SeatFilterData seatAvailability(String url){

        RestTemplate restTemplate = new RestTemplate();
        SeatAvailabilityInfo seatAvailabilityInfo = restTemplate.getForObject(url, SeatAvailabilityInfo.class);

        SeatFilterData seatFilterData = new SeatFilterData() ;

        seatFilterData.setAvailability(seatAvailabilityInfo.getAvailability().get(0).getStatus());
        seatFilterData.setDate(seatAvailabilityInfo.getAvailability().get(0).getDate());
        seatFilterData.setJourneyClass(seatAvailabilityInfo.getJourneyClass().getCode());
        seatFilterData.setTrainNumber(seatAvailabilityInfo.getTrain().getNumber());
        seatFilterData.setTrainName(seatAvailabilityInfo.getTrain().getName());
        seatFilterData.setFromStation(seatAvailabilityInfo.getFromStation().getName());
        seatFilterData.setToStation(seatAvailabilityInfo.getToStation().getName());
        seatFilterData.setQuota(seatAvailabilityInfo.getQuota().getName());

        return seatFilterData;

    }
}
