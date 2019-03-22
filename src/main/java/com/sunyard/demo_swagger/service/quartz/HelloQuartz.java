package com.sunyard.demo_swagger.service.quartz;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @Company: sunyard
 * @Author: Ouqiang
 * @CreateTime: 2019/01/07 9:58
 * @Description:
 */
public class HelloQuartz implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        //创建工作
        JobDetail jobDetail = context.getJobDetail();
        //获取工作名称
        String name = jobDetail.getJobDataMap().getString("name");
        //String job = jobDetail.getJobDataMap().getString("job1");
        if (name.equals("quartz1")){
        System.out.println("任务调度：发送的邮件：quartz1;内容---->今日整点抢购，不容错过！");
        }else {
            System.out.println("任务调度：发送的邮件：quartz2;内容---->今日整点抢购，不容错过！");

        }
    }
}
