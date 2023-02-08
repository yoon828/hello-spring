package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    //네이밍 규칙만으로 JPQL을 알아서 해줌
    @Override
    Optional<Member> findByName(String name);
}
