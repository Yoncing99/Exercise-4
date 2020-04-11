import java.util.Scanner;
class TestStaff {
	static Scanner console = new Scanner(System.in);	
    public static void main(String arg[]){
        String name,staffID;
        int workingDay;

        System.out.print("Name        : ");
        name = console.nextLine();
        System.out.print("Staff ID    : ");
        staffID = console.nextLine();
        System.out.print("Working Day : ");
        workingDay = console.nextInt();

        Staff d = new Staff();
        d.setStaffInfo(name,staffID,workingDay);
        d.calculateSalary();
        System.out.println("\n        Staff Info    ");
        System.out.printf("\nStaff Name   : %s%n", d.getName());
        System.out.printf("Staff ID     : %s%n" , d.getStaffID());
        System.out.printf("Staff Salary : RM %.2f",d.getSalary());
    }
}

    class Staff {

        private String name, staffID;
        private double salary;
        private int workingDay;
        public void setStaffInfo(String nm, String id, int wDay){
            name=nm;
            staffID=id;
            workingDay=wDay;
        }
        public void calculateSalary(){
            salary = workingDay * 35.0;
        }
        public double getSalary(){
            return salary;
        }
        public String getName(){
            return name;
        }
        public String getStaffID(){
            return staffID;
        }

    } 
