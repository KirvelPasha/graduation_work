package com.mmf.dao.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "UNIVERSITY")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UNIVERSITY_ID", unique = true)
    private int universityId;

    @Column(name = "UNIVERSITY_NAME")
    private String universityName;

    @OneToMany(mappedBy = "university")
    private List<Specialty> specialtyList;


    public University() {
    }


    public int getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public List<Specialty> getSpecialtyList() {
        return specialtyList;
    }

    public void setSpecialtyList(List<Specialty> specialtyList) {
        this.specialtyList = specialtyList;
    }
}
