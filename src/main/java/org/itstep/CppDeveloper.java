package org.itstep;

import org.springframework.stereotype.Component;

@Component
public class CppDeveloper implements Developer {
    @Override
    public String writeCode() {
        return "Cpp Code";
    }
}
