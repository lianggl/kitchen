package com.kitchen.cook.service.impl;

import com.kitchen.cook.service.IUserService;
import com.kitchen.persist.mapper.KtRegionMapper;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Inject
    private KtRegionMapper regionMapper;

    @Override
    public String getMessage() {
        int count = regionMapper.countByExample(null);
        System.out.println("总数：" + count);
        return "JSF 2 + Spring Integration";
    }
}
