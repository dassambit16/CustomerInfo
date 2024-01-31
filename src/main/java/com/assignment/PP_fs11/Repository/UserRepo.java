package com.assignment.PP_fs11.Repository;

import com.assignment.PP_fs11.Model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserInfo, Long> {
    UserInfo findUserById(Long id);
}
