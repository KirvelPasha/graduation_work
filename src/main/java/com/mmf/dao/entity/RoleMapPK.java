package com.mmf.dao.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class RoleMapPK implements Serializable {
    private int modelUserId;

    private int modelUserRoleId;

    public RoleMapPK(int modelUserId, int modelUserRoleId) {
        this.modelUserId = modelUserId;
        this.modelUserRoleId = modelUserRoleId;
    }

    public RoleMapPK() {
    }

    public int getModelUserId() {
        return modelUserId;
    }

    public void setModelUserId(int modelUserId) {
        this.modelUserId = modelUserId;
    }

    public int getModelUserRoleId() {
        return modelUserRoleId;
    }

    public void setModelUserRoleId(int modelUserRoleId) {
        this.modelUserRoleId = modelUserRoleId;
    }
}
