package com.kimkh.task.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

// ! '일정이름', '카테고리', '설명', '날짜', '시간'
public class PostRequestBodyDto {
    private String scheduleName;
    private String category;
    private String description;
    private String date;
    private String time;
    private String schduleNumber;
}
