package com.example.EmpMongoDB;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/javainuse")
public class EmpController {
	
	@Autowired
	 EmpService empservice;
	
	
	@GetMapping
	public List<EmpEntity> getAllEmpDetails() {
		return empservice.getAllEmpDetails();
	}
	
	@PostMapping
	public EmpEntity addEmpDetails(@RequestBody EmpEntity empentity) {
		return empservice.saveEmpDetail(empentity);
	}
	
	@GetMapping("/{id}")
	public EmpEntity getByEmpId(@PathVariable ("id") ObjectId id) {
		return empservice.getByEmpId(id);
	}
	 @PutMapping("/{id}")
	 public EmpEntity getUpdate(@RequestBody EmpEntity empentity,@PathVariable ObjectId id) {
		 return empservice.saveEmpDetail(empentity);
	 }
	 
	 @DeleteMapping("/{id}")
	 public void deleteEmp(@RequestBody EmpEntity empentity,@PathVariable ObjectId id) {
		  empservice.deleteEmp(id);
	 }
	

}
