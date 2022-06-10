package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.excepation.AddressbookExcepation;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    List<AddressBookData> addressbookDataList = new ArrayList<>();

    @Override
    public List<AddressBookData> getAddressbookData() {
        return addressbookDataList;
    }

    @Override
    public AddressBookData getAddressbookDataById(int personId) {
        return addressbookDataList.stream()
                .filter(addressbookData -> addressbookData.getPersonId()==personId)
                .findFirst()
                .orElseThrow(()->new AddressbookExcepation("Person Not found"));
    }

    @Override
    public AddressBookData createAddressbooData(AddressBookDTO addressbookDTO) {
        AddressBookData addressbookData = null;
        addressbookData = new AddressBookData(addressbookDataList.size() + 1, addressbookDTO);
        addressbookDataList.add(addressbookData);
        return addressbookData;
    }

    @Override
    public AddressBookData updateAddressbookData(int personId, AddressBookDTO addressbookDTO) {
        AddressBookData addressbookData = this.getAddressbookDataById(personId);
        addressbookData.setName(addressbookDTO.name);
        addressbookData.setPhNumber(addressbookDTO.phNumber);
        addressbookDataList.set(personId - 1, addressbookData);
        return addressbookData;
    }

    @Override
    public void deleteAddressbooData(int personId) {
        int i = 1;
        addressbookDataList.remove(personId - 1);
        for (AddressBookData addressbookData : addressbookDataList) {
            addressbookData.setPersonId(i++);
        }
    }
}