package com.example.redis;

import redis.clients.jedis.Jedis;

/**
 * @Author: hongming
 * @Date: 2021/10/31/17:37
 * @Description: 连接redis的工具类
 */
public class JedisUtil {

    private static final int port = 6379;
    private static final String ip = "192.168.31.234";

    /**
    * @Author: hm
    * @Param: port 端口, ip IP地址
    * @Date: 2021/10/31
    * @return:
    * @Description: 单个连接redis
    */
    public static Jedis singleJedis() {
        Jedis jedis = null;
        try {
            jedis = new Jedis(ip, port);
            //jedis.auth();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                try {
                    jedis.close();
                }catch (Exception e) {
                    e.printStackTrace();

                }
            }
        }
        return jedis;
    }

}
