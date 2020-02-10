package com.denis.currencyconverter.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "histories")
public class History extends AbstractEntity{

    @Column(name = "rate")
    @NotNull
    private Integer rate;

    @Column(name = "originalCurrency", nullable = false)
    @NotBlank
    private String originalCurrency;

    @Column(name = "objectiveCurrency", nullable = false)
    @NotBlank
    private String objectiveCurrency;

    @Column(name = "originalSum")
    @NotNull
    private Integer originalSum;

    @Column(name = "derivableSum")
    @NotNull
    private Double derivableSum;

    @Column(name = "date", nullable = false)
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;

}
