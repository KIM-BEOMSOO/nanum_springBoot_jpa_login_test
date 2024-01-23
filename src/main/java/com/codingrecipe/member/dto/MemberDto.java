package com.codingrecipe.member.dto;

import lombok.*;

@Getter
@Setter
//기본 생성자 자동생성
@NoArgsConstructor
//필드 전체를 매개변수로 하는 생성자 자동생성
@AllArgsConstructor
@ToString
public class MemberDto {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;

}
