package com.task;

import java.util.Iterator;

public class DisplayUser {

public static void displayUser()
{
System.out.println("user data");
Iterator i = CreateUser.li.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
}
}

