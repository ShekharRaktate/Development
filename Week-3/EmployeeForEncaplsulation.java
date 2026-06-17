public class EmployeeForEncaplsulation {
    public static void main(String[] args) {
        Employee ob=new Employee();
        ob.setName("Shekhar");
        ob.setId(07);
        System.out.println(ob.getName());
        System.out.println(ob.getId());
    }
}
class Employee {
    private String name;
    private int id;
    public void setName(String name){
        this.name=name;
        
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName(){
        // this.name=name;
        return name;

    }
    public int getId(){
        // this.id=id;
        return id;
    }
}