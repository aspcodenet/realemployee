package com.stefan.employee;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmployeeTests {
	@Test
	void calculateMonthlySalaryReturnsCorrectValue() {
		Integer hours = 20;
		Employee employee = new Employee();	
		employee.setHourlySalary(100);			
		employee.setName("Stefan Holmberg");
		employee.setPersonalNumber("19720803");

		assertThat(employee.calculateMonthlySalary(hours)).isEqualTo(20000);

	}
    
}
