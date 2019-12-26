package com.company.AbstractFactory;

public class ElfKing implements King{
    static final String description = "Король эльфов";
    @Override
    public String getDescription() {
        return description;
    }
}
