package CodingFactoryTasks.MobileContactsApp.Service;

import CodingFactoryTasks.MobileContactsApp.DTO.MobileContactInsertDTO;
import CodingFactoryTasks.MobileContactsApp.DTO.MobileContactUpdateDTO;
import CodingFactoryTasks.MobileContactsApp.Exceptions.MobileContactNotFoundException;
import CodingFactoryTasks.MobileContactsApp.Exceptions.PhoneNumberAlreadyExistsException;
import CodingFactoryTasks.MobileContactsApp.Model.MobileContact;

import java.util.List;

public interface IMobileContactService {

    MobileContact insertMobileContact(MobileContactInsertDTO mobileContactInsertDTO)
        throws PhoneNumberAlreadyExistsException;

    MobileContact updateContact(MobileContactUpdateDTO mobileContactUpdateDTO)
        throws MobileContactNotFoundException, PhoneNumberAlreadyExistsException;

    void deleteContactById(Long id) throws MobileContactNotFoundException;

    MobileContact getContactById(Long id) throws MobileContactNotFoundException;

    List<MobileContact> getAllContacts();

    MobileContact getContactByPhoneNumber(String phoneNumber) throws MobileContactNotFoundException;

    void deleteContactByPhoneNumber(String phoneNumber) throws MobileContactNotFoundException;
}
