package com.kimkh.task.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class MainController {
    
    @GetMapping("task/{taskNumber}")
    public String getPathVariable(
        @PathVariable("taskNumber") String taskNumber
    ){
        return "getMethod";
    }

    @PostMapping("task")
    public String postPathVariable(
        @PathVariable("taskNumber") String taskNumber
    ){
        return "postMethod" ;
    }
    
    @PatchMapping("task/{taskNumber}")
    public String patchPathVariable(
        @PathVariable("taskNumber") String taskNumber
    ){
        return "patchMethod";
    }
    
    @DeleteMapping("task/{taskNumber}")
    public String deletePathVariable( String taskNumber   
    ){
        return "deleteMethod";
    }

    
    @PostMapping("/parameter")
    public String postParameter(
        @RequestParam("scheduleName") String scheduleName,
        @RequestParam("category") String category,
        @RequestParam("decription") String decription,
        @RequestParam("date") String date,
        @RequestParam("time") String time
    ){
        return scheduleName + category + decription + date + time;
    }

    @PutMapping("/parameter")
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
