package com.dio.beerStock.Everis.Dio.repository;

import com.dio.beerStock.Everis.Dio.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface BeerRepository extends JpaRepository<Beer, Long> {

    Optional<Beer> findByName(String nome);
}
