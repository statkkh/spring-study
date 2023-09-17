package com.kimkh.task.dto.request;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

// ! 일정 작성하기 요청에서 '일정이름', '카테고리', '설명', '날짜', '시간'을 필수 입력
// !    (공백 문자열까지 허용하지 않는다.)으로 지정

// ! 일정 수정하기 요청에서 '일정이름', '카테고리', '설명', '날짜', '시간'을 필수 입력
// ! (공백 문자열까지 허용하지 않는다.)으로 지정


// ! 4. Task 컨트롤러에 일정 불러오기는 '코드', '메세지', '일정번호', '일정이름', '카테고리', '설명', '날짜', '시간'을 응답(출력)한다.
// ! (여기서 코드와 메세지는 HTTP Status 및 HTTP Message가 아니다.)

// ! 5. 일정 작성하기, 일정 수정하기, 일정 삭제하기는 '코드', '메세지'를 응답(출력)한다.
// ! (여기서 코드와 메세지는 HTTP Status 및 HTTP Message가 아니다.)

public class PatchValidationDto {

    @NotBlank(message = "HTTP Message가 아니다.")
    private String scheduleName;
    private String category;
    private String description;
    private String date;
    private String time;
    private String schduleNumber;    
    
}
