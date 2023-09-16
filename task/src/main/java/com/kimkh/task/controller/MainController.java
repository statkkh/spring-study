package com.kimkh.task.controller;


import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kimkh.task.dto.request.PatchValidationDto;
import com.kimkh.task.dto.request.PostRequestBodyDto;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/v1")

// @RequiredArgsConstructor
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

    // ! 일정 수정하기의 입력에서 '일정번호'를 입력 받도록 수정
    @PutMapping("request-body")
    public String putRequestBody(
        @RequestBody PostRequestBodyDto requestBody
    ){
        return requestBody.getSchduleNumber();
    }

    // ! 일정 작성하기 요청에서 '일정이름', '카테고리', '설명', '날짜', '시간'을 필수 입력
    // ! (공백 문자열까지 허용하지 않는다.)으로 지정
    
    @PostMapping("validation")
    public String validation(
        @RequestBody @Valid  PatchValidationDto requestBody
    ){
        return requestBody.getScheduleName() + requestBody.getCategory() + requestBody.getDescription() + requestBody.getDate() + requestBody.getTime();
    }    
    // ! 일정 수정하기 요청에서 '일정이름', '카테고리', '설명', '날짜', '시간'을 필수 입력
    // ! (공백 문자열까지 허용하지 않는다.)으로 지정

    @PutMapping("validation")
    public String validation1(
        @RequestBody @Valid  PatchValidationDto requestBody
    ){
        return requestBody.getScheduleName() + requestBody.getCategory() + requestBody.getDescription() + requestBody.getDate() + requestBody.getTime();
        
    }
    // public String validation(
    //     @RequestBody @Valid  PatchValidationDto requestBody
    // ){
    //     return requestBody.getScheduleName() + requestBody.getCategory() + requestBody.getDescription() + requestBody.getDate() + requestBody.getTime();
    // }
}
