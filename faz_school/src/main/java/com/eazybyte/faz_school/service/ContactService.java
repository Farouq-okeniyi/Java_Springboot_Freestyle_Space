package com.eazybyte.faz_school.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.eazybyte.faz_school.model.Contact;
@Service
public class ContactService {
    private Logger log = LoggerFactory.getLogger(ContactService.class);

    public Boolean saveMessageDetails(Contact contact){
        boolean isSaved = true;

        log.info(contact.toString());

        return isSaved;

    }
}
