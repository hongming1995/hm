package com.example.demo;

import com.example.redis.JedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;

/**
 * @Author: hongming
 * @Date: 2021/10/31/17:47
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class JedisTest {

    @Test
    public void singleJedis() {
        // String 类型
        Jedis jedis = JedisUtil.singleJedis();
        jedis.set("name", "hm");
        jedis.set("age", "25");
        System.out.println(jedis.get("name"));

        // map类型

    }
}
