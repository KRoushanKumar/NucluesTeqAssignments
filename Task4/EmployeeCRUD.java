import java.io.*;
import java.util.*;

import javax.lang.model.util.ElementScanner14;
import javax.swing.text.AbstractDocument.BranchElement;

class employee implements Serializable{
    private int empID;
    private String name;
    private int salary;
    public employee(int empID, String name, int salary) {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "[empID=" + empID + ", name=" + name + ", salary=" + salary + "]";
    }
    public int getEmpID() {
        return empID;
    }
    public void setEmpID(int empID) {
        this.empID = empID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
   

}

public class EmployeeCRUD
{
    public static void main(String[] args) throws Exception {

        int ch=0;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        ArrayList<employee> al= new ArrayList<employee>();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        boolean found=false;
        File f = new File("Employee.txt");
        if(!f.exists())
        {
            f.createNewFile();
        }
               

        do{
            found=false;
            System.out.println("1 .Insert Employee");
            System.out.println("2 .Display Employee");
            System.out.println("3 .Search");
            System.out.println("4 .Delete");
            System.out.println("5 .Modify");
            System.out.println("0 .Exit");
            ch =sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Employee ID: ");
                    int empID = sc.nextInt();
                
                    System.out.print("Employee Name: ");
                    String name = sc1.nextLine();

                    System.out.print("Employee Salary: ");
                    int salary = sc.nextInt();

                    al.add(new employee(empID, name, salary));
                    oos = new ObjectOutputStream(new FileOutputStream(f));
                    oos.writeObject(al);
                    oos.close();
                    break;
                case 2:
                    //System.out.println(al);
                    if(f.exists())
                    {
                        ois = new ObjectInputStream(new FileInputStream(f));
                        al = (ArrayList<employee>)ois.readObject();
                        ois.close();
                        ListIterator<employee> it = al.listIterator();
                        System.out.println("------------------------");
                        while(it.hasNext())
                        {
                                System.out.println(it.next());     
                        }
                        System.out.println("------------------------");


                    } 
                    else{
                        System.out.println("File does not exits :( ");
                    }
                    break;

                case 3:
                    //for search
                    if(f.exists())
                    {
                        ois = new ObjectInputStream(new FileInputStream(f));
                        al = (ArrayList<employee>)ois.readObject();
                        ois.close();
                        ListIterator<employee> it = al.listIterator();
                        System.out.print("Enter Employee Id : ");
                        empID = sc.nextInt();



                        System.out.println("------------------------");
                        while(it.hasNext())
                        {
                            employee e = (employee)it.next();
                            if(e.getEmpID() == empID){
                                System.out.println(e.toString());
                                found=true;
                            break;
                            }     
                        }
                        if(!found)
                        {
                            System.out.println("Record Not Found....!");
                        }
                        System.out.println("------------------------");


                    } 
                    else{
                        System.out.println("File does not exits :( ");
                    }

                break;

                case 4:
                    //Delete
                    
                    if(f.exists())
                    {
                        ois = new ObjectInputStream(new FileInputStream(f));
                        al = (ArrayList<employee>)ois.readObject();
                        ois.close();
                        ListIterator<employee> it = al.listIterator();
                        System.out.print("Enter Employee Id : ");
                        empID = sc.nextInt();
                        System.out.println("------------------------");
                        while(it.hasNext())
                        {
                            employee e = (employee)it.next();
                            if(e.getEmpID() == empID){
                                System.out.println(e.toString());
                                found=true;
                                it.remove();
                            break;
                            }     
                        }
                        System.out.println("------------------------");
                        if(found)
                        {
                            oos = new ObjectOutputStream(new FileOutputStream(f));
                            oos.writeObject(al);
                            oos.close();
                            System.out.println("Record deteted successfully...!");
                        }
                        else
                        {
                            System.out.println("Record Not Found...!");
                        }

                    } 
                    else{
                        System.out.println("File does not exits :( ");
                    }

                break;

                case 5:
                    //Modify Record;
                    if(f.exists())
                    {
                        ois = new ObjectInputStream(new FileInputStream(f));
                        al = (ArrayList<employee>)ois.readObject();
                        ois.close();
                        ListIterator<employee> it = al.listIterator();
                        System.out.print("Enter Employee Id : ");
                        empID = sc.nextInt();
                        System.out.println("------------------------");
                        while(it.hasNext())
                        {
                            employee e = (employee)it.next();
                            if(e.getEmpID() == empID){
                                System.out.println(e.toString());
                                found=true;
                                System.out.println("1. Modify Name");
                                System.out.println("2. Modify Salary");
                                System.out.println("0. Exit");
                                int m=sc.nextInt();

                                if(m==1)
                                {
                                    System.out.print("Enter Name :");
                                    name = sc1.nextLine();
                                    e.setName(name);
                                    it.set(e);
                                }
                                else if(m==2)
                                {
                                    System.out.print("Enter Salary :");
                                    salary = sc.nextInt();
                                    e.setSalary(salary);
                                    it.set(e);
                                }
                                else 
                                    break;
                                
                            }     
                        }
                        System.out.println("------------------------");
                        if(found)
                        {
                            oos = new ObjectOutputStream(new FileOutputStream(f));
                            oos.writeObject(al);
                            oos.close();
                            System.out.println("Record Modify successfully...!");
                        }
                        else
                        {
                            System.out.println("Record Not Found...!");
                        }

                    } 
                    else{
                        System.out.println("File does not exits :( ");
                    }
                    break;
                
                default:
                    break;
            }

        }while(ch!=0);
        

        sc.close();
        sc1.close();
    }
}