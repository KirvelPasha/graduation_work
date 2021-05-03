package com.mmf.dao.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MODEL_USER_ROLE")
public class ModelUserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROLE_ID", unique = true)
    private Integer roleId;

    private String roleName;

    @OneToMany(mappedBy = "modelUserRole")
    private List<RoleMap> roleMaps;

    public ModelUserRole(Integer roleId) {
        this.roleId = roleId;
    }

    public ModelUserRole() {
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
