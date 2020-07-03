package org.itstep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//XML
        // ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

//        Developer developer = new JavaDeveloper();
//        Developer developer1 = new CppDeveloper();
        //DeveloperRunner developerRunner = new DeveloperRunnerImpl(developer1);
        //developerRunner.runCode();
//        DeveloperRunner java = context.getBean("developer", DeveloperRunner.class);
//        java.runCode();
//
//        JavaDeveloper java1 = context.getBean("java", JavaDeveloper.class);
//        JavaDeveloper java2 = context.getBean("java", JavaDeveloper.class);
//        java2.setNameJava("Petr");
//        java2.setJavaSalary(2000);
//
//
//        System.out.println(java1.getNameJava() + " " + java1.getJavaSalary());
//        System.out.println(java2.getNameJava() + " " + java2.getJavaSalary());
//        System.out.println(java2.projects);


        // ===============================================

//JAVA CONFIG
        //@Component
        //@Autowired
        //@Qualifier("javaDeveloper")
        //@ComponentScan("org.itstep")

        //@Configuration
        //@Bean

        //@Scope("prototype")
        //@Value

        //@PostConstruct
        //@PreDestroy

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        DeveloperRunner developer = context.getBean("developerRunnerImpl", DeveloperRunner.class);
        developer.runCode();

    }
}
