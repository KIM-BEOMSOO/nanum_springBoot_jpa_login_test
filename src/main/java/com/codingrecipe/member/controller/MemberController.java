package com.codingrecipe.member.controller;

import com.codingrecipe.member.dto.MemberDto;
import com.codingrecipe.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class MemberController {
    //생성자 주입
    private final MemberService memberService;

    //회원가입 페이지 출력 요청
    @GetMapping("/member/save")
    public String saveForm(){
        return "save";
    }

    @PostMapping("/member/save")
    public String save(@ModelAttribute MemberDto memberDto){
        System.out.println("MemberController.save");
        System.out.println("memberDto = " + memberDto);
        memberService.save(memberDto);
        return "index";
    }



}
