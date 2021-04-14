package Lesson4;



public class Employee {

    private String fio;
    private String position;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee (String fio, String position, String phoneNumber, int salary, int age) {
        this.fio=fio;
        this.position=position;
        this.phoneNumber=phoneNumber;
        this.salary=salary;
        this.age=age;
    }

    public String getFio(){return  this.fio;}
    public  String getPosition(){return  this.position;}
    public String getPhoneNumber(){return  this.phoneNumber;}
    public int getSalary(){return  this.salary;}
    public void setSalary(int salary){this.salary=salary;}
    public int getAge(){return  this.age;}

}
