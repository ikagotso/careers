package com.gocik.careers.service;

import com.gocik.careers.entity.Vacancy;
import com.gocik.careers.entity.VacancyCategory;
import com.gocik.careers.entity.VacancyType;

/**
 *
 * @author Goc1k
 */
public interface VacancyService {
    Iterable<Vacancy> listAllVacancies();
    VacancyType saveVacancyType(String name);
    VacancyCategory saveVacancyCategory(String name);
}
