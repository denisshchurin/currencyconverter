package com.denis.currencyconverter.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "currencies")
public class Currency extends AbstractEntity {

    @Column(name = "valute_ID")
    @NotNull
    private Integer valute_ID;

    @Column(name = "numCode")
    @NotNull
    private Integer numCode;

    @Column(name = "charCode", nullable = false)
    @NotBlank
    private String charCode;

    @Column(name = "nominal")
    @NotNull
    private Integer nominal;

    @Column(name = "name", nullable = false)
    @NotBlank
    private String name;

    @Column(name = "value")
    @NotNull
    private Double value;

}
