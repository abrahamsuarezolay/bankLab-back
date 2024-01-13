package com.bankLab.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    @Column(length = 100)
    private String user_name;
    @Column(length = 100)
    private String email;
    @Column(length = 32)
    private String password;

    @OneToMany(mappedBy = "account_id", cascade = CascadeType.REMOVE)
    private List<AccountVO> accounts;

}
