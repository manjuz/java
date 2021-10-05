import java.util.*;
class Employee
{
int empid;
String department;
String name;
Employee(int id, String dept, String ename)
{
  empid = id;
  department = dept;
  name = ename;
}

void display()
{
System.out.println("Employee ID: "+ empid);
System.out.println("Department: "+ department);
System.out.println("Name: "+ name);
}
}

class Arrayofobjects
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
Employee emp[] = new Employee[10];
for(int i=0;i<3;i++)
{
      System.out.println("Enter Employee name: ");
      String name = sc.nextLine();
      System.out.println("Enter Employee Department: ");
      String deptname = sc.nextLine();
      System.out.println("Enter Employee ID: ");
      int empid = sc.nextInt();
      sc.nextLine();
      emp[i] = new Employee(empid,deptname,name);
     
}

for(int i=0;i<3;i++)
{
   emp[i].display();
}
}
}
