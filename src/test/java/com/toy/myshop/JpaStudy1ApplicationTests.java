package com.toy.myshop;

import com.toy.myshop.domain.Member;
import com.toy.myshop.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaStudy1ApplicationTests {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    void contextLoads() {
        Member member1 = new Member();
        member1.setName("하하하");
        memberRepository.save(member1);
    }

    @Test
    void 멤버찾기() {
        Member member = memberRepository.findById(1L).get();
    }
}
