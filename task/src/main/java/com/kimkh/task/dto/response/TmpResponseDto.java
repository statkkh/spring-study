package com.kimkh.task.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TmpResponseDto {
    private String code;
    private String message;
    private String scheduleName;
    private String category;
    private String description;
    private String date;
    private String time;
    private String schduleNumber;   
}
