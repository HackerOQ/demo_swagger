package com.sunyard.demo_swagger.service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Company: sunyard
 * @Author: Ouqiang
 * @CreateTime: 2018/12/31 21:50
 * @Description: 多线程测试
 */
public class MyThread implements Runnable  {
    @Override
    public void run() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd-HH:mm:ss");
        String format = simpleDateFormat.format(new Date());
        System.out.println("mythread运行时间:【"+format+"】");
    }
}
