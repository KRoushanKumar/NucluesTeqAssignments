import Student.Student;

public class StudentTest {
    public static void main(String[] args) {
       Student s1 = new Student(101, "Roushan", "MCA", 74, 85, 79);
       Student s2 = new Student(101, "Raju", "MCA", 84, 95, 99);
       Student s3 = new Student(101, "Raman", "MCA", 54, 85, 69);
       Student s4 = new Student(101, "Rohan", "MCA", 64, 85, 69);
       Student s5 = new Student(101, "Ramesh", "MCA", 44, 55, 59);
       System.out.println(s1.toString());
       System.out.println("Total "+s1.calculateTotal());
       System.out.println(s1.calculateGrade());
       System.out.println(s2.toString());
       System.out.println("Total "+s2.calculateTotal());
       System.out.println("Grade "+s2.calculateGrade());
       System.out.println(s3.toString());
       System.out.println("Total "+s3.calculateTotal());
       System.out.println("Grade "+s3.calculateGrade());
       System.out.println(s4.toString());
       System.out.println("Total "+s4.calculateTotal());
       System.out.println("Grade "+s4.calculateGrade());
       System.out.println(s5.toString());
       System.out.println("Total "+s5.calculateTotal());
       System.out.println("Grade "+s5.calculateGrade());
       
    }
}
