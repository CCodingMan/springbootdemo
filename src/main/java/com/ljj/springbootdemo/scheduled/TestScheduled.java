package com.ljj.springbootdemo.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: ljj
 * @Date: 2019/5/3 10:21
 * @Description: 定时任务处理类
 */
//@Component
public class TestScheduled {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //fixedDelay：上一个任务执行完成后,延迟5s再执行下一个任务
    //@Scheduled(fixedDelay = 5000)
    public void testFixedDelay(){
        System.out.println("fixedDelay-当前时间：" + simpleDateFormat.format(new Date()));
    }

    //fixedRate：上一个任务执行超过5秒，则下一个任务紧接着执行，若上一个任务执行小于5秒，则等时间到5秒后再执行下一任务
    //@Scheduled(fixedRate = 5000)
    public void testFixedRate(){
        System.out.println("fixedRate-当前时间：" + simpleDateFormat.format(new Date()));
    }

    //cron：以5秒为一个周期，一个周期查看一次是否执行完方法，发现方法执行完了，则执行下一个任务，若未执行完，则等下一周期再次查看
    //@Scheduled(cron = "0/5 * * * * ?")
    public void testCron(){
        System.out.println("cron-当前时间：" + simpleDateFormat.format(new Date()));
    }

}
