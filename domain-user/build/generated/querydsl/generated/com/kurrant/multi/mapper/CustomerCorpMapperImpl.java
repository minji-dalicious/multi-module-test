package com.kurrant.multi.mapper;

import com.kurrant.multi.domain.CustomerCorp;
import com.kurrant.multi.dto.CustomerCorpDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-31T17:04:40+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class CustomerCorpMapperImpl implements CustomerCorpMapper {

    @Override
    public CustomerCorpDto toDto(CustomerCorp arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CustomerCorpDto customerCorpDto = new CustomerCorpDto();

        customerCorpDto.name = arg0.getName();

        return customerCorpDto;
    }

    @Override
    public CustomerCorp toEntity(CustomerCorpDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CustomerCorp.CustomerCorpBuilder customerCorp = CustomerCorp.builder();

        customerCorp.name( arg0.getName() );

        return customerCorp.build();
    }

    @Override
    public void updateFromDto(CustomerCorpDto arg0, CustomerCorp arg1) {
        if ( arg0 == null ) {
            return;
        }
    }
}
