package com.task;

public class User
{
@Override
public String toString() {
return "User [name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
}
public User(String name, String designation, int salary) {
super();
this.name = name;
this.designation = designation;
this.salary = salary;
}
User()
{

}
private String name ;
private String designation ;
private int salary ;

}
