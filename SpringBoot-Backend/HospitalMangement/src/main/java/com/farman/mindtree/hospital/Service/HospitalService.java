package com.farman.mindtree.hospital.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.farman.mindtree.hospital.Entity.Doctor;
import com.farman.mindtree.hospital.Entity.Patient;


@Service
public interface HospitalService {
	 public Doctor showDoctorInformation(String name);
	    public Patient showPatientInformation(Integer Id);
	    public boolean saveDoctorInformation(Doctor doctor);
	    public boolean savePatientInformation(Patient patient);
	    public List<Patient> getPatientListOfDoctor(String name,Doctor doctor);
	    public List<Doctor> getDoctors();


}
