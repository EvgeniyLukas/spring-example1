package org.itstep;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.*;

@Component
//@Scope("prototype")
public class JavaDeveloper implements Developer {

    @Value("Java")
    private String nameJava;

    @Value("20000")
    int javaSalary;

    List<CppDeveloper> projects = new ArrayList<>();
    Map<String, Integer> map = new HashMap<>();
    Set<Developer> developers = new HashSet<>();


    @PostConstruct
    void init(){
        System.out.println("Post construct");
    }

    @PreDestroy
    void destroy(){
        System.out.println("Pre destroy");
    }


    public void setDevelopers(Set<Developer> developers) {
        this.developers = developers;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

//    public List<String> getProjects() {
//        return projects;
//    }
//
//    public void setProjects(List<String> projects) {
//        this.projects = projects;
//    }


    public List<CppDeveloper> getProjects() {
        return projects;
    }

    public void setProjects(List<CppDeveloper> projects) {
        this.projects = projects;
    }

    public int getJavaSalary() {
        return javaSalary;
    }

    public void setJavaSalary(int javaSalary) {
        this.javaSalary = javaSalary;
    }

    public void setNameJava(String nameJava) {
        this.nameJava = nameJava;
    }

    public String getNameJava() {
        return nameJava;
    }

    @Override
    public String writeCode() {
        return "Java Code";
    }
}
