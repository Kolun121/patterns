package com.company.AbstractFactory;

public class OrcCastleFactory implements CastleFactory {
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }
}
