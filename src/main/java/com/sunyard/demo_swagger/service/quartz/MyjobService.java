package com.sunyard.demo_swagger.service.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.JobBuilder.newJob;

/**
 * @Company: sunyard
 * @Author: Ouqiang
 * @CreateTime: 2019/01/07 21:28
 * @Description:
 */
public class MyjobService {
    public static void main(String[] args) throws SchedulerException {
        //定义JobDetail
        JobDetail job = newJob().ofType(MyJob.class)
                .usingJobData("age","18")
                .withDescription("紧急活动")
                .withIdentity("job","quartz")
                .build();
        //定义trigger
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger","group")
                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                .repeatForever()
                .withIntervalInMilliseconds(10))
                .startNow()
                .build();
        //创建调度
        Scheduler defaultScheduler = StdSchedulerFactory.getDefaultScheduler();
        //加入job,trigger
        defaultScheduler.scheduleJob(job,trigger);
        //启动调度
        defaultScheduler.start();
    }
}
