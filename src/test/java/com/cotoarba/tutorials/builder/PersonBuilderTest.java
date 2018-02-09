package com.cotoarba.tutorials.builder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.function.Consumer;

import static com.cotoarba.tutorials.builder.PersonBuilder.aPerson;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link PersonBuilder}
 */
@RunWith(MockitoJUnitRunner.class)
public class PersonBuilderTest {

	@Test
	public void shouldBuildPerson() {
		//Given
		final String firstName = "Liviu";
		final String lastName = "Cotoarba";
		final String city = "Bucharest";

		//When
		final Person result = aPerson()
				.with(defaultInfo())
				.with(person -> {
					person.setFirstName(firstName);
					person.setLastName(lastName);
					person.setCity(city);
				})
				.build();

		//Then
		assertThat(result).isNotNull();
		assertThat(result.getFirstName()).isEqualTo(firstName);
		assertThat(result.getLastName()).isEqualTo(lastName);
		assertThat(result.getCity()).isEqualTo(city);
		assertThat(result.isHomeOwner()).isTrue();
		assertThat(result.isEmployed()).isTrue();
	}

	private Consumer<Person> defaultInfo() {
		return person -> {
			person.setHomeOwner(true);
			person.setEmployed(true);
		};
	}
}
