package com.mmf.dao.repository;

import com.mmf.dao.entity.RoleMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapRepository extends JpaRepository<RoleMap, Integer> {
}
