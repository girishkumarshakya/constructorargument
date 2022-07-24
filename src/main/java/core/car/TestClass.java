package core.car;

import core.car.java.Arguments;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Arguments argumentsJava = context.getBean("argumentsJava",Arguments.class);
        core.car.kotlin.Arguments argumentsKotlin = context.getBean("argumentsKotlin", core.car.kotlin.Arguments.class);
        System.out.println("================================================");
        System.out.println(argumentsKotlin);
        System.out.println("================================================");
        System.out.println(argumentsJava);
        System.out.println("================================================");
        Arguments argumentsType = context.getBean("argumentsType",Arguments.class);
        System.out.println(argumentsType);
        System.out.println("================================================");
        System.out.println("================================================");
        Arguments argumentsIndex = context.getBean("argumentsIndex",Arguments.class);
        System.out.println(argumentsIndex);
        System.out.println("================================================");
    }
}
