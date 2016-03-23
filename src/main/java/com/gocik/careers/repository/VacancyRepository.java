package com.gocik.careers.repository;

import com.gocik.careers.entity.Vacancy;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Goc1k
 */
public interface VacancyRepository extends CrudRepository<Vacancy, Integer> {
//    Integer countByUsername(String username);

    
////    Optional<Vacancy> authenticate(@Param("uname") String uname, @Param("psw") String psw);
//    @Query("SELECT t FROM Vacancy t")
//    Optional<Vacancy> getVacancyList();
}