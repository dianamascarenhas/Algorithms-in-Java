/*Program to create Arrays of Objects(Student class), and pass values to it*/

package arrays;

class Student
{
int roll_no;
String name;
int age;
Student(int r, String n, int a)
{
	this.roll_no=r;
	this.name=n; 
	this.age=a;
}
}
public class arrayOfObject 
{
public static void main(String args[])
{
Student s[] = new Student[5];
s[0] = new Student(1,"Rose",19);
s[1] = new Student(2,"Jack",20);
s[2] = new Student(3,"Pink",13);
s[3] = new Student(4,"Camilla",18);
s[4] = new Student(5,"Perk",23);

System.out.println("Printing the Values");
for(int i=0;i<s.length;i++)
{
System.out.println("Roll No:"+s[i].roll_no +" "+ "Name:" +s[i].name +" "+ "is:" +s[i].age +" years old");	
}
}
}

/*
Output:
Printing the Values
Roll No:1 Name:Rose is:19 years old
Roll No:2 Name:Jack is:20 years old
Roll No:3 Name:Pink is:13 years old
Roll No:4 Name:Camilla is:18 years old
Roll No:5 Name:Perk is:23 years old
*/
