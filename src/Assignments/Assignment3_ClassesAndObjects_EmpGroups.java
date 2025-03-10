package assignments;

public class Assignment3_ClassesAndObjects_EmpGroups {

    public static void main(String[] args) {
        // Create an instance of the Employees class
        Employees details = new Employees();
        
        // Arrays to store employee names and IDs
        String[] EmpNames = {details.Emp1name, details.Emp2name, details.Emp3name};
        int[] EmpIds = {details.Emp1id, details.Emp2id, details.Emp3id};
        
        // Print each employee's name along with their corresponding ID
        System.out.println("Employee Name: " + EmpNames[0] + ", Employee ID: " + EmpIds[0]);
        System.out.println("Employee Name: " + EmpNames[1] + ", Employee ID: " + EmpIds[1]);
        System.out.println("Employee Name: " + EmpNames[2] + ", Employee ID: " + EmpIds[2]);
    }
}