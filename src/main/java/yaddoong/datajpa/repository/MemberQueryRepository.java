package yaddoong.datajpa.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import yaddoong.datajpa.entity.Member;

import javax.persistence.EntityManager;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class MemberQueryRepository {

    private final EntityManager em;

    List<Member> findAllMember() {
        return em.createQuery("select m from Member m")
                .getResultList();

    }
}
