package com.kurrant.multi.repository;

import com.kurrant.multi.domain.OrderItem;
import com.kurrant.multi.domain.QUser;
import com.kurrant.multi.dto.UserDto;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;

import static com.kurrant.multi.domain.QCustomerCorp.customerCorp;
import static com.kurrant.multi.domain.QOrder.order;
import static com.kurrant.multi.domain.QOrderItem.orderItem;
import static com.kurrant.multi.domain.QUser.user;

@Slf4j
@Repository
@RequiredArgsConstructor
public class UserQuerydslRepository {
    private final JPAQueryFactory queryFactory;

    public List<UserDto> findByUsername(String name) {
        QUser user = QUser.user;
        List<UserDto> result = queryFactory
                .select(Projections.fields(UserDto.class,
                        user.name,
                        user.point
                ))
                .from(user)
                .where(user.name.eq(name))
                .limit(10)
                .fetch();
        result.forEach(e -> {
            log.info("name: " + e.getName());
        });
        return result;
    }

    public List<OrderItem> findByClientNameAndPaymentDate(String clientName, LocalDate paymentDate) {
        Timestamp dateStart = Timestamp.valueOf(paymentDate.atStartOfDay());
        Timestamp dateEnd =  Timestamp.valueOf(paymentDate.atTime(23, 59, 59));

        return queryFactory
                .select(orderItem)
                .from(orderItem)
                .innerJoin(orderItem.order, order)
                .innerJoin(order.user, user)
                .leftJoin(user.customerCorp, customerCorp).on(user.customerCorp.isNotNull())
                .where(user.customerCorp.name.eq(clientName))
                .where(orderItem.created.between(dateStart, dateEnd))
                .fetch();
    }

    public List<OrderItem.ClientTotalExpenditure> getClientsTotalExpenditure(LocalDate startDate, LocalDate endDate) {
        Timestamp startDateTime = Timestamp.valueOf(startDate.atStartOfDay());
        Timestamp endDateTime =  Timestamp.valueOf(endDate.atTime(23, 59, 59));

        return queryFactory
                .select(Projections.fields(OrderItem.ClientTotalExpenditure.class,
                        customerCorp.name.as("customerCorpName"),
                        orderItem.price.sum().as("sum")
                ))
                .from(orderItem)
                .innerJoin(orderItem.order, order)
                .innerJoin(order.user, user)
                .leftJoin(user.customerCorp, customerCorp)
                .where(user.customerCorp.isNotNull())
                .where(orderItem.created.between(startDateTime, endDateTime))
                .groupBy(customerCorp)
                .fetch();
    }
}
