package yaddoong.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yaddoong.datajpa.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
