package com.gocik.careers.controller;

import com.gocik.careers.entity.Vacancy;
import com.gocik.careers.service.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Goc1k
 */
@Controller
public class ApplicationController {

    @Autowired
    private VacancyService vacancyService;

    @RequestMapping("/")
    public String main() {
        return "main";
    }

    @RequestMapping("/jobs")
    public String jobs() {

        return "jobs";
    }

    @RequestMapping("/jobList")
    public ResponseEntity<Boolean> list() {
        Iterable<Vacancy> vacancyList = vacancyService.listAllVacancies();
        vacancyList.forEach((vacancy) -> {
            System.out.println(vacancy.getId() + " " + vacancy.getTitle() + " " + vacancy.getDescription());
        });
        return new ResponseEntity(false, HttpStatus.OK);
    }
}
