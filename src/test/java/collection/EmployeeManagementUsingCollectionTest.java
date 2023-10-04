package collection;

import employee.management.collection.Employee;
import employee.management.collection.EmployeeManagementUsingCollection;
import org.junit.Test;


public class EmployeeManagementUsingCollectionTest {

    Employee employee = new Employee(1, "TestUser", 5000);

    @Test
    void validateByInsertingEmployee(){
        EmployeeManagementUsingCollection emc = new EmployeeManagementUsingCollection();
        emc.employeeMangement();
    }
}
