package itheima.test;



/**
 * @author GenshenWang.nomico
 * @date 2018/3/5.
 */
public class Employee {
    private Integer empId;
    private String empName;
    private String empEmail;
    private String gender;
    private Integer departmentId;



    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }






    public Employee() {
    }
    public Employee(Integer empId, String empName, String empEmail, String gender, Integer departmentId) {
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.gender = gender;
        this.departmentId = departmentId;
    }

//    public Department getDepartment() {
//        return department;
//    }

//    public void setDepartment(Department department) {
//        this.department = department;
//    }
}
