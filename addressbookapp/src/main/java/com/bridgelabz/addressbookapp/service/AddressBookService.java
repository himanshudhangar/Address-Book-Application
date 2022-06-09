package com.bridgelabz.addressbookapp.service;


import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {
    @Override
    public List<AddressBookData> getAddressbookData() {
        List<AddressBookData> addressbookDataList = new ArrayList<>();
        addressbookDataList.add(new AddressBookData(1,new AddressBookDTO("Himanshu","7411949218")));
        return addressbookDataList;
    }

    @Override
    public AddressBookData getAddressbookDataById(int personId) {
        AddressBookData addressbookData =  null;
        addressbookData = new AddressBookData(personId,new AddressBookDTO("Himanshu","12345678"));
        return addressbookData;
    }

    @Override
    public AddressBookData createAddressbooData(AddressBookDTO addressbookDTO) {
        AddressBookData addressbookData = null;
        addressbookData = new AddressBookData(1,addressbookDTO);
        return addressbookData;
    }

    @Override
    public AddressBookData updateAddressbookData(int personId,AddressBookDTO addressbookDTO) {
        AddressBookData addressbookData = null;
        addressbookData = new AddressBookData(personId,addressbookDTO);
        return addressbookData;
    }

    @Override
    public void deleteAddressbooData(int personId) {

    }
}