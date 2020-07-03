package org.itstep;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DeveloperRunnerImpl implements DeveloperRunner {


    private Developer developer;

//    CppDeveloper cpp;
//    JavaDeveloper java;

    @Autowired
    public DeveloperRunnerImpl(@Qualifier("cppDeveloper") Developer developer,
                               @Qualifier("javaDeveloper") Developer developer1) {
        this.developer = developer1;
    }




    @Override
    public void runCode() {
        System.out.println(developer.writeCode());

    }
}
