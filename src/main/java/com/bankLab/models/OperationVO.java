package com.bankLab.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "operations")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OperationVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int operation_id;
    private enum OperationType {
        WITHDRAW,
        DEPOSIT,
        TRANSFER
    }

    private float quantity;
    private float initial_balance;
    private float final_balance;
    private LocalDate operation_date;
    private LocalTime operation_time;

    @ManyToOne
    @JoinColumn(name="receiver_account")
    private AccountVO receiver_account;

    @ManyToOne
    @JoinColumn(name="sender_account")
    private AccountVO sender_account;
}
