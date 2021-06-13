package com.mmf.dao.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USER_SCHOOL")
public class UserSchool {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SCHOOL_ID", unique = true)
    private int schoolId;

    @Column(name = "SCHOOL_NAME")
    private String schoolName;

    @OneToMany(mappedBy = "userSchool")
    private List<ModelUser> modelUserList;


    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public List<ModelUser> getModelUserList() {
        return modelUserList;
    }

    public void setModelUserList(List<ModelUser> modelUserList) {
        this.modelUserList = modelUserList;
    }
}
