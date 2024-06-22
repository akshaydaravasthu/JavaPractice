package temp;

import temp.customException.EmployeeNotFoundException;

public class EmployeService {

    public Employee getEmployee() throws EmployeeNotFoundException {
        Employee emp = null;
        //emp  = new Employee("Sushanth",2, 58222);
        if(emp == null){
            EmployeeNotFoundException employeeNotFound = new EmployeeNotFoundException("Employee not found");
            throw employeeNotFound;
        }
        return emp;
    }

}
