package com.dio.beerStock.Everis.Dio.mapper;

import com.dio.beerStock.Everis.Dio.dto.BeerDTO;
import com.dio.beerStock.Everis.Dio.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);

}
