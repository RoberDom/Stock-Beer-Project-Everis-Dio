package com.dio.beerStock.Everis.Dio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockExceededException extends Exception {

    public BeerStockExceededException(Long id, int quantityToIncrement) {
        super(String.format
                ("Cerveja com o %s Id para acrescentar informada excede a capacidade máxima do estoque: %s", id, quantityToIncrement));
    }
}
