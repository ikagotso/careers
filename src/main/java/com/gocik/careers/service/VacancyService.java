package com.gocik.careers.service;

import com.gocik.careers.entity.Vacancy;

/**
 *
 * @author Goc1k
 */
public interface VacancyService {
    Iterable<Vacancy> listAllVacancies();
}
