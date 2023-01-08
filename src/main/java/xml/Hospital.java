package xml;

public class Hospital {
    private  Doctor doctor;
    private Department department;


    public Hospital(Doctor doctor, Department department) {
        this.doctor = doctor;
        this.department = department;
    }

    public void makeBill(){
        System.out.println("Hospital make bill");
    }

    public void hospitalInfo(){
        System.out.println("Hospital Info");
    }
    public void fetchDoctor(){
        this.doctor.checkPatient();
        this.doctor.giveMedicine();
    }
    public void fetchDeptInfo(){
        this.department.deptName();
        this.department.deptId();
    }



}
