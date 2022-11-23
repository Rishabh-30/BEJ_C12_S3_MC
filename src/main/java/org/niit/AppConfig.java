package org.niit;

import org.springframework.context.annotation.Bean;

public class AppConfig {


    @Bean("E1")
    public Employee getemployee(){
        Employee employee = new Employee(getDepartmentDetails());
        employee.setEmpId(101);
        employee.setEmpName("Deepak");
        employee.setSalary(50000.50);
        return employee;
    }

    @Bean
    public Department getDepartmentDetails(){
        return new Department(1,"Investigation");
    }
}
