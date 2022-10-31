package com.kurrant.multi.repository;

import com.kurrant.multi.domain.User;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
public class UserQuerydslRepository {
    private final EntityManager em;
    private final JPAQueryFactory queryFactory;

    public UserQuerydslRepository(EntityManager em) {
        this.em = em;
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Transactional
    public void saveUser(User user) {
        em.persist(user);
    }
}
