package org.aadi;

import org.aadi.config.AppJavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.namespace.QName;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppJavaConfig.class);
        Desktop dt = context.getBean( Desktop.class);
        dt.compile();

        //By default scope is singleton means object will be created only once.
        //In the Singleton scope, only one instance of the bean is created, even
        //if there are multiple references to it.

        //So when we want a  new instance of the bean is created every time
        // it is requested then we have to use prototype scope
        //In the Prototype scope, a new object is created each time when we call
        //the getBean() method.
        //Each reference will point to a distinct instance of the bean.
        Desktop dt1 = context.getBean( Desktop.class);
        dt.compile();








//    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj1 = (Alien) context.getBean("alien1");
//
//        System.out.println(obj1.getAge());
//        obj1.code();
    }
}
