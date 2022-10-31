package multi;

import com.kurrant.multi.domain.Apartment;
import com.kurrant.multi.domain.CustomerCorp;
import com.kurrant.multi.domain.Role;
import com.kurrant.multi.domain.User;
import com.kurrant.multi.dto.CustomerCorpDto;
import com.kurrant.multi.dto.UserDto;
import com.kurrant.multi.mapper.CustomerCorpMapper;
import com.kurrant.multi.mapper.UserMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapStructTest {
    @Test
    public void 유저_DTO를_Entity로_맵핑() {
        UserDto userDto = new UserDto("김민지", 0);
        User user =  UserMapper.INSTANCE.toEntity(userDto);

        System.out.println(">>>>> userDto = " + userDto);
        System.out.println(">>>>> user = " + user);

        Assertions.assertEquals(userDto.getName(), user.getName());
        Assertions.assertEquals(userDto.getPoint(), user.getPoint());
    }

    @Test
    public void 유저_Entity를_DTO로_맵핑() {
        CustomerCorp customerCorp = new CustomerCorp(1, "(주)김민.D");
        Apartment apartment = new Apartment(1, "민지네아파트");

        User user = new User(1, Role.USER, "김민지" ,100, customerCorp, apartment);

        UserDto userDto = UserMapper.INSTANCE.toDto(user);

        System.out.println(">>>>> user = " + user);
        System.out.println(">>>>> userDto = " + userDto);

        Assertions.assertEquals(user.getName(), userDto.getName());
        Assertions.assertEquals(user.getPoint(), userDto.getPoint());
    }

    @Test
    public void 고객사_DTO를_Entity로_맵핑() {
        CustomerCorpDto customerCorpDto = new CustomerCorpDto("민지네야채가게");
        CustomerCorp customerCorp = CustomerCorpMapper.INSTANCE.toEntity(customerCorpDto);

        System.out.println(">>>>> customerCorpDto = " + customerCorpDto);
        System.out.println(">>>>> customerCorp = " + customerCorp);

        Assertions.assertEquals(customerCorpDto.getName(), customerCorp.getName());
    }

    @Test
    public void 고객사_Entity를_DTO로_맵핑() {
        CustomerCorp customerCorp = new CustomerCorp(1, "민지네야채가게");

        CustomerCorpDto customerCorpDto = CustomerCorpMapper.INSTANCE.toDto(customerCorp);

        System.out.println(">>>>> customerCorpDto = " + customerCorpDto);
        System.out.println(">>>>> customerCorp = " + customerCorp);

        Assertions.assertEquals(customerCorp.getName(), customerCorpDto.getName());
    }
}
