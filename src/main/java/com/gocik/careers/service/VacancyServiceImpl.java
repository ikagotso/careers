package com.gocik.careers.service;

import com.gocik.careers.entity.Vacancy;
import com.gocik.careers.repository.VacancyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Goc1k
 */
@Service
public class VacancyServiceImpl implements VacancyService {

    private VacancyRepository vacancyRepository;

    @Autowired
    public void setProductRepository(VacancyRepository vacancyRepository) {
        this.vacancyRepository = vacancyRepository;
    }

    @Override
    public Iterable<Vacancy> listAllVacancies() {
        return vacancyRepository.findAll();
    }
//    
//    @Override
//    public User getUserById(Integer id) {
//        return userRepository.findOne(id);
//    }
//
//    @Override
//    public User saveUser(User user) {
//        User result = userRepository.save(user);
//        if (result != null && result.getBirthDate() != null && result.getMonthlySalary() != null) {
//
//            Calendar cal = Calendar.getInstance();
//            cal.setTime(result.getBirthDate());
//            int year = cal.get(Calendar.YEAR);
//            int month = cal.get(Calendar.MONTH);
//            int day = cal.get(Calendar.DAY_OF_MONTH);
//            LocalDate start = LocalDate.of(year, month + 1, day);
//            LocalDate end = LocalDate.now();
//            long age = ChronoUnit.YEARS.between(start, end);
//            int currentLiabilities = result.getCurrentLiabilities() == null ? 0 : result.getCurrentLiabilities();
//            result.setAgeInYears(age);
//            result.setCreditLimit(age * 10 + result.getMonthlySalary() - currentLiabilities);
//            System.out.println("age=" + result.getAgeInYears() + " cred=" + result.getCreditLimit());
//
//        }
//        return result;
//    }
//
//    @Override
//    public boolean isUnique(String username) {
//        return userRepository.countByUsername(username) == 0;
//    }
//
//    @Override
//    public User authenticate(String username, String password) {
//        User result = userRepository.authenticate(username, password).orElse(null);
//        if (result != null && result.getBirthDate() != null && result.getMonthlySalary() != null) {
//            LocalDate start = LocalDate.parse(result.getBirthDate().toString());
//            LocalDate end = LocalDate.now();
//            long age = ChronoUnit.YEARS.between(start, end);
//            int currentLiabilities = result.getCurrentLiabilities() == null ? 0 : result.getCurrentLiabilities();
//            result.setAgeInYears(age);
//            result.setCreditLimit(age * 10 + result.getMonthlySalary() - currentLiabilities);
//            System.out.println("age=" + result.getAgeInYears() + " cred=" + result.getCreditLimit());
//
//        }
//        return result;
//    }
}
