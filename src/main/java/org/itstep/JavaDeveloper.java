package org.itstep;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class JavaDeveloper implements Developer {
   String nameJava;
   int javaSalary;

   List<CppDeveloper> projects = new ArrayList<>();
   Map<String, Integer> map = new HashMap<>();
   Set<Developer>developers = new HashSet<>();


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
