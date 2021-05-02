package com.mmf.dao.repository;

import com.mmf.dao.entity.ModelUserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<ModelUserRole, Integer> {

}
