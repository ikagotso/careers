package com.gocik.careers.controller;

import com.gocik.careers.entity.Vacancy;
import com.gocik.careers.entity.VacancyCategory;
import com.gocik.careers.entity.VacancyType;
import com.gocik.careers.service.VacancyService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    public ResponseEntity<List<Vacancy>> listJobs() {
        List<Vacancy> vacancyList = vacancyService.listAllVacancies();
        vacancyList.forEach((vacancy) -> {
            System.out.println(vacancy.getId() + " " + vacancy.getTitle() + " " + vacancy.getDescription());
        });
        return new ResponseEntity(vacancyList, HttpStatus.OK);
    }

    @RequestMapping(value = "/filterJobs", method = RequestMethod.POST)
    public ResponseEntity<List<Vacancy>> authenticate(HttpServletRequest request, @RequestBody Vacancy vacancy) {
        System.out.println("Filtering with params " + vacancy.getVacancyType().getName() + " " + vacancy.getVacancyCategory().getName());
        List<Vacancy> vacancyList = vacancyService.filterVacancies(vacancy);
//        if (result != null) {
//            request.getSession().setAttribute("sessionUser", result);
//            return new ResponseEntity(result, HttpStatus.OK);
//        }

        vacancyList.forEach((v) -> {
            System.out.println(v.getId() + " " + v.getTitle() + " " + v.getDescription());
        });
        return new ResponseEntity(vacancyList, HttpStatus.OK);
    }

    //
    @RequestMapping("/catList")
    public ResponseEntity<List<VacancyCategory>> listCategories() {
        List<VacancyCategory> vacancyList = vacancyService.listAllVacancyCategories();
        vacancyList.forEach((vacancyCategory) -> {
            System.out.println(vacancyCategory.getId() + " " + vacancyCategory.getName());
        });
        return new ResponseEntity(vacancyList, HttpStatus.OK);
    }

    @RequestMapping("/typeList")
    public ResponseEntity<List<VacancyType>> listTypes() {
        List<VacancyType> vacancyList = vacancyService.listAllVacancyTypes();
        vacancyList.forEach((vacancyType) -> {
            System.out.println(vacancyType.getId() + " " + vacancyType.getName());
        });
        return new ResponseEntity(vacancyList, HttpStatus.OK);
    }
}
