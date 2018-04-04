package com.shawearn.dubbo.provider.impl;

import com.shawearn.dubbo.remote.TestService;

/**
 * Created by Shawearn on 2017/2/14.
 */
public class TestServiceImpl implements TestService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
