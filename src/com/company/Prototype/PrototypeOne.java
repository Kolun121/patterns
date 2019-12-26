package com.company.Prototype;

public class PrototypeOne extends Prototype{
    public int intField;
    private String stringField;

    public PrototypeOne(){

    }

    public PrototypeOne(PrototypeOne target){
        super(target);
        if(target != null){
            this.intField = target.intField;
            this.stringField = target.getStringField();
        }
    }

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }

    public PrototypeOne clone(){
        return new PrototypeOne(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof PrototypeOne) || !super.equals(object2)) return false;
        PrototypeOne prototype2 = (PrototypeOne) object2;
        return (prototype2.intField == intField) && (prototype2.getStringField() == getStringField());
    }
}
