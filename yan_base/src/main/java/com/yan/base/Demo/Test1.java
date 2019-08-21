package com.yan.base.Demo;

import java.net.InetAddress;

/**
 * @author FG
 * @version 1.0
 * @date 2019/8/21 21:14
 * @description
 */
public class Test1 {
    public static void main(String[] args) throws Exception{
        InetAddress host = InetAddress.getLocalHost();
        System.out.println(host);
        InetAddress host2 = InetAddress.getByName("baidu.com");
        System.out.println(host2);
    }
}
