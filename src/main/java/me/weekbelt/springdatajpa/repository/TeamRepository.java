package me.weekbelt.springdatajpa.repository;

import me.weekbelt.springdatajpa.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
