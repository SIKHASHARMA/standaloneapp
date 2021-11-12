package com.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateUser
{
static List li = new ArrayList();
static String name;
static String designation;
static int aSal [] = {20000,30000,15000};
static int salary ;
static Scanner sc = new Scanner(System.in);
public static void createUser()
{
User user;
int c = 0;
while(c == 0)
{
	int a=0;
	do {
System.out.println("Enter name -:");
name = sc.nextLine();
String[] s=name.split(" ");
String regex="^[a-zA-Z\\s]+$";
Pattern p=Pattern.compile(regex);

Matcher m =p.matcher(name);
if(m.matches())
{
	//System.out.println("true");
	a++;
}
else
{
	System.out.println("Invalid Name ");
}
if(s.length>3) {
	System.out.println("enter less than 3 words");
	a=0;
}
}while(a==0);
System.out.println("Enter designation 1)programmer 2)manager 3)tester");
String ds = sc.nextLine().replaceAll(" ", "");
if(ds.equalsIgnoreCase("Programmer"))
{
salary = aSal[0];
designation = "programmer";
System.out.println("enter y or n");
String val = sc.nextLine();
if(val.equals("n"))
{
c++;
}
else if(val.equals("y"))
{
c=0;
}
else
{
System.out.println("enter within y/n");
c=0;
}


}
else if(ds.equalsIgnoreCase("Manager"))
{
salary = aSal[1];
designation = "manager";
System.out.println("enter y or n");
String val = sc.nextLine();
if(val.equals("n"))
{
c++;
}
else if(val.equals("y"))
{
c=0;
}
else
{
System.out.println("enter within y/n");
c=0;
}
}
else if(ds.equalsIgnoreCase("tester"))
{
salary = aSal[2];
designation = "tester";
System.out.println("enter y or n");
String val = sc.nextLine();
if(val.equals("n"))
{
c++;
}
else if(val.equals("y"))
{
c=0;
}
else
{
System.out.println("Enter Within y/n");
c=0;
}
}
else
{
System.out.println("Enter Proper Designation Choice");
}
}
li.add(new User(name,designation,salary));
}
}