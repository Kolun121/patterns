package com.company.AbstractFactory;

public class OrcKing implements King{
    static final String description = "Король орков";
    @Override
    public String getDescription() {
        return description;
    }
}
