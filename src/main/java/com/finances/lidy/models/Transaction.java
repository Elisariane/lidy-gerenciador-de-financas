package com.finances.lidy.models;

import com.finances.lidy.models.enums.FrequencyTransaction;
import com.finances.lidy.models.enums.TypeTransaction;
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

    private String name;

    @Temporal(TemporalType.DATE)
    private  Date dateTransaction;

    private String description;

    @Enumerated(EnumType.STRING)
    private TypeTransaction typeTransaction;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private double value_transaction;
    private boolean repeat_transaction;
    private int start_installment;
    private int final_installment;
    private int number_repetitions;

    @Enumerated(EnumType.STRING)
    private FrequencyTransaction frequencyTransaction;

    private boolean repeat_endlessly;
}
