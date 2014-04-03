/*
 * Created on 3 avr. 2014 ( Time 19:43:47 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */

package org.demo.validator;

import org.demo.bean.Synopsis ;
import org.demo.common.MessagesKeys;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

/**
 * Validator for entity Synopsis
 * 
 * @author Telosys Tools Generator
 *
 */
public class SynopsisValidator extends AbstractValidator<Synopsis>{

    @Override
    public void validateEntity(Synopsis entity, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "bookId", MessagesKeys.ID_MUST_DEFINE);


    }
}