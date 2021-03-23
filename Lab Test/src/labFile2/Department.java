package labFile2;

public class Department {
    private int department_id;
    private String name;

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department(int department_id, String name) {
        this.department_id = department_id;
        this.name = name;
    }

    public void depshow(){
        System.out.println("Department info : ");
        System.out.println(getName() +" " +  getDepartment_id());
    }
}
