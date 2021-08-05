package com.springboard.controlloer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

//@Slf4j 로깅에 대한 추상 레이어를 제공하는 interface의 모음이다.
@RestController //Json 형태로 객체 데이터를 반환
public class MemberController{

    @PostMapping("signup")
    public void signup(@RequestParam String id,
                       @RequestParam String password,
                       @RequestParam String email,
                       @RequestParam String name,
                       HttpServletResponse response) throws IOException, NoSuchAlgorithmException{

    }

}