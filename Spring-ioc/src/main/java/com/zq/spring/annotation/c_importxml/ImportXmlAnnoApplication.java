package com.zq.spring.annotation.c_importxml;

import com.zq.spring.annotation.c_importxml.config.ImportXmlAnnotationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.Stream;

public class ImportXmlAnnoApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("annotation/import-anno.xml");
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println("----------------------");

        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(ImportXmlAnnotationConfiguration.class);
        Stream.of(ctx2.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
//注解驱动的 IOC 容器与 xml 驱动的 IOC 容器有什么不同？