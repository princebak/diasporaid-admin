package com.kindev.diasporaidadmin.service;

import com.kindev.diasporaidadmin.model.Registration;

import java.util.List;

public interface RegistrationService {
    Registration findRegistrationById();
    List<Registration> findAllRegistration();
}
