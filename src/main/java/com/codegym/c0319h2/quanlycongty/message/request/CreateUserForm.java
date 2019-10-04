package com.codegym.c0319h2.quanlycongty.message.request;

import com.codegym.c0319h2.quanlycongty.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;
@Data
public class CreateUserForm {

    private String userName;
    private String passWord;
    private String email;
    private Set<String> roles;
}
