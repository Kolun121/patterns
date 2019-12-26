package com.company.AbstractFactory;

public class ElfCastleFactory implements CastleFactory {
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }
}
