package com.abhishek.com.TrainInfo.dao;

import com.abhishek.com.TrainInfo.model.tainroute.RouteFilterData;
import com.abhishek.com.TrainInfo.model.tainroute.RouteInfo;
import com.abhishek.com.TrainInfo.model.tainroute.RouteSequenceDetail;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
public class DaoTrainRoute {


    public static RouteFilterData routestatus(String pnrurl) {

        RestTemplate restTemplate = new RestTemplate();
        RouteInfo routeInfo = restTemplate.getForObject(pnrurl, RouteInfo.class);

        RouteFilterData routeFilterData = new RouteFilterData() ;

        routeFilterData.setTrainName(routeInfo.getTrain().getName());
        routeFilterData.setTrainNumber(routeInfo.getTrain().getNumber());

        int n= routeInfo.getRoute().size() ;

        List<RouteSequenceDetail> routeSequenceDetails = new ArrayList<>(n) ;


        for(int i=0 ; i<n ; i++){

            RouteSequenceDetail routeSequenceDetail = new RouteSequenceDetail() ;

            routeSequenceDetail.setDistance(routeInfo.getRoute().get(i).getDistance());
            routeSequenceDetail.setNumber(routeInfo.getRoute().get(i).getNo());
            routeSequenceDetail.setScharr(routeInfo.getRoute().get(i).getScharr());
            routeSequenceDetail.setSchdep(routeInfo.getRoute().get(i).getSchdep());
            routeSequenceDetail.setStationname(routeInfo.getRoute().get(i).getStation().getName());

           routeSequenceDetails.add(i ,routeSequenceDetail );

        }

        routeFilterData.setTrainrote(routeSequenceDetails);

        //System.out.println("routeFilterData" +   routeFilterData);

        return routeFilterData ;

    }

}
