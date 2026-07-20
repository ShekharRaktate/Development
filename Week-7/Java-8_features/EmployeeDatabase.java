import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase {
    public static List<Employee>getEmployees(){
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(101,"Shekhar Rakatate",20,"Male",2026,370000,"Software Devlopment"));
        employees.add(new Employee(102,"Raj Kolhe",30,"Male",2020,37000,"Software Testing"));
        employees.add(new Employee(103,"Sanket KumKar",20,"Male",2021,23454,"Software Analysis"));
        employees.add(new Employee(104,"Sujit Bankar",20,"Male",2023,23456,"DevOps"));
        employees.add(new Employee(105,"Kailas Dokhe",20,"Male",2016,76533,"Data Scince"));
        employees.add(new Employee(106,"Ram Jadhav",20,"Male",2005,32483,"Software Devlopment intern"));
        employees.add(new Employee(107,"Sita Sham",20,"female",2027,98654,"Intern"));
        employees.add(new Employee(108,"Sai Jadhav",20,"Male",203,5860,"HR"));
        employees.add(new Employee(109,"Sakshi Bhangude",20,"female",2011,7000,"Intern"));
        employees.add(new Employee(110,"Mona Patil",20,"female",2014,30000,"Designer"));
        employees.add(new Employee(111,"Radha Patil",20,"female",2018,70000,""));
        employees.add(new Employee(112,"Yash Rakatate",20,"Male",2007,70000,""));
        employees.add(new Employee(113,"Mansi Mumbaikar",20,"female",2025,60432,"Software Devlopment"));
        employees.add(new Employee(114,"Rakesh Anupam",20,"Male",2026,10000,"Software Devlopment"));
        return employees;
    }
}
