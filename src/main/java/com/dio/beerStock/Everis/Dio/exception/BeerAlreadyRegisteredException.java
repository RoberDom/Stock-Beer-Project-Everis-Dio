package com.dio.beerStock.Everis.Dio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerAlreadyRegisteredException extends Exception{

    public BeerAlreadyRegisteredException(String beerNome) {
        super(String.format("Cerveja com o nome %s já existe no sistema.", beerNome));
    }
}