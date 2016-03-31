package com.gocik.careers.bootstrap;

import com.gocik.careers.entity.Vacancy;
import com.gocik.careers.entity.VacancyCategory;
import com.gocik.careers.entity.VacancyType;
import com.gocik.careers.repository.VacancyRepository;
import com.gocik.careers.service.VacancyService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 *
 * @author Goc1k
 */
@Component
public class VacancyLoader implements ApplicationListener<ContextRefreshedEvent> {

    private VacancyRepository vacancyRepository;

    @Autowired
    public void setProductRepository(VacancyRepository vacancyRepository) {
        this.vacancyRepository = vacancyRepository;
    }

    @Autowired
    private VacancyService vacancyService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("Context refreshed DUDE");

        VacancyType firstType = vacancyService.saveVacancyType("Internship");
        VacancyType secondType = vacancyService.saveVacancyType("Full Time");

        VacancyCategory firstCategory = vacancyService.saveVacancyCategory("Finances");
        VacancyCategory secondCategory = vacancyService.saveVacancyCategory("IT");

        Vacancy firstDummy = new Vacancy();
        firstDummy.setTitle("Gondor");
        firstDummy.setCompanyName("LOTR Corp");
        firstDummy.setFromDate(new Date());
        firstDummy.setToDate(new Date());
        firstDummy.setCreateDate(new Date());
        firstDummy.setDescription("Battle is Lost");
        firstDummy.setVacancyType(firstType);
        firstDummy.setVacancyCategory(firstCategory);
        vacancyRepository.save(firstDummy);

        Vacancy secondDummy = new Vacancy();
        secondDummy.setTitle("Potions Master");
        secondDummy.setCompanyName("Hogwarts Inc");
        secondDummy.setFromDate(new Date());
        secondDummy.setToDate(new Date());
        secondDummy.setCreateDate(new Date());
        secondDummy.setDescription("Living Death");
        secondDummy.setVacancyType(secondType);
        secondDummy.setVacancyCategory(secondCategory);
        vacancyRepository.save(secondDummy);

        System.out.println("Guys Saved DUDE");
    }
}
