package com.dio.beerStock.Everis.Dio.controller;

import com.dio.beerStock.Everis.Dio.dto.BeerDTO;
import com.dio.beerStock.Everis.Dio.dto.QuantidadeDTO;
import com.dio.beerStock.Everis.Dio.entity.Beer;
import com.dio.beerStock.Everis.Dio.exception.BeerAlreadyRegisteredException;
import com.dio.beerStock.Everis.Dio.exception.BeerNotFoundException;
import com.dio.beerStock.Everis.Dio.exception.BeerStockExceededException;
import com.dio.beerStock.Everis.Dio.service.BeerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/beer")
@AllArgsConstructor(onConstructor = @__(@Autowired))

public class BeerController {

    private final BeerService beerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BeerDTO createBeer(@RequestBody @Valid BeerDTO beerDTO) throws BeerAlreadyRegisteredException {
        return beerService.createBeer(beerDTO);
    }

    @GetMapping("/{name}")
    public BeerDTO findByName(@PathVariable String name) throws BeerNotFoundException {
        return beerService.findByName(name);
    }

    @GetMapping
    public List<BeerDTO> listBeers() {
        return beerService.listAll();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws BeerNotFoundException {
        beerService.deleteById(id);
    }

    @PatchMapping("/{id}/increment")
    public BeerDTO increment(@PathVariable Long id, @RequestBody @Valid QuantidadeDTO quantityDTO) throws BeerNotFoundException, BeerStockExceededException {
        return beerService.increment(id, quantityDTO.getQuantity());
    }
}