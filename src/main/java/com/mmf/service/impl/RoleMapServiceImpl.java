package com.mmf.service.impl;

import com.mmf.dao.repository.RoleMapRepository;
import com.mmf.service.interfaces.RoleMapService;
import com.mmf.service.converter.RoleMapConverter;
import com.mmf.service.dto.RoleMapDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleMapServiceImpl implements RoleMapService {
    private final RoleMapRepository roleMapRepository;
    private final RoleMapConverter roleMapConverter;

    @Autowired
    public RoleMapServiceImpl(RoleMapRepository roleMapRepository, RoleMapConverter roleMapConverter) {
        this.roleMapRepository = roleMapRepository;
        this.roleMapConverter = roleMapConverter;
    }

    @Override
    public void save(RoleMapDto roleMapDto) {
        roleMapRepository.save(roleMapConverter.converter(roleMapDto));
    }

    @Override
    public void delete(RoleMapDto roleMapDto) {
        roleMapRepository.delete(roleMapDto.getUserId(), roleMapDto.getUserRoleId());
    }

}
