package com.mmf.service.impl;

import com.mmf.dao.entity.ModelUserRole;
import com.mmf.dao.entity.RoleMap;
import com.mmf.dao.entity.RoleMapPK;
import com.mmf.dao.repository.UserRepository;
import com.mmf.dao.entity.ModelUser;
import com.mmf.service.UserRoleService;
import com.mmf.service.UserService;
import com.mmf.service.dto.RoleMapDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserRoleService userRoleService;
    private final RoleMapServiceImpl roleMapService;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserRoleService userRoleService, RoleMapServiceImpl roleMapService) {
        this.userRepository = userRepository;
        this.userRoleService = userRoleService;
        this.roleMapService = roleMapService;
    }

    @Override
    public int save(ModelUser modelUser) {
        ModelUser newModelUser = userRepository.save(modelUser);
        RoleMapDto roleMapDto = new RoleMapDto(newModelUser.getUserId(), 1);
        roleMapService.save(roleMapDto);
        return newModelUser.getUserId();
    }
}
