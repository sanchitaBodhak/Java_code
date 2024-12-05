package Oops;
class person{ // baseclass or Super Class or ParentClass
    public int age;
    public String name;
    public String gender;
}
class Students extends person{ // derived class or child class
    // child class can acccess all properties from parent class
    public int marks;
    public String grade;
    Students(int age, String name, String gender, int marks, String grade){
    //constructor is a method which has same name as class
    // constructor should not contain returntype
        this.name = name;
        this.grade = grade;
        this.marks = marks;
        this.age = age;
        this.gender = gender;
    }
    public void display(){
        System.out.println("name of the student is... : "+name);
        System.out.println("age of the student is... : "+age);
        System.out.println("gender of the student is... : "+gender);
        System.out.println("marks of the student is... : "+marks);
        System.out.println("grade of the student is... : "+grade);
    }
}
public class Inheeritence {
    public static void main(String[] args) {
        Students s = new Students(21,"buppi","female",75,"L");
        s.display();
    }
}

