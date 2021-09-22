package com.dio.beerStock.Everis.Dio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BeerNotFoundException extends Exception {

    public BeerNotFoundException(String beerNome) {
        super(String.format("Cerveja com o nome %s não foi encontrada no sistema.", beerNome));
    }

    public BeerNotFoundException(Long id) {
        super(String.format("Cerveja com o id %s não foi encontrada no sistema.", id));
    }
}
