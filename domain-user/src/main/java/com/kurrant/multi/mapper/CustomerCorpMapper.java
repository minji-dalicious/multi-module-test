package com.kurrant.multi.mapper;

import com.kurrant.multi.GenericMapper;
import com.kurrant.multi.domain.CustomerCorp;
import com.kurrant.multi.dto.CustomerCorpDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CustomerCorpMapper extends GenericMapper<CustomerCorpDto, CustomerCorp> {
    CustomerCorpMapper INSTANCE = Mappers.getMapper(CustomerCorpMapper.class);
}
