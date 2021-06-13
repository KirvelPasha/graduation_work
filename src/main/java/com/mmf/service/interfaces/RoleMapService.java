package com.mmf.service.interfaces;

import com.mmf.dao.entity.RoleMap;
import com.mmf.service.dto.RoleMapDto;

public interface RoleMapService {
    void save(RoleMapDto roleMapDto);

    void delete(RoleMapDto roleMapDto);
}
