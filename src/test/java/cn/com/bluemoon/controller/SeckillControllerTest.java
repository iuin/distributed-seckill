package cn.com.bluemoon.controller;

import cn.com.bluemoon.redis.repository.RedisRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

/**
 * @Description TODO
 * @Date 11/27/2019 16:21
 * @Created by zhangf30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SeckillControllerTest {

    @Autowired
    private RedisRepository redisRepository;

    @Test
    public void setStockNum() {

    }

    @Test
    public void getStockNum() {
    }

    @Test
    public void goSeckill() {
    }

    @Test
    public void goSeckillByQueue() {
    }

    @Test
    public void seckillPolling() {
    }

    @Test
    public void seckillPollingQueue() {
    }
}
