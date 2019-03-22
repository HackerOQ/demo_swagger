package com.sunyard.demo_swagger.service.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @Company: sunyard
 * @Author: Ouqiang
 * @CreateTime: 2019/01/07 21:26
 * @Description:
 */
public class MyJob implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("【双十一紧急活动开始】");
    }
}
