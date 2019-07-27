package com.abhishek.com.TrainInfo.controller;

import com.abhishek.com.TrainInfo.dao.DaoLiveTrainStatus;
import com.abhishek.com.TrainInfo.dao.DaoPnrStatus;
import com.abhishek.com.TrainInfo.dao.DaoSeatAvailability;
import com.abhishek.com.TrainInfo.dao.DaoTrainRoute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class MainController {

    
    String apikey = /* Enter Your API Key */ ;

    @Autowired
    DaoLiveTrainStatus daoLiveTrainStatus ;

    @Autowired
    DaoPnrStatus daoPnrStatus ;

    @Autowired
    DaoTrainRoute daoTrainRoute ;

    @Autowired
    DaoSeatAvailability daoSeatAvailability ;

    @RequestMapping(value = "/")
    public String home(){
        return "home";
    }

    @RequestMapping(value = "livetrainstatuspage")
    public String livetrainstatuspage(){
        return "livetrain" ;
    }

    @GetMapping ("/livetrain")
    public String liveTrainStatusInfo(@RequestParam("id") String id , @RequestParam("station") String station ,
                                      @RequestParam("day") String day , @RequestParam("month") String month ,
                                      @RequestParam("year") String year  , ModelMap modelMap){

      //  https://api.railwayapi.com/v2/live/train/12553/station/GKP/date/11-07-2019/apikey/mu7yjmnc4a/
        String baseurl = "https://api.railwayapi.com/v2/live/" ;
        String date = day + "-" + month + "-" + year ;
        String apikey = "mu7yjmnc4a" ;
        String url = baseurl + "train/"+id + "/station/" + station + "/date/" + date + "/apikey/" + apikey +"/" ;

        modelMap.put("livetraininfoes" ,  daoLiveTrainStatus.LiveTraininfodetail(url)) ;

        return "livetrainstatus";
    }

    @GetMapping (value = "/pnrnumber")
    public String pnrstatus(@RequestParam("pnrno") String pnrno , ModelMap modelMap){

        //https://api.railwayapi.com/v2/pnr-status/pnr/<pnr no>/apikey/<apikey>/

        String pnrBaseUrl = "https://api.railwayapi.com/v2/pnr-status/pnr/";

        String pnrurl = pnrBaseUrl + pnrno + "/apikey/" + apikey + "/" ;

        modelMap.put("pnrstatusinfo" ,  daoPnrStatus.pnrStatus(pnrurl));

        return "pnrstatus";
    }

    @GetMapping (value = "/routeinfo")
    public String trainrouteinfo(@RequestParam("trainno") String trainno , ModelMap modelMap){

       // https://api.railwayapi.com/v2/route/train/<train number>/apikey/<apikey>/

        String routeBaseUrl = "https://api.railwayapi.com/v2/route/train/";

        String routeurl = routeBaseUrl + trainno + "/apikey/" + apikey + "/" ;

        modelMap.put("trainroutestatus" , daoTrainRoute.routestatus(routeurl));

        return "trainroute";
    }

    @RequestMapping(value = "seatavailabilitypage")
    public String seatavailabilitypage(){
        return "seatavailability" ;
    }

    @GetMapping (value = "/seatavailinfo")
    public String seatavailabilityinfo(@RequestParam("trainno") String trainno ,@RequestParam("soucode") String soucode ,
            @RequestParam("descode") String descode ,@RequestParam("date") String date ,
                    @RequestParam("trainclass") String trainclass, @RequestParam("quota") String quota,
                                       ModelMap modelMap){

        // https://api.railwayapi.com/v2/check-seat/train/<train number>/source/<stn code>/dest/<dest code>
        // /date/<dd-mm-yyyy>/pref/<class code>/quota/<quota code>/apikey/<apikey>/

        // date formate changing mm/dd/yyyy  -> dd-mm-yyy
        Date myDate = new Date(date);
        System.out.println(myDate);

        SimpleDateFormat dmyFormat = new SimpleDateFormat("dd-MM-yyyy");

        // Format the date to Strings
        String dmydate = dmyFormat.format(myDate);



        String routeBaseUrl = "https://api.railwayapi.com/v2/check-seat/train/";

        String availabilityUrl = routeBaseUrl + trainno + "/source/" + soucode+ "/dest/"+ descode + "/date/" + dmydate + "/pref/" +
                trainclass + "/quota/" + quota + "/apikey/" + apikey + "/" ;

        //System.out.println(availabilityUrl);

        modelMap.put("seatavailability" , daoSeatAvailability.seatAvailability(availabilityUrl));

        return "seatavailabilityinfo";
    }


}
