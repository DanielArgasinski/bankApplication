package com.demo.bankapp.model.dto;


import com.demo.bankapp.model.UserRole;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Logger {

    private String nickname;
    private UserRole role;
}
