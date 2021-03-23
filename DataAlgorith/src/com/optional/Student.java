package com.optional;

class Student
{
    int rollNo;
    String className;
    String name;

    public Student(int rollNo, String className, String name)
    {
        this.rollNo = rollNo;
        this.className = className;
        this.name = name;
    }
    public int getRollNo()
    {
        return rollNo;
    }
    public void setRollNo(int rollNo)
    {
        this.rollNo = rollNo;
    }
    public String getClassName()
    {
        return className;
    }
    public void setClassName(String className)
    {
        this.className = className;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}