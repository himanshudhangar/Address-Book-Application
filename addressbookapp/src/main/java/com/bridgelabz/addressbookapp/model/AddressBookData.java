package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import lombok.Data;

/**
 Use Of Lombak In Addressbook Annotations
 */
@Data
public class AddressBookData {
    private int personId;
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;


    public AddressBookData(int personId, AddressBookDTO addressbookDTO) {
        this.personId = personId;
        this.updateAddressBookdata(addressbookDTO);

    }

    public void updateAddressBookdata(AddressBookDTO addressbookDTO) {
        this.firstName = addressbookDTO.firstName;
        this.lastName = addressbookDTO.lastName;
        this.city = addressbookDTO.city;
        this.state = addressbookDTO.state;
        this.zip = addressbookDTO.zip;
        this.phone = addressbookDTO.phone;
        this.email = addressbookDTO.email;
    }
}