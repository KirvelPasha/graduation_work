package com.mmf.service.impl;

import com.mmf.dao.entity.RoleMap;
import com.mmf.dao.repository.RoleMapRepository;
import com.mmf.service.RoleMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleMapServiceImpl implements RoleMapService {
    private final RoleMapRepository roleMapRepository;

    @Autowired
    public RoleMapServiceImpl(RoleMapRepository roleMapRepository) {
        this.roleMapRepository = roleMapRepository;
    }

    @Override
    public void save(RoleMap roleMap) {
        roleMapRepository.save(roleMap);
    }
}
