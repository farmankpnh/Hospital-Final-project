package com.farman.mindtree.hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farman.mindtree.hospital.Entity.Doctor;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> 
{

	 public Doctor findByName(String name);
}
