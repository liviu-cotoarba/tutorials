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

See `PersonBuilderTest` for testing purposes.
