package com.mmf.service.impl;

import com.mmf.dao.entity.ModelUserRole;
import com.mmf.dao.entity.RoleMap;
import com.mmf.dao.entity.RoleMapPK;
import com.mmf.dao.repository.UserRepository;
import com.mmf.dao.entity.ModelUser;
import com.mmf.service.UserRoleService;
import com.mmf.service.UserService;
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

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserRoleService userRoleService) {
        this.userRepository = userRepository;
        this.userRoleService = userRoleService;
    }

    @Override
    public int save(ModelUser modelUser) {
        RoleMap roleMap = new RoleMap();
        Optional<ModelUserRole> modelUserRoleOptional = userRoleService.getUseRoleById(1);
        roleMap.setModelUserRole(modelUserRoleOptional.get());
        roleMap.setModelUser(modelUser);
        List<RoleMap> modelUserRoles = Stream.of(roleMap).collect(Collectors.toList());
        modelUser.setRoleMaps(modelUserRoles);
        return userRepository.save(modelUser).getUserId();
    }
}
