package org.itstep;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DeveloperRunnerImpl implements DeveloperRunner {


    private final Developer developer;


    @Autowired
    public DeveloperRunnerImpl(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void runCode() {
        System.out.println(developer.writeCode());
    }
}
