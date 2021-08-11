package com.spring.orm.api.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Person {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")
	private Date dob;

}
