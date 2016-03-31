package com.gocik.careers.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Goc1k
 */
@Entity
public class Vacancy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String companyName;
    private String description;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fromDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date toDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date createDate;
    @ManyToOne
    private VacancyType vacancyType;
    @ManyToOne
    private VacancyCategory vacancyCategory;

    public VacancyType getVacancyType() {
        return vacancyType;
    }

    public void setVacancyType(VacancyType vacancyType) {
        this.vacancyType = vacancyType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public VacancyCategory getVacancyCategory() {
        return vacancyCategory;
    }

    public void setVacancyCategory(VacancyCategory vacancyCategory) {
        this.vacancyCategory = vacancyCategory;
    }

}
