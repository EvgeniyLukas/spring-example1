package org.itstep;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class JavaDeveloper implements Developer {
   String nameJava;
   int javaSalary;

   List<String> projects = new ArrayList<>();
   Map<String, Integer> map = new HashMap<>();

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
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
