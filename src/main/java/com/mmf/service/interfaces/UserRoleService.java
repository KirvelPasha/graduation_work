package com.mmf.service.interfaces;

import com.mmf.dao.entity.ModelUserRole;

import java.util.List;
import java.util.Optional;

public interface UserRoleService {
    Optional<ModelUserRole> getUseRoleById(int userRoleId);

    List<ModelUserRole> getAll();
}
