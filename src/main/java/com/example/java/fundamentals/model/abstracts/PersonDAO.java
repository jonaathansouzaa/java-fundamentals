package com.example.java.fundamentals.model.abstracts;

public class PersonDAO extends DAO {

	@Override
	public void validEntity(Person person) throws Exception {
		if (person.getName() == null) {
			throw new Exception("Name is required.");
		}
	}

	@Override
	protected PersonDTO returnConverter(Person person) {
		return new PersonConverter().toDto(person);
	}

	
	
}
