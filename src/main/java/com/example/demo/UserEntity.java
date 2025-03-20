package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Document(collection = "users") // Use the actual collection name in MongoDB
public class UserEntity {

    @Id
    @Field("employeeId")
    private String employeeId;

    private String id;
    private boolean isAccessSuspended;
    private boolean isAccessTerminated;
    private boolean isAdminVerified;
    private boolean isVerified;
    private long passwordCode;
    private int uploadJhaCount;
    private int auditJhaCount;
    private int transcribeCount;
    private boolean isContractorAsOwner;

    private String firstName;
    private String lastName;
    private String password;
    private String username;
    private String email;

    
    private List<String> moduleAccessPrivileges;

    private NestedObject company;
    private NestedObject job;
    private Role role;
    private String defaultModuleView;

    private List<String> permittedSites;

    private Date createdAt;
    private Date updatedAt;

    // Getters and Setters

    public static class NestedObject {
        private String oid; // Refers to $oid
        // Getters and Setters
    }

    public String getName() { // This should exist
        return firstName;
    }

    public String getEmail() {
        return email;
    }


    public static class Role {
        private String key;
        private NestedObject role;
        private Date createdAt;
        private Date updatedAt;
        // Getters and Setters
    }
}