package com.mmf.dao.repository;

import com.mmf.dao.entity.ModelUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<ModelUser, Integer> {
}
