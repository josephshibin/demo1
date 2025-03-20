package com.example.demo;


import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.util.List;

@WebService
public interface UserSoapServiceInterface {

   @WebMethod
    String getUserInfo(String employeeId);


    @WebMethod
    List<UserEntity> getAllUsers();

    @WebMethod
    String exportToQuickBooks();

    @WebMethod
    String importFromQuickBooks(String requestData);
}