package yaddoong.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yaddoong.datajpa.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findByUsernameAndAgeGreaterThan(String username, int age);

    List<Member> findTop3HelloBy();


}
