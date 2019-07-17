package com.abhishek.com.TrainInfo.dao;

import com.abhishek.com.TrainInfo.model.livetrainstatus.TrainFilterData;
import com.abhishek.com.TrainInfo.model.livetrainstatus.TrainInfo;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DaoLiveTrainStatus {



    public static TrainFilterData LiveTraininfodetail(String url){

        RestTemplate restTemplate = new RestTemplate();
        TrainInfo trainInfo = restTemplate.getForObject(url, TrainInfo.class);


        TrainFilterData trainFilterData = new TrainFilterData() ;

        trainFilterData.setTrainNo(trainInfo.getTrain().getNumber());
        trainFilterData.setTrainName(trainInfo.getTrain().getName());
        trainFilterData.setPosition(trainInfo.getPosition());

       // System.out.println(trainFilterData);

        return trainFilterData ;

    }


}
