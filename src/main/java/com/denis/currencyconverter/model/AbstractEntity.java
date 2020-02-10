package com.denis.currencyconverter.model;

import lombok.Data;

import javax.persistence.*;

@MappedSuperclass
@Data
public abstract class AbstractEntity {
    @Id
    @SequenceGenerator( name = "jpaSequence", sequenceName = "JPA_SEQUENCE", allocationSize = 1, initialValue = 1 )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jpaSequence")
    private Integer id;
}
