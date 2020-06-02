package com.stu.nio.stuNio;

import org.junit.Test;

import java.nio.ByteBuffer;

public class nioTest {

    @Test
    public void test(){
        //1、分配一个指定大小的缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        System.out.println("------------------all");
        System.out.println(byteBuffer.position());
        System.out.println(byteBuffer.limit());
        System.out.println(byteBuffer.capacity());

        //2、利用put（）存入数据到缓冲区中

    }
}
