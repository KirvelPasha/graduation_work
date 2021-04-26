package com.mmf.dao;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class RoleMapPK implements Serializable {
    @Column(name = "USER_ID")
    private int modelUserId;

    @Column(name = "ROLE_ID")
    private int modelUserRoleId;

    public RoleMapPK(int modelUserId, int modelUserRoleId) {
        this.modelUserId = modelUserId;
        this.modelUserRoleId = modelUserRoleId;
    }

    public RoleMapPK() {
    }
}
