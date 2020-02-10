package com.denis.currencyconverter.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "users")
public class User extends AbstractEntity {

    @Column(name = "name", nullable = false)
    @NotBlank
    @Size(min = 3, max = 10)
    private String name;

    @Column(name = "password", nullable = false)
    @NotBlank
    @Size(min = 5, max = 100)
    private String password;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<History> histories;
}
