package com.dio.beerStock.Everis.Dio.entity;

import com.dio.beerStock.Everis.Dio.enums.TipoCerveja;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Beer {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column (nullable = false, unique = true)
private String name;

@Column (nullable = false)
private String marca;

@Column (nullable = false)
private int quantidade;

@Column (nullable = false)
private int max;

@Column (nullable = false)
@Enumerated(EnumType.STRING)
private TipoCerveja tipo;


}
