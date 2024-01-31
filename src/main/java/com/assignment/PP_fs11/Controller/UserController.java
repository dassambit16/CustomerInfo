package com.assignment.PP_fs11.Controller;

import com.assignment.PP_fs11.Model.UserInfo;
import com.assignment.PP_fs11.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/user")
    public String addUserInfo(@RequestBody UserInfo userInfo) {
        return userService.addUserInfo(userInfo);
    }

    @PostMapping("/user/id")
    public String updateUserInfo(@RequestParam Long userId, @RequestBody UserInfo userInfo) {
        return userService.updateUserInfo(userId, userInfo);
    }

    @GetMapping("/users")
    public Page<UserInfo> getUserInfo() {
        int pageNumber = 0;
        int pageSize = 2;
        return userService.getUserInfo(pageNumber, pageSize);
    }

    @GetMapping("/user/id/{id}")
    public Optional<UserInfo> getUserInfoById(@PathVariable Long id) {
        return userService.getUserInfoById(id);
    }


    @DeleteMapping("user/id/{id}")
    public String deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }
}
