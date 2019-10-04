package com.codegym.c0319h2.quanlycongty.message.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogInForm {

    private String userName;

    private String passWord;
}
