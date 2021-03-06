package com.rest.automation.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto {
	
	private CompanyDto company;
	
	private Boolean status;
	
	private String fullName;
	
	private String role;
	
    private String username;
	
    private String password;

}
