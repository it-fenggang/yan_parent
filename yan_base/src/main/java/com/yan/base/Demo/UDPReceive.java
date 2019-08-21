package com.yan.base.Demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author FG
 * @version 1.0
 * @date 2019/8/21 22:04
 * @description
 */
public class UDPReceive {
    public static void main(String[] args)throws Exception {
        byte[] by=new byte[1024];
        //创建数据包对象
        DatagramPacket dp=new DatagramPacket(by,by.length);
        //接受数据包
        DatagramSocket ds=new DatagramSocket(6666);
        //调用方法接受数据
        ds.receive(dp);
        String msg=new String(by,0,dp.getLength());
        System.out.println("接收信息======"+msg);
        ds.close();


    }
}
