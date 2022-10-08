package com.validation.appvalidation.api.rest.converter;

import com.validation.appvalidation.api.rest.models.request.ValidationRequestModel;
import com.validation.appvalidation.api.rest.models.response.ValidationResponseModel;
import com.validation.appvalidation.domain.entities.Validation;
import org.springframework.stereotype.Component;

@Component
public class ValidationConverter {

    public Validation toEntity(ValidationRequestModel requestModel) {
        Validation validation = new Validation();
        validation.setPassword(requestModel.getPassword());
        return validation;
    }

    public ValidationResponseModel toModel(Validation validation) {
        ValidationResponseModel validationResponseModel = new ValidationResponseModel();
        validationResponseModel.setValid(validation.getValid());
        return validationResponseModel;
    }
}
