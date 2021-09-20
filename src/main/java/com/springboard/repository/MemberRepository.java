package com.springboard.repository;

import com.springboard.dto.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member,Long> {
    Optional<Member> findByIdAAndPwd(String id, String pwd);
    Optional<Member> findById(String id);
}
