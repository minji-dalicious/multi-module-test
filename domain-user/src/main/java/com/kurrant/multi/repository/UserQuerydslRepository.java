package com.kurrant.multi.repository;

import com.kurrant.multi.domain.QUser;
import com.kurrant.multi.domain.User;
import com.kurrant.multi.dto.UserDto;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Repository
public class UserQuerydslRepository {
    private final EntityManager em;
    private final JPAQueryFactory queryFactory;

    public UserQuerydslRepository(EntityManager em) {
        this.em = em;
        this.queryFactory = new JPAQueryFactory(em);
    }

    public List<UserDto> findByUsername(String name) {
        QUser user = QUser.user;
        List<UserDto> result = queryFactory
                .select(Projections.fields(UserDto.class,
                        user.role,
                        user.name,
                        user.point
                ))
                .from(user)
                .where(user.name.eq(name))
                .limit(10)
                .fetch();
        result.forEach(e -> {
            log.info("role: " + e.getRole());
            log.info("name: " + e.getName());
            log.info("point: " + e.getPoint());
        });
        return result;
    }

    @Transactional
    public void saveUser(User user) {
        em.persist(user);
    }
}
