package CodingFactoryTasks.MobileContactsApp.Service;

import CodingFactoryTasks.MobileContactsApp.DAO.IMobileContactDAO;
import CodingFactoryTasks.MobileContactsApp.DTO.MobileContactInsertDTO;
import CodingFactoryTasks.MobileContactsApp.DTO.MobileContactUpdateDTO;
import CodingFactoryTasks.MobileContactsApp.Exceptions.MobileContactNotFoundException;
import CodingFactoryTasks.MobileContactsApp.Exceptions.PhoneNumberAlreadyExistsException;
import CodingFactoryTasks.MobileContactsApp.Model.MobileContact;

import java.util.List;

public class MobileContactServiceImpl implements IMobileContactService{
    private final IMobileContactDAO dao;

    public MobileContactServiceImpl(IMobileContactDAO dao) {
        this.dao = dao;
    }

    @Override
    public MobileContact insertMobileContact(MobileContactInsertDTO mobileContactInsertDTO)
            throws PhoneNumberAlreadyExistsException {
        MobileContact mobileContact;
        try {

            if (dao.phoneNumberExists(mobileContactInsertDTO.getPhoneNumber())) {
                throw new PhoneNumberAlreadyExistsException("User with phone number"
                        + mobileContactInsertDTO.getPhoneNumber() + "already exists");
            }

            mobileContact = mapInsertDTOToContact(mobileContactInsertDTO);
            System.err.printf("User Logger: %s was inserted\n", mobileContact);
            return dao.insert(mobileContact);
        } catch (PhoneNumberAlreadyExistsException e) {
            System.err.printf("User with phone Number %s already exists", mobileContactInsertDTO.getPhoneNumber());
            throw e;
        }
    }

    @Override
    public MobileContact updateContact(MobileContactUpdateDTO updateDTO)
            throws MobileContactNotFoundException, PhoneNumberAlreadyExistsException {
        MobileContact mobileContact;
        MobileContact newContact;

        try {
            if (!dao.userIdExists(updateDTO.getId())) {
                throw new MobileContactNotFoundException("Contact Not Found");
            }

            mobileContact = dao.getById(updateDTO.getId());
            boolean isPhoneNumberOurOwn = mobileContact.getPhoneNumber().equals(updateDTO.getPhoneNumber());
            boolean isPhoneNumberExists = dao.phoneNumberExists(updateDTO.getPhoneNumber());

            if (isPhoneNumberExists && !isPhoneNumberOurOwn) {
                throw new PhoneNumberAlreadyExistsException("User with phone number" +
                                                updateDTO.getPhoneNumber() + "already exists");
            }

            newContact = mapUpdateDTOToContact(updateDTO);
            System.err.printf("User Logger: %s was updated with following info: %s", mobileContact, newContact);
            return dao.update(updateDTO.getId(), newContact);
        } catch (MobileContactNotFoundException | PhoneNumberAlreadyExistsException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }

    @Override
    public void deleteContactById(Long id) throws MobileContactNotFoundException {
        try {
            if (!dao.userIdExists(id)) {
                throw new MobileContactNotFoundException("Contact with id: " + id + " already exists" );
            }

            System.err.printf("User Logger: User with id: %s was deleted", id);
            dao.deleteById(id);
        } catch (MobileContactNotFoundException e) {
            System.err.printf("User with id: %d not found for delete.\n", id);
            throw e;
        }
    }

    @Override
    public MobileContact getContactById(Long id) throws MobileContactNotFoundException {

        // Αυτα στα σχολια ειναι η υλποιηση του Ανδρουτσου ειναι παραπανω efficient.
//        MobileContact mobileContact;
        try {
//            mobileContact = dao.getById(id);
//            if (mobileContact == null) {
            if (!dao.userIdExists(id)) {
                throw new MobileContactNotFoundException("Contact with id: " + id + " not found");
            }
//            return mobileContact;
            return dao.getById(id);
        } catch (MobileContactNotFoundException e) {
            System.err.printf("User with id: %s not found", id);
            throw e;
        }
    }

    @Override
    public List<MobileContact> getAllContacts() {
        return dao.getAll();
    }

    @Override
    public MobileContact getContactByPhoneNumber(String phoneNumber) throws MobileContactNotFoundException {
        MobileContact mobileContact;
        try {
            mobileContact = dao.getByPhoneNumber(phoneNumber);
            if (mobileContact == null) {
                throw new MobileContactNotFoundException(phoneNumber);
            }
            return mobileContact;
        } catch (MobileContactNotFoundException e) {
            System.err.printf("User with phone number: %s was not found\n", phoneNumber);
            throw e;
        }
    }

    @Override
    public void deleteContactByPhoneNumber(String phoneNumber) throws MobileContactNotFoundException {
        try {
            if (!dao.phoneNumberExists(phoneNumber)) {
                throw new MobileContactNotFoundException("Contact with phone: " + phoneNumber + "not found");
            }
            System.err.println("User with phone number: " + phoneNumber + " was deleted");
            dao.deleteByPhoneNumber(phoneNumber);
        } catch (MobileContactNotFoundException e) {
            System.err.println("User with phone: " + phoneNumber + "not found");
            throw e;
        }
    }

    private MobileContact mapInsertDTOToContact(MobileContactInsertDTO dto) {
        return new MobileContact(null, dto.getFirstname(), dto.getLastname(), dto.getPhoneNumber());
    }

    private MobileContact mapUpdateDTOToContact(MobileContactUpdateDTO dto) {
        return new MobileContact(dto.getId(), dto.getFirstname(), dto.getLastname(), dto.getPhoneNumber());
    }
}
