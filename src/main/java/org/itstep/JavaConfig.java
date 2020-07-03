package org.itstep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.itstep")
public class JavaConfig {

//    @Bean
//    public Developer java(){
//       return new JavaDeveloper();
//    }
//
//    @Bean CppDeveloper cpp(){
//        return new CppDeveloper();
//    }
//
//    @Bean
//    public DeveloperRunner developer(CppDeveloper developer){
//        return new DeveloperRunnerImpl(developer);
//    }
}
