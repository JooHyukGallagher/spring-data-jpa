package me.weekbelt.springdatajpa.repository;

import me.weekbelt.springdatajpa.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
