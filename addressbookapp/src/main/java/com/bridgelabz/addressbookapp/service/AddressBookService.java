package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.excepation.AddressbookExcepation;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.repository.AddressBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService {
    @Autowired
    private AddressBookRepository addressbookRepository;


    List<AddressBookData> addressbookDataList = new ArrayList<>();

    @Override
    public List<AddressBookData> getAddressbookData() {
        return addressbookDataList;
    }

    @Override
    public AddressBookData getAddressbookDataById(int personId) {
        return addressbookDataList.stream()
                .filter(addressbookData -> addressbookData.getPersonId() == personId)
                .findFirst()
                .orElseThrow(() -> new AddressbookExcepation("Person Not found"));
    }

    @Override
    public AddressBookData createAddressbookData(AddressBookDTO addressbookDTO) {
        AddressBookData addressbookData = null;
        addressbookData = new AddressBookData (addressbookDTO);
        log.debug("AddressbookData: "+addressbookData.toString());
        return addressbookRepository.save(addressbookData);
    }

    @Override
    public AddressBookData updateAddressbookData(int id, AddressBookDTO addressbookDTO) {
        AddressBookData addressbookData = this.getAddressbookDataById(id);
        addressbookData.setFirstName(addressbookDTO.firstName);
        addressbookData.setLastName(addressbookDTO.lastName);
        addressbookData.setState(addressbookDTO.state);
        addressbookData.setCity(addressbookDTO.city);
        addressbookData.setZip(addressbookDTO.zip);
        addressbookData.setPhone(addressbookDTO.phone);
        addressbookRepository.save(addressbookData);
        return addressbookData;
    }

    @Override
    public void deleteAddressbookData(int personId) {
        int i = 1;
        addressbookDataList.remove(personId - 1);
        for (AddressBookData addressbookData : addressbookDataList) {
            addressbookData.setPersonId(i++);
        }
    }
}