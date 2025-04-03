package CodingFactoryTasks.MobileContactsApp.DAO;

import CodingFactoryTasks.MobileContactsApp.Model.MobileContact;

import java.util.List;

public interface IMobileContactDAO {

    // Basic CRUD actions (add, update, delete, getOne, getAll)
    MobileContact insert(MobileContact mobileContact);
    MobileContact update(Long id, MobileContact mobileContact);
    void deleteById(Long id);
    MobileContact getById(Long id);
    List<MobileContact> getAll();

    // Additional contextual CRUD specific to the class
    void deleteByPhoneNumber(String phoneNumber);

    // Additional Queries
    MobileContact getByPhoneNumber(String phoneNumber);
    boolean userIdExists(Long id);
    boolean phoneNumberExists(String phoneNumber);
}
