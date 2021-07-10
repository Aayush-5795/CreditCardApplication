package com.creditcardapplication.api.dto;

import java.sql.Date;
import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationDto {
	
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	private LocalDate dob;
	@NotBlank
	private String panNumber;
	private String mobileNumber;
	@NotBlank
	private double annualSalary;

}
