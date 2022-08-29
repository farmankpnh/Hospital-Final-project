package com.farman.mindtree.hospital.ServiceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.farman.mindtree.hospital.Entity.Doctor;
import com.farman.mindtree.hospital.Entity.Patient;
import com.farman.mindtree.hospital.Repository.DoctorRepository;
import com.farman.mindtree.hospital.Repository.PatientRepository;
import com.farman.mindtree.hospital.Service.HospitalService;

@Repository
@Transactional
public class HospitalServiceImpl implements HospitalService
{

	@Autowired
	DoctorRepository doctorRepository;
	@Autowired
	PatientRepository patientRepository;
	@Override
	
	public Doctor showDoctorInformation(String name) {
		// TODO Auto-generated method stub
		return doctorRepository.findByName(name);
	}
	@Override
	public Patient showPatientInformation(Integer Id) {
		// TODO Auto-generated method stub
		return patientRepository.findById(Id).get();
	}
	@Override
	public boolean saveDoctorInformation(Doctor doctor) {
		// TODO Auto-generated method stub
		 doctorRepository.save(doctor);
	        return true;
	}
	@Override
	public boolean savePatientInformation(Patient patient) {
		// TODO Auto-generated method stub
		  Doctor doctor = doctorRepository.findByName(patient.getDoctor_name());
	        doctor.addPatients(patient);
	        patientRepository.save(patient);
	        doctor.setPatient_count();
	        return true;
	}
	@Override
	public List<Patient> getPatientListOfDoctor(String name, Doctor doctor) {
		// TODO Auto-generated method stub
		return doctor.getPatients();
	}
	@Override
	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		 return (List<Doctor>) doctorRepository.findAll();
	}
	
}
