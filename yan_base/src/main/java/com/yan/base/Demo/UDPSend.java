package com.yan.base.Demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


/**
 * @author FG
 * @version 1.0
 * @date 2019/8/21 21:58
 * @description
 */
public class UDPSend {
    public static void main(String[] args)throws Exception{
        //准备发送的数据
        byte[] message="来了老弟".getBytes();
        //创建数据包对象
        DatagramPacket dp= new DatagramPacket(message,message.length, InetAddress.getLocalHost(),6666);
        DatagramSocket ds= new DatagramSocket();
        ds.send(dp);
        ds.close();
    }
}
