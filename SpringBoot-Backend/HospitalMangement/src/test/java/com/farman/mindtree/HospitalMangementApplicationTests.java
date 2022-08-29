package com.farman.mindtree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.farman.mindtree.hospital.Entity.Patient;
import com.farman.mindtree.hospital.Repository.DoctorRepository;
import com.farman.mindtree.hospital.Repository.PatientRepository;

@SpringBootTest
class HospitalMangementApplicationTests {

	@Autowired
	DoctorRepository doctorRepository;
	
	@Autowired
	PatientRepository patientRepository;
	
	@Test
	public void jUnitTest() {
		assertNotNull(doctorRepository.findById(1).get());
	}
	
	@Test
	public void jTest()
	{
		assertNotNull(patientRepository.findById(2).get());
	}
	
	

}
