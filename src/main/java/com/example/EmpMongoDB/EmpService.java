package com.example.EmpMongoDB;


import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.datatype.jdk8.OptionalDoubleSerializer;



@Service
public class EmpService {
	
	@Autowired
	EmpRepository emprepository;

	//GET
	public List<EmpEntity> getAllEmpDetails() {
		return (List<EmpEntity>) emprepository.findAll();
	}
	
	//POST
	public EmpEntity saveEmpDetail(EmpEntity empentity) {
		return emprepository.save(empentity);
	}

	//GET BY ID
	public EmpEntity getByEmpId(ObjectId id) {
		Optional<EmpEntity>op=emprepository.findById(id);
		return op.get();
				}

	public void deleteEmp(ObjectId id) {
		
		 emprepository.deleteById(id);;
	}


	
}
