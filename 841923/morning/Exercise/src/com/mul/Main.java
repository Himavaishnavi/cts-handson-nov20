package com.mul;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

int choice;
while(true) {
System.out.println("1. Add");
System.out.println("2: Display Id");
System.out.println("3: Display All");
System.out.println("4: Sort by id");
System.out.println("5: Sort by dob");
System.out.println("6: Sort by salary:");
System.out.println("7: Sort by name ");
System.out.println("8: Exit");
System.out.println("please choose option");
choice =sc.nextInt();

System.out.println(choice);

if(choice==1) {
                  addEmployee();
}
if(choice==2) {
                    findbyid();
}

  if(choice==3) {
                  displayall();
  }
  if(choice==4) {
     sortbyid();
  }
  if(choice==5) {
                        sortbydob();
  }
  if(choice==6) {
               sortbysalary();
  }
  if(choice==7) {
                sortbyname();
  }
  if(choice==8) {
  break;
  }
}
     
}
static ArrayList<emp> list = new ArrayList<emp> ();
     
//AddEMployee method Implementation
private static void addEmployee() {


 Scanner sc=new Scanner(System.in);
 int id;
String name;
String dob;
long salary;
String status = null;

System.out.println("Enter Employee id:");
   id = sc.nextInt();
System.out.println("enter employee name:");
name=sc.next();
System.out.println("enter employee dob");
dob=sc.next();
     System.out.println("enter employee salary");
     salary=sc.nextLong();      
 
     emp c = new emp ();


     c.setId(id);;
     c.setName(name);
     c.setDob(dob);
     c.setSalary(salary);
     list.add(c);
        System.out.println("added the values");
        status=sc.next();
        while(status=="n") {
        addEmployee();
        }
        }
 
private static void displayall() {
emp c = new emp ();
for(emp d:list) {
  System.out.println(d);
 }
}
private static void findbyid() {
	emp c = new emp ();
Scanner sc=new Scanner(System.in);
System.out.println("enter the id");
int fid=sc.nextInt();
for(emp d:list) {
if(d.getId()==fid )
  System.out.println(d);
}}

private static void sortbyid() {
	Collections.sort(list,new Comparator<emp>(){
	public int compare(emp e1,emp e2) {
	return e1.getId()- e2.getId();
	}
	});
	list.forEach(e -> System.out.println(e));
	}

private static void sortbysalary() {
Collections.sort(list,(e1,e2) -> Long.compare(e1.getSalary(), e2.getSalary()));
list.forEach(e -> System.out.println(e));

}

private static void sortbyname() {
  Collections.sort(list,(e1,e2) -> e1.getName().compareTo(e2.getName()));
list.forEach(e -> System.out.println(e));

}

private static void sortbydob() {
Collections.sort(list,(e1,e2) -> e1.getDob().compareTo(e2.getDob()));
list.forEach(e -> System.out.println(e));

}


}


