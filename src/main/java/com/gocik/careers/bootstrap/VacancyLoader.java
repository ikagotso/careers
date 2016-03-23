package com.gocik.careers.bootstrap;

import com.gocik.careers.entity.Vacancy;
import com.gocik.careers.repository.VacancyRepository;
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
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("Context refreshed DUDE");
        Vacancy firstDummy = new Vacancy();
        firstDummy.setTitle("Gondor");
        firstDummy.setDescription("Battle is Lost");
        vacancyRepository.save(firstDummy);
        
//        User secondDummy = new User();
//        secondDummy.setUsername("alakh");
//        secondDummy.setPassword("akbar");
//        secondDummy.setBirthDate(new GregorianCalendar(1988, 4, 1).getTime());
//        secondDummy.setName("Ousama Mellouli");
//        secondDummy.setPhoneNumber("500001002");
//        secondDummy.setMonthlySalary(10000);
//        secondDummy.setCurrentLiabilities(3000);
//        userRepository.save(secondDummy);
//        
        System.out.println("Guys Saved DUDE");
    }
}
