package com.company.AbstractFactory;

public class OrcCastle implements Castle{
    static final String description = "Замок орков";
    @Override
    public String getDescription() {
        return description;
    }
}
