package capstone.project.paticentpath.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import capstone.project.paticentpath.models.Doctor;
import capstone.project.paticentpath.services.impl.DoctorServiceImpl;
@CrossOrigin(origins = "http://localhost:4200", 
methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE} , maxAge = 3600)
@RestController
@RequestMapping("doctor")
public class DoctorController {
@Autowired
DoctorServiceImpl doctorservice;

@PostMapping
public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor) {
	
	Doctor doc = doctorservice.addDoctor(doctor);
	
	return new ResponseEntity<Doctor>(doc,HttpStatus.ACCEPTED);
}

@GetMapping
public List<Doctor> getAllDoctors(){
	return doctorservice.getAllDoctors();
}


@DeleteMapping("{id}")
public boolean deleteDoctorByID(@PathVariable int id) {
	boolean res=false;
	res = doctorservice.deleteDoctor(id);
	if(res) {
		return true;
	}
	
	return false;
}
}
