package com.mmf.dao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MODEL_USER")
public class ModelUser {

    @Id
    @Column(name = "USER_ID", unique = true, nullable = false)
    private int userId;

    @OneToMany(mappedBy = "modelUser")
    private List<RoleMap> roleMaps;

    public ModelUser() {

    }
}
