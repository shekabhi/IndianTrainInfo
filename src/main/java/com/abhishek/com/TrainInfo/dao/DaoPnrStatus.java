package com.abhishek.com.TrainInfo.dao;

import com.abhishek.com.TrainInfo.model.pnrstatus.PnrFilterData;
import com.abhishek.com.TrainInfo.model.pnrstatus.PnrInfo;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class DaoPnrStatus {



    public static PnrFilterData pnrStatus(String url){

        RestTemplate restTemplate = new RestTemplate();
        PnrInfo trainInfo = restTemplate.getForObject(url, PnrInfo.class);

        PnrFilterData pnrFilterData = new PnrFilterData() ;

        pnrFilterData.setTrainNumber(trainInfo.getTrain().getNumber());
        pnrFilterData.setTrainName(trainInfo.getTrain().getName());
        pnrFilterData.setTrainJourneyClass(trainInfo.getJourneyClass().getCode());
        pnrFilterData.setBoardingPoint(trainInfo.getBoardingPoint().getName());
        pnrFilterData.setReservationUpto(trainInfo.getReservationUpto().getName());
        pnrFilterData.setBookingStatus(trainInfo.getPassengers().get(0).getBookingStatus());
        pnrFilterData.setCurrentStatus(trainInfo.getPassengers().get(0).getCurrentStatus());
        pnrFilterData.setDateOfJounery(trainInfo.getDoj());


        return pnrFilterData;

    }
}
