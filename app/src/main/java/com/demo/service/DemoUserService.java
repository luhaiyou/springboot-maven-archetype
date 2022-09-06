package com.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.entity.DemoUser;

public interface DemoUserService extends IService<DemoUser> {

    void saveUser(DemoUser user);
    void deleteUser(Long id);

}
