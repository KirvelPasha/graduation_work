package com.mmf.dao.repository;

import com.mmf.dao.entity.RoleMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface RoleMapRepository extends JpaRepository<RoleMap, Integer> {

    @Transactional
    @Modifying
    @Query("DELETE FROM RoleMap WHERE USER_ID = :modelUserId AND ROLE_ID = :modelUserRoleId")
    void delete(@Param("modelUserId") int modelUserId, @Param("modelUserRoleId") int modelUserRoleId);

}
