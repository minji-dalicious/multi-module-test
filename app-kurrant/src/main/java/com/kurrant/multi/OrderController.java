package com.kurrant.multi;

import com.kurrant.multi.domain.OrderItem;
import com.kurrant.multi.domain.Period;
import com.kurrant.multi.repository.UserQuerydslRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final UserQuerydslRepository userQuerydslRepository;

    @GetMapping("/v1/orders/filter")
    public List<OrderItem> getSelectedOrderItems(@RequestBody OrderItem.Request request) {
        return userQuerydslRepository.findByClientNameAndPaymentDate(request.getClientName(), request.getServiceDate());
    }

    @GetMapping("/v1/orders/filter2")
    public List<OrderItem.ClientTotalExpenditure> getClientsExpenditure(@RequestBody Period period) {
        return userQuerydslRepository.getClientsTotalExpenditure(period.getStartDateTime(), period.getEndDateTime());
    }
}
