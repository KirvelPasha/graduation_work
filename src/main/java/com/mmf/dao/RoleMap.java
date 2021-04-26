package com.mmf.dao;

import javax.persistence.*;

@Entity
@Table(name = "ROLE_MAP")
public class RoleMap {

    @EmbeddedId
    private RoleMapPK id;

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
}
