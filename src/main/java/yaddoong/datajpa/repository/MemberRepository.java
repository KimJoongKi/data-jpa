package yaddoong.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yaddoong.datajpa.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
