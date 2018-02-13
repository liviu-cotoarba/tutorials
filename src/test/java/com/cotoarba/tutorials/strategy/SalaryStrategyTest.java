package com.cotoarba.tutorials.strategy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Tests for {@link SalaryStrategy}
 */
@RunWith(MockitoJUnitRunner.class)
public class SalaryStrategyTest {

	private final Employee employee = new Employee("Liviu Cotoarba", 100d);

	@Test
	public void increaseSalary() {
		//Given
		final SalaryStrategy doubleSalaryStrategy = e -> e.setSalary(2 * e.getSalary());

		//When
		doubleSalaryStrategy.increaseSalary(employee);

		//Then
		assertThat(employee.getSalary()).isEqualTo(200d);
	}
}