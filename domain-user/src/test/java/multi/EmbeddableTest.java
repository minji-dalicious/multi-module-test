package multi;

import com.kurrant.multi.domain.Address;
import com.kurrant.multi.domain.CustomerCorp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmbeddableTest {
    @Test
    public void Test1() {
        Address address = Address.builder()
                .address1("경기도 고양시 일산동구 식사동 위시티 4로")
                .address2("411동 304호")
                .zipcode("10325")
                .latitude(37.68253797781395)
                .longitude(126.81581407352132)
                .build();

        CustomerCorp customerCorp = CustomerCorp.builder()
                .id(1)
                .name("민지네 네일샵")
                .build();

        customerCorp.setAddress(address);

        Assertions.assertEquals(address.getAddress1() ,customerCorp.getAddress().getAddress1());
    }
}
