package com.jar.jvm.jhsdb;

/**
 * @author : dev
 * @version :
 * @Date :  1/19/21 4:23 PM
 * @Desc :
 */
public class Teacher {
    String name;
    String sexType;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexType() {
        return sexType;
    }

    public void setSexType(String sexType) {
        this.sexType = sexType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", sexType='" + sexType + '\'' +
                ", age=" + age +
                '}';
    }
}
