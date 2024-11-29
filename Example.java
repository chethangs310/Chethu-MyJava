package Demo;

import TeSt.EmpData;

public class Example {

    public  int rollno;
    protected String dept;

    public static void main(String[] args) {
        Example exm =new Example();
        exm.dept= "NIC";
        exm.rollno= 123;
        System.out.println("name dept:: " +exm.dept);
        System.out.println("Roll number :::" + exm.rollno);

        EmpData empdata = new EmpData();
        empdata.setName("Hugar");
        System.out.println("name of ::" + empdata.getName());
    }

}
