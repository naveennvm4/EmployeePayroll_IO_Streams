import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollService {
    public enum IOService {CONSOLE_IO, FILE_IO, DB_IO, REST_IO}
    private ArrayList<EmployeePayrollData> empDetails;

    public EmployeePayrollService(){
        empDetails = new ArrayList<>();
    }

    private void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter id: ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Name: ");
        String name = consoleInputReader.next();
        System.out.println("Enter Salary: ");
        double salary = consoleInputReader.nextInt();
        empDetails.add(new EmployeePayrollData(id, name, salary));
    }

    private void writeEmployeePayrollData() {
        empDetails.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        Scanner sc = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(sc);
        employeePayrollService.writeEmployeePayrollData();
    }
}