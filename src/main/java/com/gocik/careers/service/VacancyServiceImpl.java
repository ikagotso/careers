package com.gocik.careers.service;

import com.gocik.careers.entity.Vacancy;
import com.gocik.careers.entity.VacancyCategory;
import com.gocik.careers.entity.VacancyType;
import com.gocik.careers.repository.VacancyRepository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Goc1k
 */
@Service
public class VacancyServiceImpl implements VacancyService {

    @PersistenceContext
    private EntityManager em;

    private VacancyRepository vacancyRepository;

    @Autowired
    public void setProductRepository(VacancyRepository vacancyRepository) {
        this.vacancyRepository = vacancyRepository;
    }

    @Override
    public Iterable<Vacancy> listAllVacancies() {
        return vacancyRepository.findAll();
    }

    @Override
    @Transactional
    public VacancyType saveVacancyType(String name) {
        VacancyType type = new VacancyType();
        type.setName(name);
        return em.merge(type);
    }

    @Override
    @Transactional
    public VacancyCategory saveVacancyCategory(String name) {
        VacancyCategory category = new VacancyCategory();
        category.setName(name);
        return em.merge(category);
    }

}
