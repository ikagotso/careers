package com.gocik.careers.service;

import com.gocik.careers.entity.Vacancy;
import com.gocik.careers.entity.VacancyCategory;
import com.gocik.careers.entity.VacancyType;
import com.gocik.careers.repository.VacancyRepository;
import java.util.HashMap;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
    public List<Vacancy> listAllVacancies() {
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

    @Override
    public List<VacancyType> listAllVacancyTypes() {
        Query query = em.createQuery("From VacancyType", VacancyType.class);
        List<VacancyType> list = query.getResultList();
        return list;
    }

    @Override
    public List<VacancyCategory> listAllVacancyCategories() {
        Query query = em.createQuery("From VacancyCategory", VacancyCategory.class);
        List<VacancyCategory> list = query.getResultList();
        return list;
    }

    @Override
    public List<Vacancy> filterVacancies(Vacancy vacancy) {
        StringBuilder queryString = new StringBuilder("From Vacancy t where 1=1");
        HashMap<String, Object> parameterMap = new HashMap();

        if (vacancy.getVacancyType() != null) {
            queryString.append(" and t.vacancyType.id = :vacancyTypeId ");
            parameterMap.put("vacancyTypeId", vacancy.getVacancyType().getId());
        }

        if (vacancy.getVacancyCategory() != null) {
            queryString.append(" and t.vacancyCategory.id = :vacancyCategoryId ");
            parameterMap.put("vacancyCategoryId", vacancy.getVacancyCategory().getId());
        }
        Query query = em.createQuery(queryString.toString());
        createQueryParameter(parameterMap, query);
        
        List<Vacancy> resultList = query.getResultList();
        return resultList;
    }

    private void createQueryParameter(HashMap<String, Object> map, Query query) {
        map.forEach((k, v) -> {
            query.setParameter(k, v);
        });
    }

}
