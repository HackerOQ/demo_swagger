package com.sunyard.demo_swagger.service.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @Company: sunyard
 * @Author: Ouqiang
 * @CreateTime: 2019/01/07 9:43
 * @Description: quartz
 */
public class QuartzService {
    public static void main(String[] args) {
        try {
            //创建执行计划
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            //定义一个Trigger,触发条件类
            Trigger trigger = TriggerBuilder.newTrigger().
                    withIdentity("trigger1", "group1") //定义name/group
                    .startNow()//一旦加入scheduler，立即生效
                    .withSchedule(SimpleScheduleBuilder.simpleSchedule() //使用SimpleTrigger
                            .withIntervalInSeconds(5) //每隔一秒执行一次
                            .repeatForever()) //一直执行，奔腾到老不停歇
                    .build();
                //定义一个JobDetail
            JobDetail job = JobBuilder.newJob(HelloQuartz.class) //定义Job类为HelloQuartz类，这是真正的执行逻辑所在
                    .withIdentity("job1", "group1") //定义name/group
                    .usingJobData("name", "quartz2") //定义属性
                    .usingJobData("name", "quartz1") //定义属性

                    .build();
            //加入调度
            scheduler.scheduleJob(job,trigger);
            //启动任务调度
            scheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
