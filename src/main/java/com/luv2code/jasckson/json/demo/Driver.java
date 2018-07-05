package com.luv2code.jasckson.json.demo;

import java.io.File;
import java.nio.MappedByteBuffer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		try {
			// create object mapper
			ObjectMapper objectMapper = new ObjectMapper();
			
			// read json file and convert into java POJO
			// data/sample-lite.json
			
			Student student = 
					objectMapper.readValue(new File("data/sample-full.json"), Student.class);
			
			System.out.println(student.getFirstName() + "  " + student.getLastName());
			
			Address theAddress = student.getAddress();
			System.out.println("Address: " + "\n " + theAddress.getCity() + "\n " + theAddress.getState() + "\n " + theAddress.getCountry());
			
			String []languages = student.getLanguages();
			
			System.out.print("Languages: ");
			for(String temp : languages) {
				System.out.print(temp + ", ");
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
