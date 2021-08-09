package cz.czechitas.java2webapps.lekce3.controller;

import cz.czechitas.java2webapps.lekce3.entity.Address;
import cz.czechitas.java2webapps.lekce3.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class MainController {
    @GetMapping("/")
    public ModelAndView card(){
        Address address=new Address("Ostřetín 183","Ostřetín", "53401");
        Person person= new Person("Jiří","Šurýn", LocalDate.of(1979,3,27));
        ModelAndView result= new ModelAndView("card");
        result.addObject(person);
        result.addObject(address);
        return result;

    }

}
