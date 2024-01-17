package com.bankLab.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "accounts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int account_id;
    private float balance;
    @Column(length = 9)
    private String account_number;
    @Column(length = 24)
    private String account_name;

    @ManyToOne
    @JoinColumn(name = "user")
    private UserVO user;

    @OneToMany(mappedBy = "operation_id")
    private List<OperationVO> operations;

    public AccountVO(float balance, String account_number, String account_name) {
        this.balance = balance;
        this.account_number = account_number;
        this.account_name = account_name;
    }

    public AccountVO(float balance, String account_number, String account_name, UserVO user) {
        this.balance = balance;
        this.account_number = account_number;
        this.account_name = account_name;
        this.user = user;
    }
}
