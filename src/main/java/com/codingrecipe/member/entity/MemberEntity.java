package com.codingrecipe.member.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "member_table") // 테이블명 "member_table" 자동생성
public class MemberEntity {
    @Id //pk 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment (MySQL)
    private Long id;

    @Column (unique = true) //unique 제약조건 지정
    private String memberEmail;

    @Column //일반 컬럼 지정
    private String memberPassword;

    @Column
    private String memberName;


}
