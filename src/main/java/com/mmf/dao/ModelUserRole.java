package com.mmf.dao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MODEL_USER_ROLE")
public class ModelUserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROLE_ID", unique = true, nullable = false)
    private int roleId;

    private String roleName;

    @OneToMany(mappedBy = "modelUserRole")
    private List<RoleMap> roleMaps;

    public ModelUserRole() {
    }
}
