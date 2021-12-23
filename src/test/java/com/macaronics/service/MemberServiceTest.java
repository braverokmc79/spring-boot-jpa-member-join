package com.macaronics.service;

import com.macaronics.constant.Role;
import com.macaronics.dto.MemberFormDto;
import com.macaronics.entity.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.TestPropertySource;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Autowired
    PasswordEncoder passwordEncoder;


    public Member createMember(){
        MemberFormDto memberFormDto=new MemberFormDto();
        memberFormDto.setEmail("test@gmail.com");
        memberFormDto.setName("홍길동");
        memberFormDto.setAddress("서울시 마포구 합정동");
        memberFormDto.setPassword("1234");
        return Member.createMember(memberFormDto, passwordEncoder, Role.USER);
    }

    /**
     * Junit 의 Assertions 클래스의 assertEquals 메소드를 이용하여 저장하려고 요청했던 값과
     * 실제 저장된 데이터를 비교합니다.
     * 첫 번째 파라미터에는 기대 값, 두번때 파라미터에는 실제로 저장되 값을 넣어줍니다.
     */

    @Test
    @DisplayName("회원가입테스트")
    public void saveMemberTest(){
        Member member=createMember();
        Member savedMember =memberService.saveMember(member);

        assertEquals(member.getEmail(), savedMember.getEmail());
        assertEquals(member.getName(), savedMember.getName());
        assertEquals(member.getAddress(), savedMember.getAddress());
        assertEquals(member.getPassword(), savedMember.getPassword());
        assertEquals(member.getRole(), savedMember.getRole());

    }
    





}