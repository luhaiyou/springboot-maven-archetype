package com.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.entity.DemoUser;
import com.demo.mapper.DemoUserMapper;
import com.demo.service.DemoUserService;
import org.springframework.stereotype.Service;

@Service
public class DemoUserServiceImpl extends ServiceImpl<DemoUserMapper, DemoUser> implements  DemoUserService {
    @Override
    public void saveUser(DemoUser user) {
        this.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        this.deleteUser(id);
    }
}
