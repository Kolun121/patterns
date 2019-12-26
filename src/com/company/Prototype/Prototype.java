package com.company.Prototype;

import java.util.Objects;

public  class Prototype {
    public int rnd1;
    public int rnd2;

    public Prototype(){

    }

    public Prototype(Prototype target){
        if(target != null){
            this.rnd1 = target.rnd1;
            this.rnd2 = target.rnd2;
        }
    }

    public Prototype clone(){
        return new Prototype(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Prototype)) return false;
        Prototype prototype2 = (Prototype) object2;
        return prototype2.rnd1 == rnd1 && prototype2.rnd2 == rnd2;
    }
}
