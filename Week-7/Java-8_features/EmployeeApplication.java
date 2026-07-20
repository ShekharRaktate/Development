import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeApplication {
    public static void main(String[] args) {
        List<Employee> emp=EmployeeDatabase.getEmployees();
        // print all deparment 
        Map<String ,Long> countOnGender =emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(countOnGender);
        emp.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
        // 
        Map<String ,Double> avgOnGender=emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
        System.out.println(countOnGender);
        System.out.println(avgOnGender);
        emp.stream().map(Employee::getAge).distinct().forEach(System.out::println);
        Optional<Employee> highestPaidEmployee=emp.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        // System.out.println(highestPaidEmployee);
        Employee emps=highestPaidEmployee.get();
        System.out.println(emps);
// get the name  all of who jion after 2020.
        emp.stream().filter(e->e.getYearOfJioning()>2020).map(Employee::getName).forEach(System.out::println);
        // Get All Department 
        Map<String ,Long> countOnDepartment =emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(countOnDepartment);
        Set<java.util.Map.Entry<String,Long>> entrySet = countOnDepartment.entrySet();
        for(Entry<String,Long> em:entrySet){
            System.out.println(em.getKey()+" : "+em.getValue());
        }
        // What is the avg salary salry of each department
        Map<String ,Double> avgOnDepartment=emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        Set<Entry<String,Double>> entrySet1 =avgOnDepartment.entrySet();
        System.out.println("----------------");
        for(Entry<String,Double> em:entrySet1){
            System.out.println(em.getKey()+" : "+em.getValue());
        }
    }
}
