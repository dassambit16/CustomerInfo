package com.assignment.PP_fs11.Service;

import com.assignment.PP_fs11.Model.UserInfo;
import com.assignment.PP_fs11.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public String addUserInfo(UserInfo userInfo) {
        userRepo.save(userInfo);
        return "user added";
    }

    public String updateUserInfo(Long userId, UserInfo userInfo) {
        Optional<UserInfo> existingId = userRepo.findById(userInfo.getCustomerId());
        if(existingId.equals(userId)) {
            userRepo.save(userInfo);
            return "user updated";
        }
        return "user doesn't exist";
    }

    public Page<UserInfo> getUserInfo(int pageNumber, int pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
        return userRepo.findAll(pageRequest);
    }

    public Optional<UserInfo> getUserInfoById(Long id) {
        return userRepo.findById(id);
    }

    public String deleteUser(Long id) {
        UserInfo userInfo = userRepo.findUserById(id);
        if(userInfo != null) {
            userRepo.deleteById(id);
            return "user deleted";
        }
        return "user doesn't exist with id : " + id;
    }
}
