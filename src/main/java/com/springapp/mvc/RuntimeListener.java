package com.springapp.mvc;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.concurrent.TimeUnit;

/**
 * Created by dxkj on 2015/10/31.
 */
public class RuntimeListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent arg0) {
        System.out.println("contextInitialized");

        /*
         * 注册JVM钩子，在JVM关闭之前做一些收尾的工作，当然也能阻止TOMCAT的关闭；必须放在contextInitialized中注册。
         */

        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {

            public void run() {
                System.out.println("quit");
                int n = 0;
            }
        }));
    }

    public void contextDestroyed(ServletContextEvent arg0) {
        System.out.println("contextDestroyed ....");
    }

}
