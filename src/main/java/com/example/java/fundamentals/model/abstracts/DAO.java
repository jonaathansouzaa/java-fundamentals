package com.example.java.fundamentals.model.abstracts;

public abstract class DAO {

	public abstract void validEntity(Person person) throws Exception;
	
	protected abstract PersonDTO returnConverter(Person person);

	public void save(Person person) throws Exception {
		validEntity(person);
		executeSave(person);
		returnConverter(person);
	}

	private void executeSave(Person person) {
		//persist(baseEntity)
	}
	
}
