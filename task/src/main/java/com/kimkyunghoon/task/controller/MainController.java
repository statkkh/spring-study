package com.kimkyunghoon.task.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    
    @GetMapping("api/v1/task/{taskNumber}")
    public String getPathVariable(
        @PathVariable("taskNumber") String taskNumber
    ){
        return "getMethod";
    }

    @PostMapping("api/v1/task")
    public String postPathVariable(
        @PathVariable("taskNumber") String taskNumber
    ){
        return "postMethod" ;
    }
    
    @PatchMapping("api/v1/task/{taskNumber}")
    public String patchMethod(){
        return "patchMethod";
    }
    
    @DeleteMapping("api/v1/task/{taskNumber}")
    public String deleteMethod(){
        return "deleteMethod";
    }

    
    @PostMapping("parameter")
    public String postParameter(
        @RequestParam("scheduleName") String scheduleName,
        @RequestParam("category") String category,
        @RequestParam("decription") String decription,
        @RequestParam("date") String date,
        @RequestParam("time") String time
    ){
        return scheduleName + category + decription + date + time;
    }

    @PutMapping("parameter")
    public String putParameter(
        @RequestParam("scheduleName") String scheduleName,
        @RequestParam("category") String category,
        @RequestParam("decription") String decription,
        @RequestParam("date") String date,
        @RequestParam("time") String time        
    ){
         return scheduleName + category + decription + date + time;
    }

}
