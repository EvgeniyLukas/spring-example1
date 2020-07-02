package org.itstep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        DeveloperRunnerImpl developer = context.getBean("developerRunnerImpl", DeveloperRunnerImpl.class);
        developer.runCode();
    }
}
