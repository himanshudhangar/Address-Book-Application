package com.bridgelabz.addressbookapp.service;


import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

import java.util.List;

public interface IAddressBookService {
    List<AddressBookData> getAddressbookData();

    AddressBookData getAddressbookDataById(int personId);

    AddressBookData createAddressbookData(AddressBookDTO addressbookDTO);

    AddressBookData updateAddressbookData(int personId,AddressBookDTO addressbookDTO);

    void deleteAddressbookData(int personId);
}