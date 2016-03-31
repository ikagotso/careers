package com.gocik.careers.repository;

import com.gocik.careers.entity.Vacancy;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Goc1k
 */
public interface VacancyRepository extends JpaRepository<Vacancy, Integer> {
//    Integer countByUsername(String username);

    
////    Optional<Vacancy> authenticate(, @Param("psw") String psw);
//    @Query(value = "insert into VacancyType (name) VALUES (:name)")
//    void saveVacancyType(@Param("name") String name);
}
