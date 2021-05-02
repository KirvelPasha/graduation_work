package com.mmf.dao.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MODEL_USER")
public class ModelUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID", unique = true)
    private int userId;

    @OneToMany(mappedBy = "modelUser")
    private List<RoleMap> roleMaps;

    public ModelUser() {

    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<RoleMap> getRoleMaps() {
        return roleMaps;
    }

    public void setRoleMaps(List<RoleMap> roleMaps) {
        this.roleMaps = roleMaps;
    }
}
