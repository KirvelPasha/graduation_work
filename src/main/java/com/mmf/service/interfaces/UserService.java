package com.mmf.service.interfaces;

import com.mmf.dao.entity.ModelUser;

import java.util.List;

public interface UserService {
    int save(ModelUser modelUser);

    List<ModelUser> getAll();
}
