package org.aadi;

import org.aadi.config.AppJavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppJavaConfig.class);
        Desktop dt = context.getBean(Desktop.class);
        dt.compile();







//    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj1 = (Alien) context.getBean("alien1");
//
//        System.out.println(obj1.getAge());
//        obj1.code();
    }
}
