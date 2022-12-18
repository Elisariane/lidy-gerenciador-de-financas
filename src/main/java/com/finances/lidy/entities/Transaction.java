package com.finances.lidy.entities;

import com.finances.lidy.entities.enums.FrequencyTransaction;
import com.finances.lidy.entities.enums.TypeTransaction;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nameTransaction;

    @Temporal(TemporalType.DATE)
    private  Date dateTransaction;

    private String description;

    @Enumerated(EnumType.STRING)
    private TypeTransaction typeTransaction;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account accountId;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category categoryId;

    private double valueTransaction;
    private boolean repeatTransaction;
    private int startInstallment;
    private int finalInstallment;
    private int numberRepetitions;

    @Enumerated(EnumType.STRING)
    private FrequencyTransaction frequencyTransaction;

    private boolean repeatEndlessly;
}
