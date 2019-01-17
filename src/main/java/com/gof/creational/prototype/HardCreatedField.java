package com.gof.creational.prototype;

public class HardCreatedField implements Cloneable {
    private String manyFieldsHere;

    private String uniqueField;

    public HardCreatedField(String manyFieldsHere, String uniqueField) {
        this.manyFieldsHere = manyFieldsHere;
        this.uniqueField = uniqueField;
    }

    public String getUniqueField() {
        return uniqueField;
    }

    public void setUniqueField(String uniqueField) {
        this.uniqueField = uniqueField;
    }

    public String getManyFieldsHere() {
        return manyFieldsHere;
    }

    public void setManyFieldsHere(String manyFieldsHere) {
        this.manyFieldsHere = manyFieldsHere;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
