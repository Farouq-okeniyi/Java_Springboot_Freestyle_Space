package com.eazybyte.faz_school.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RequestMethod;
// import ch.qos.logback.core.model.Model;
import org.springframework.web.servlet.ModelAndView;
import com.eazybyte.faz_school.service.ContactService;
import com.eazybyte.faz_school.model.Contact;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ContactController {
    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService){
        this.contactService= contactService;
    }
    @RequestMapping(value = "contact")
    public String displayContactPage(){
        return "contact.html";
    }

    @PostMapping(value ="/saveMsg")
    public ModelAndView saveMessage(Contact contact){
        contactService.saveMessageDetails(contact);
        return new ModelAndView("redirect:/contact");
    }
}

        // @RequestMapping(value="/saveMsg", method = RequestMethod.POST)
        // @PostMapping(value="/saveMsg")
        // public ModelAndView saveMessage(@RequestParam String name, @RequestParam String email, @RequestParam String mobileNum, 
        //                                 @RequestParam String subject, @RequestParam String message){
        //     log.info("Name : "+ name);
        //     log.info("Email : " + email);
        //     log.info("Mobile Number : " + mobileNum);
        //     log.info("SUbject : "+ subject);
        //     log.info("Message : "+ message);
        //     return new ModelAndView("redirect:/contact");
        // }