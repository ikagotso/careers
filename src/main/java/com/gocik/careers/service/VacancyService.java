package com.gocik.careers.service;

import com.gocik.careers.entity.Vacancy;
import com.gocik.careers.entity.VacancyCategory;
import com.gocik.careers.entity.VacancyType;
import java.util.List;

/**
 *
 * @author Goc1k
 */
public interface VacancyService {

    List<Vacancy> listAllVacancies();

    List<Vacancy> filterVacancies(Vacancy vacancy);

    List<VacancyType> listAllVacancyTypes();

    List<VacancyCategory> listAllVacancyCategories();

    Vacancy saveVacancy(Vacancy vacancy);

    VacancyType saveVacancyType(String name);

    VacancyCategory saveVacancyCategory(String name);
}
