package io.github.frapples.augustrpc.simple.service;

import io.github.frapples.augustrpc.context.annotation.AugustRpcProvider;

/**
 * @author Frapples <isfrapples@outlook.com>
 * @date 2018/7/25
 */
@AugustRpcProvider
public class SimpleServiceImpl implements SimpleService {

    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
