package com.codingrecipe.member.service;

import com.codingrecipe.member.dto.MemberDto;
import com.codingrecipe.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    public void save(MemberDto memberDto) {
    }
}
