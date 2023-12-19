package com.kimkh.task.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.kimkh.task.dto.response.TmpResponseDto;

public class TaskController {


// ! 4. Task 컨트롤러에 일정 불러오기는 '코드', '메세지', '일정번호', '일정이름', '카테고리', '설명', '날짜', '시간'을 응답(출력)한다.
// ! (여기서 코드와 메세지는 HTTP Status 및 HTTP Message가 아니다.)

    @GetMapping("response-entity")
    public ResponseEntity<TmpResponseDto> getResponseEntity() {
        TmpResponseDto responseBody = new TmpResponseDto("", "", "null", null, null, "12", "1", "wwfa");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    }
    
// ! 5. 일정 작성하기, 일정 수정하기, 일정 삭제하기는 '코드', '메세지'를 응답(출력)한다.
// ! (여기서 코드와 메세지는 HTTP Status 및 HTTP Message가 아니다.)
    @PostMapping("")
    public ResponseEntity<TmpResponseDto> postResponseEntity() {
        TmpResponseDto responseBody = new TmpResponseDto("", "", "null", null, null, "12", "1", "wwfa");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    }

    @PutMapping("response-entity")
    public ResponseEntity<TmpResponseDto> putResponseEntity() {
        TmpResponseDto responseBody = new TmpResponseDto("", "", "null", null, null, "12", "1", "wwfa");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    }

    @DeleteMapping("response-entity")
    public ResponseEntity<TmpResponseDto> deleteResponseEntity() {
        TmpResponseDto responseBody = new TmpResponseDto("", "", "null", null, null, "12", "1", "wwfa");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    }    


    
}
