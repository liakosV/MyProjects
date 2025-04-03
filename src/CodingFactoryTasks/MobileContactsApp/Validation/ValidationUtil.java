package CodingFactoryTasks.MobileContactsApp.Validation;

import CodingFactoryTasks.MobileContactsApp.DTO.MobileContactInsertDTO;
import CodingFactoryTasks.MobileContactsApp.DTO.MobileContactUpdateDTO;

public class ValidationUtil {

    private ValidationUtil() {}

    public static String validateDTO(MobileContactInsertDTO insertDTO) {
        String errorResponse = "";
        if (insertDTO.getPhoneNumber().trim().length() <= 5) errorResponse += "Phone length must be greater than 5 symbols\n";
        if (insertDTO.getFirstname().trim().length() < 2) errorResponse += "firstname length must be greater-equal than 2 symbols\n";
        if (insertDTO.getLastname().trim().length() < 2) errorResponse += "lastname length must be greater-equal than 2 symbols\n";
        return errorResponse;
    }

    public static String validateDTO(MobileContactUpdateDTO updateDTO) {
        String errorResponse = "";
        if (updateDTO.getPhoneNumber().trim().length() <= 5) errorResponse += "Phone length must be greater than 5 symbols\n";
        if (updateDTO.getFirstname().trim().length() < 2) errorResponse += "firstname length must be greater-equal than 2 symbols\n";
        if (updateDTO.getLastname().trim().length() < 2) errorResponse += "lastname length must be greater-equal than 2 symbols\n";
        return errorResponse;
    }
}
