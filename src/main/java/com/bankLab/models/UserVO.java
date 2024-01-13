package com.bankLab.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    @OneToMany(mappedBy = "user_id", cascade = CascadeType.REMOVE)
    private AccountVO accounts;

    public UserVO(String user_name, String email, String password) {
        this.user_name = user_name;
        this.email = email;
        this.password = password;
    }
}
