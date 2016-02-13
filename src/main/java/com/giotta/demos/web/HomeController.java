package com.giotta.demos.web;

import com.giotta.demos.model.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

/**
 * @author John D Giotta.
 */
@RestController
public class HomeController {

    @RequestMapping(value = "/",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            method = RequestMethod.GET,
            headers = "Accept=application/json,application/xml")
    
    public @ResponseBody Person getPerson() {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Giotta");
        person.setEyeColor("Brown");
        person.setHairColor("Dark Brown");
        person.setSex("Male");
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, 1979);
        calendar.set(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 7);
        person.setDateOfBirth(calendar.getTime());

        return person;
    }
}
