package com.momra.rest.model.dto;

import org.springframework.stereotype.Component;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Component
public class CustomerDTO {

	@Schema(description = "this is the database id ", required = false)
	private Long id ;
	@Schema(description = "This is the customer first name", required = true)
	private String firstName;
	@Schema(description = "This is the customer last name", required = true)
	private String lastName;

}
