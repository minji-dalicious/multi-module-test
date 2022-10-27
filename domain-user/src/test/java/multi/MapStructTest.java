package multi;

import com.kurrant.multi.domain.User;
import com.kurrant.multi.dto.UserDto;
import com.kurrant.multi.mapper.UserMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapStructTest {
    @Test
    public void DTO를_Entity로_맵핑() {
        UserDto userDto = new UserDto(1, 1, 2, 1, 1, 1, 1, 1, 0, 1);
        User user = UserMapper.INSTANCE.toEntity(userDto);

        System.out.println(">>>>> userDto = " + userDto);
        System.out.println(">>>>> user = " + user);

        Assertions.assertEquals(1, user.getCustomerCorpId());
        Assertions.assertEquals(2, user.getType());
        Assertions.assertEquals(0, user.getStatus());
    }

    @Test
    public void Entity를_DTO로_맵핑() {
        User user = User.builder().
                supplierCorpId(100).customerCorpId(123).type(2).level(1).locationId(123).registerType(2).gender(2).verifyStatus(2).status(1).box(0)
                .build();
        UserDto userDto = UserMapper.INSTANCE.toDto(user);

        System.out.println(">>>>> user = " + user);
        System.out.println(">>>>> userDto = " + user);

        Assertions.assertEquals(user.getCustomerCorpId(), userDto.getCustomerCorpId());
        Assertions.assertEquals(user.getType(), userDto.getType());
        Assertions.assertEquals(user.getLocationId(), userDto.getLocationId());
    }
}
