package Lesson4;

public class Ex4 {
    public static void main(String[] args) {
        Employee empl1=new Employee("Иванов Иван Иванович", "экономист", "+7(918)88888888", 75000, 45);
//        System.out.println(empl1.getFio());
//        System.out.println(empl1.getPosition());
        Employee[] employees= new Employee[5];
        employees[0]=new Employee("Иванов Иван Иванович", "экономист", "+7(918)88888888", 75000, 45);
        employees[1]=new Employee("Сидоров Иван Иванович", "дворник", "+7(918)88888881", 5000, 65);
        employees[2]=new Employee("Петров Иван Иванович", "директор", "+7(918)88888880", 175000, 51);
        employees[3]=new Employee("Сорокин Иван Иванович", "менеджер", "+7(918)88888887", 25000, 25);
        employees[4]=new Employee("Китов Иван Иванович", "бухгалтер", "+7(918)88888883", 34000, 34);

        for (int i=0;i<employees.length-1;i++){
            if (employees[i].getAge()>40){
                System.out.println(employees[i].getFio());
            }
        }
    recalculateSalary(employees);
    }
public static void recalculateSalary( Employee[] employees){
    for (int i=0;i<employees.length-1;i++){
        if (employees[i].getAge()>35){
            employees[i].setSalary(employees[i].getSalary()+10000);
            System.out.println(employees[i].getFio()+" "+employees[i].getSalary());
        }
    }
}
}
