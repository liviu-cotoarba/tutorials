package com.cotoarba.tutorials.builder;

import java.util.function.Consumer;

/**
 * Builder for {@link Person} class
 */
public class PersonBuilder {

	private Person person = new Person();

	private PersonBuilder() {
	}

	public static PersonBuilder aPerson() {
		return new PersonBuilder();
	}

	public PersonBuilder with(Consumer<Person> function) {
		function.accept(person);
		return this;
	}

	public Person build() {
		return person;
	}
}
