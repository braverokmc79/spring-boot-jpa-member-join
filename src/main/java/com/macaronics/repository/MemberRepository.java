package com.macaronics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macaronics.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByEmail(String email);
}
