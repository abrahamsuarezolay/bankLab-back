package com.bankLab.DTO;

import com.bankLab.models.AccountVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDTO {

    private String userName;
    private String email;
    private String password;
}
