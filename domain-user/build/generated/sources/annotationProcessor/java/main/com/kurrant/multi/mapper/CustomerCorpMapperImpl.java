package com.kurrant.multi.mapper;

import com.kurrant.multi.domain.CustomerCorp;
import com.kurrant.multi.dto.CustomerCorpDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-31T17:03:33+0900",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class CustomerCorpMapperImpl implements CustomerCorpMapper {

    @Override
    public CustomerCorpDto toDto(CustomerCorp e) {
        if ( e == null ) {
            return null;
        }

        CustomerCorpDto customerCorpDto = new CustomerCorpDto();

        customerCorpDto.name = e.getName();

        return customerCorpDto;
    }

    @Override
    public CustomerCorp toEntity(CustomerCorpDto d) {
        if ( d == null ) {
            return null;
        }

        CustomerCorp.CustomerCorpBuilder customerCorp = CustomerCorp.builder();

        customerCorp.name( d.getName() );

        return customerCorp.build();
    }

    @Override
    public void updateFromDto(CustomerCorpDto dto, CustomerCorp entity) {
        if ( dto == null ) {
            return;
        }
    }
}
