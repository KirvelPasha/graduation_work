package com.mmf.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "ROLE_MAP")
public class RoleMap {

    @EmbeddedId
    private RoleMapPK id = new RoleMapPK();

    @ManyToOne
    @MapsId("modelUserId")
    @JoinColumn(name = "USER_ID")
    private ModelUser modelUser;

    @ManyToOne
    @MapsId("modelUserRoleId")
    @JoinColumn(name = "ROLE_ID")
    private ModelUserRole modelUserRole;

    public RoleMap(RoleMapPK id) {
        this.id = id;
    }

    public RoleMap() {

    }

    public RoleMapPK getId() {
        return id;
    }

    public void setId(RoleMapPK id) {
        this.id = id;
    }

    public ModelUser getModelUser() {
        return modelUser;
    }

    public void setModelUser(ModelUser modelUser) {
        this.modelUser = modelUser;
    }

    public ModelUserRole getModelUserRole() {
        return modelUserRole;
    }

    public void setModelUserRole(ModelUserRole modelUserRole) {
        this.modelUserRole = modelUserRole;
    }
}
