package Oops;
class Student{
    // data security --- private
    private int rollNo;
    private String name;
    private String address;
    // setter method --> sets all data to object created at main
    // returntype should be void bcoz setting data does not return anything
    //make it public so it can be accessed through main
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    // getter methods --> used to get the variables
    // returns the reqired property
    // public to get access in main
    public int getRollNo(){
        return rollNo;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
}
public class Setter_Getter_method {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNo(01);
        s1.setAddress("dip ka dill");
        s1.setName("bubu");
        System.out.println(" roll no = "+ s1.getRollNo());
        System.out.println(" name = "+ s1.getName());
        System.out.println("address = "+ s1.getAddress());
    }
}
