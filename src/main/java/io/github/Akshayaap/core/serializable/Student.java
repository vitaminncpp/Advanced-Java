package io.github.Akshayaap.core.serializable;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID=1L;
    
    private String name;
    private int age;
    private String address;
    private transient int marks;

    public Student(String name, int age,String address ){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}
