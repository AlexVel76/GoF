package com.gof.structural.flyweight;

import java.util.Objects;

public class MyObject {
    private String name;
    private String someField1 = "blabla1";
    private String someField2= "blabla2";
    private String someField3= "blabla3";
    private String someField4= "blabla4";

    public MyObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSomeField1() {
        return someField1;
    }

    public void setSomeField1(String someField1) {
        this.someField1 = someField1;
    }

    public String getSomeField2() {
        return someField2;
    }

    public void setSomeField2(String someField2) {
        this.someField2 = someField2;
    }

    public String getSomeField3() {
        return someField3;
    }

    public void setSomeField3(String someField3) {
        this.someField3 = someField3;
    }

    public String getSomeField4() {
        return someField4;
    }

    public void setSomeField4(String someField4) {
        this.someField4 = someField4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MyObject myObject = (MyObject) o;
        return Objects.equals(name, myObject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
