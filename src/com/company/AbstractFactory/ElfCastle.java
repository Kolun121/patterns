package com.company.AbstractFactory;

public class ElfCastle implements Castle {
    static final String description = "Замок эльфов";
    @Override
    public String getDescription() {
        return description;
    }
}
