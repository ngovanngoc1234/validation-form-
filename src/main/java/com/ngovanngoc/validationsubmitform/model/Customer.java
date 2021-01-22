package com.ngovanngoc.validationsubmitform.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class Customer {

    @NotBlank(message = "nema not null")
    private String name;

    @NotEmpty(message = "CMND not null")
    private String cmnd;

    @NotEmpty(message = "phone not null")
    @Pattern(regexp = "\\d{10}",message = "phone khong dung dinh dang")
    private String phone;

    @NotEmpty(message = "email not null")
    @Email(message = "email khong dung dinh dang")
    private String email;

    public Customer(@NotBlank(message = "nema not null") String name, @NotEmpty(message = "CMND not null") String cmnd, @NotEmpty(message = "phone not null") @Pattern(regexp = "\\d{10}", message = "phone khong dung dinh dang") String phone, @NotEmpty(message = "email not null") @Email(message = "email khong dung dinh dang") String email) {
        this.name = name;
        this.cmnd = cmnd;
        this.phone = phone;
        this.email = email;
    }

    public Customer() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
