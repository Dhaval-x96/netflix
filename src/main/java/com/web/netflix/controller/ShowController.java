package com.web.netflix.controller;

import com.web.netflix.Service.ShowService;
import com.web.netflix.config.Constants;
import com.web.netflix.json.NetflixTitlePageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1")
public class ShowController{

    @Autowired
    @Qualifier(Constants.SHOW_NETFLIX_TITLE_SESSION_FACTORY)
    private ShowService showService;

    @GetMapping(value = "getShowsDetails")
    public ResponseEntity<NetflixTitlePageResponse> getAllShows(){
        try{
            NetflixTitlePageResponse netflixTitlePageResponse = this.showService.getAll();
            return new ResponseEntity<>(netflixTitlePageResponse, HttpStatus.ACCEPTED);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
