# Java Tutorials

This is a simple application that wants to illustrate several tips and best practices  that will help you write better code.


### 1. Builder pattern

`PersonBuilder` is a better builder that makes use of functional interfaces introduced in java 8.

Advantages on this implementation, over the classic one:
* No need to duplicate in builder all the fields from the model
* No need to duplicate setters from model class
* Changes in the model attributes will not affect the builder
* Less code

How to use:
```
final Person person = PersonBuilder.aPerson()
				.with(p -> {
					p.setFirstName(firstName);
					p.setLastName(lastName);
					p.setCity(city);
				})
				.build();
```

See `PersonBuilderTest` for using & testing purposes.

### 2. Strategy pattern
`SalaryStrategy` is a interface that better illustrates the strategy pattern using functional interfaces. The value added by this implementation is that you don't have to make any implementation classes (or anonymous inner classes) for each strategy defined, you just use lambda expressions to pass the actual behaviour.

How to use:
```
final Employee employee = new Employee("Liviu Cotoarba", 100d)
final SalaryStrategy doubleSalaryStrategy = e -> e.setSalary(2 * e.getSalary());

doubleSalaryStrategy.increaseSalary(employee);
```

See `SalaryStrategyTest` for using & testing purposes.