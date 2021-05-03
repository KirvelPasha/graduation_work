package com.mmf.service.dto;

public class RoleMapDto {
    private int userId;

    private String userRole;

    private int userRoleId;

    public RoleMapDto(int userId, int userRoleId) {
        this.userId = userId;
        this.userRoleId = userRoleId;
    }

    public RoleMapDto() {
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public int getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(int userRoleId) {
        this.userRoleId = userRoleId;
    }
}
