import java.util.HashSet;
import java.util.Set;
import java.util.*;


public class TestEmlpoyee {
    public static void main(String[] args) {
        Employee e1=new Employee(123, "Shekhar", "Shirdi");
        Employee e2=new Employee(43543, "Shekhar", "Shirdi");
        Employee e3=new Employee(123, "Sanket", "Pune");
        Employee e4=new Employee(234, "Sujit", "Rahuri");
        Set<Employee> set=new HashSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        for (Employee emp:set) {
            System.out.println(emp);
        }
    }
}
class Employee{
    private int id;
    private String name;
    private String address;
    public Employee(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name,address);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Employee other = (Employee) obj;
        return id == other.id && 
        Objects.equals(name, other.name) &&
        Objects.equals(address, other.address);
    }
    @Override
    public String toString(){
        return "Employee:-> id: "+id+"  name: "+name+"  address: "+address;
    }

}