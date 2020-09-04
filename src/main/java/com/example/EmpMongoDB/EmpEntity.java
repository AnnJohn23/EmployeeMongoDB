 package com.example.EmpMongoDB;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Data
@Setter
@Getter
@Document
public class EmpEntity {
	

	
	@Id
       ObjectId id;

	private String empName;
	private String empDept;
	
	public String getId() 
	{
		return id.toHexString();
	}
	
    public void setId(ObjectId id) { 
    	
    	this.id = id;
    	     
    	}
	


}
