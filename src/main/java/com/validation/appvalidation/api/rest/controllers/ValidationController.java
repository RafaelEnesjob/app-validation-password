package com.validation.appvalidation.api.rest.controllers;

import com.validation.appvalidation.api.rest.converter.ValidationConverter;
import com.validation.appvalidation.api.rest.models.request.ValidationRequestModel;
import com.validation.appvalidation.api.rest.models.response.ValidationResponseModel;
import com.validation.appvalidation.domain.entities.Validation;
import com.validation.appvalidation.domain.services.ValidationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/validation")
@CrossOrigin(origins = "*")
public class ValidationController {

    private final ValidationService service;

    private final ValidationConverter converter;

    public ValidationController(ValidationService service, ValidationConverter converter) {
        this.service = service;
        this.converter = converter;
    }

    @PostMapping
    public ResponseEntity<ValidationResponseModel> enterPassword(@Valid @RequestBody ValidationRequestModel validationRequest) {
        Validation validation = converter.toEntity(validationRequest);
        return new ResponseEntity<>(converter.toModel(service.enterPassword(validation)), HttpStatus.OK);
    }
}
