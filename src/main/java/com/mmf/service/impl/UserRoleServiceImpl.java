package com.mmf.service.impl;

import com.mmf.dao.entity.ModelUserRole;
import com.mmf.dao.repository.UserRoleRepository;
import com.mmf.service.interfaces.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    private final UserRoleRepository userRoleRepository;

    @Autowired
    public UserRoleServiceImpl(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }


    @Override
    public Optional<ModelUserRole> getUseRoleById(int userRoleId) {
        return userRoleRepository.findById(userRoleId);
    }

    @Override
    public List<ModelUserRole> getAll() {
        return userRoleRepository.findAll();
    }
}
