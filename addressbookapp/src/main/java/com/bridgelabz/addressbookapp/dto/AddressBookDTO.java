package com.bridgelabz.addressbookapp.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
public class AddressBookDTO {
    @javax.validation.constraints.Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Addressbook name is Invalid")
    @NotEmpty(message = "Addressbook name cannot be null")
    public String name;
    @Pattern(regexp = "^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$" ,message = "phonenumber is invalid")
    public String phNumber;

    public AddressBookDTO(String name, String phNumber) {
        this.name = name;
        this.phNumber = phNumber;
    }

    @Override
    public String toString() {
        return "AddressbookDTO{" +
                "name='" + name + '\'' +
                ", phNumber=" + phNumber +
                '}';
    }
}