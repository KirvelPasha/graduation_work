package com.mmf.service.converter;

import com.mmf.dao.entity.ModelUser;
import com.mmf.dao.entity.ModelUserRole;
import com.mmf.dao.entity.RoleMap;
import com.mmf.service.dto.RoleMapDto;
import org.springframework.stereotype.Component;

@Component
public class RoleMapConverter {
    public RoleMap converter(RoleMapDto roleMapDto) {
        RoleMap roleMap = new RoleMap();
        roleMap.setModelUser(new ModelUser(roleMapDto.getUserId()));
        roleMap.setModelUserRole(new ModelUserRole(roleMapDto.getUserRoleId()));
        return roleMap;
    }
}
