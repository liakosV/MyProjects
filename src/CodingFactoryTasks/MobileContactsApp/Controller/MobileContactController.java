package CodingFactoryTasks.MobileContactsApp.Controller;

import CodingFactoryTasks.MobileContactsApp.DAO.IMobileContactDAO;
import CodingFactoryTasks.MobileContactsApp.DAO.MobileContactDAOImpl;
import CodingFactoryTasks.MobileContactsApp.DTO.MobileContactInsertDTO;
import CodingFactoryTasks.MobileContactsApp.DTO.MobileContactReadOnlyDTO;
import CodingFactoryTasks.MobileContactsApp.DTO.MobileContactUpdateDTO;
import CodingFactoryTasks.MobileContactsApp.Exceptions.MobileContactNotFoundException;
import CodingFactoryTasks.MobileContactsApp.Exceptions.PhoneNumberAlreadyExistsException;
import CodingFactoryTasks.MobileContactsApp.Model.MobileContact;
import CodingFactoryTasks.MobileContactsApp.Service.IMobileContactService;
import CodingFactoryTasks.MobileContactsApp.Service.MobileContactServiceImpl;
import CodingFactoryTasks.MobileContactsApp.Validation.ValidationUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MobileContactController {

    IMobileContactDAO dao = new MobileContactDAOImpl();
    IMobileContactService service = new MobileContactServiceImpl(dao);

    public String insertContact(MobileContactInsertDTO insertDTO) {
        try {

            // Validate input data otherwise return failure
            String error = ValidationUtil.validateDTO(insertDTO);
            if (!error.isEmpty()) return "Error Validation Error\n" + error;

            // If validation ok, insert contact
            MobileContact mobileContact = service.insertMobileContact(insertDTO);
            MobileContactReadOnlyDTO readOnlyDTO = mapMobileContactToDTO(mobileContact);

            // Return back to the client success code and details
            return "OK\n" + serializeDTO(readOnlyDTO) + "\n";
        } catch (PhoneNumberAlreadyExistsException e) {
            return "Error\n Λαθος κατα την εισαγωγη. Το τηλεφωνο υπαρχει ηδη\n";
        }
    }

    public String updateContact(MobileContactUpdateDTO updateDTO) {
        try {

            // Validate input data otherwise return failure
            String error = ValidationUtil.validateDTO(updateDTO);
            if (!error.isEmpty()) return "Error Validation Error\n" + error;

            // If validation ok, insert contact
            MobileContact mobileContact = service.updateContact(updateDTO);
            MobileContactReadOnlyDTO readOnlyDTO = mapMobileContactToDTO(mobileContact);

            // Return back to the client success code and details
            return "OK\n" + serializeDTO(readOnlyDTO) + "\n";
        } catch (MobileContactNotFoundException e) {
            return "Error\n Λαθος κατα την ενημερωση. Το τηλεφωνο δεν υπαρχει\n";
        } catch (PhoneNumberAlreadyExistsException e) {
            return "Error\n Λαθος κατα την ενημερωση. Το τηλεφωνο υπαρχει ηδη\n";
        }
    }

    public String deleteContactById(Long id) {
        try {
            service.deleteContactById(id);
            return "OK\n Ο χρηστης διαγραφηκε";
        } catch (MobileContactNotFoundException e) {
            return "Error\n Λαθος κατα την διαγραφη. Η επαφη δεν υπαρχει\n";
        }
    }

    public String getContactById(Long id) {
        try {
            MobileContact mobileContact = service.getContactById(id);
            MobileContactReadOnlyDTO readOnlyDTO = mapMobileContactToDTO(mobileContact);
            return "OK\n" + serializeDTO(readOnlyDTO);
        } catch (MobileContactNotFoundException e) {
            return "Error\n Η επαφη δεν υπαρχει\n";
        }
    }

    public List<String> getAllContacts() {
        List<MobileContact> contacts;
        List<String> serializedList = new ArrayList<>();

        contacts = service.getAllContacts();
        for (MobileContact contact : contacts) {
            String serialized = serializeDTO(mapMobileContactToDTO(contact));
            serializedList.add(serialized);
        }
        return serializedList;

//        return contacts.stream()
//                .map(this::mapMobileContactToDTO)
//                .map(this::serializeDTO)
//                .collect(Collectors.toList());
    }

    public String getContactByPhoneNumber(String phoneNumber) {
        try {
            MobileContact mobileContact = service.getContactByPhoneNumber(phoneNumber);
            MobileContactReadOnlyDTO readOnlyDTO = mapMobileContactToDTO(mobileContact);
            return "OK\n" + serializeDTO(readOnlyDTO);
        } catch (MobileContactNotFoundException e) {
            return "Error\n Η επαφη δεν υπαρχει\n";
        }
    }

    public String deleteContact(String phoneNumber) {
        try {
            MobileContact mobileContact = service.getContactByPhoneNumber(phoneNumber);
            MobileContactReadOnlyDTO readOnlyDTO = mapMobileContactToDTO(mobileContact);
            service.deleteContactByPhoneNumber(phoneNumber);
            return "OK\n" + serializeDTO(readOnlyDTO);
        } catch (MobileContactNotFoundException e) {
            return "Error\n Η επαφη δεν υπαρχει\n";
        }
    }

    private MobileContactReadOnlyDTO mapMobileContactToDTO(MobileContact mobileContact) {
        return new MobileContactReadOnlyDTO(mobileContact.getId(), mobileContact.getFirstname(),
                mobileContact.getLastname(), mobileContact.getPhoneNumber());

    }

    private String serializeDTO(MobileContactReadOnlyDTO readOnlyDTO) {
        return "ID: " + readOnlyDTO.getId() + ", Ονομα: " +readOnlyDTO.getFirstname() + ", Επωνυμο: " +readOnlyDTO.getLastname()
                + ", Τηλεφωνο: " + readOnlyDTO.getPhoneNumber();
    }
}
