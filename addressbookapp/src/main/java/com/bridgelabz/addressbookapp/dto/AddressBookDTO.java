package com.bridgelabz.addressbookapp.dto;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class AddressBookDTO {

    public String firstName;

    public String lastName;

    public long zipCode;

    public String state;

    public String city;

    public long phoneNumber;

}