package cn.lemonman.wechatgpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
public class WeChatGptApplication {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
       try {
           SpringApplication.run(WeChatGptApplication.class, args);
       }catch (Exception e) {
           countDownLatch.countDown();
       }
    }

}
