public class Employee {
    private int eid;
    private String name;
    private int age;
    private String gender;
    private int yearOfJioning;
    private double salary;
    private String department;
    public Employee(int eid, String name, int age, String gender, int yearOfJioning, double salary, String department) {
        this.eid = eid;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.yearOfJioning = yearOfJioning;
        this.salary = salary;
        this.department = department;
    }
    public int getEid() {
        return eid;
    }
    public void setEid(int eid) {
        this.eid = eid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getYearOfJioning() {
        return yearOfJioning;
    }
    public void setYearOfJioning(int yearOfJioning) {
        this.yearOfJioning = yearOfJioning;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    
    @Override
    public String toString() {
        return "Employee [eid=" + eid + ", name=" + name + ", age=" + age + ", yearOfJioning=" + yearOfJioning
                + ", salary=" + salary + "Department="+department+ "]";
    } 
    public Employee(){
        super();
    }
}
