package br.com.workflow.dto;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.workflow.constants.Propertys;
import lombok.Data;

@Data
@Document(collection = "activity")
public class Activity implements Serializable {

	@Id
	private String id;

	@JsonProperty(required=true)
	@Valid
	@NotNull
	@NotBlank
	private String title;

	private String description;

	private String image;

	private String link;

	private String file; //anexo

	private Float value; //price or coust

	private Propertys property; //negative or positiv

	@JsonProperty(required=true)
	@Valid
	@NotNull
	@NotBlank
	private Category category;

	private User user;

	private Integer maturity; //limit date
	
	//FlowProcess
    private boolean active; //open or closed
    
    private boolean focus;//atuante
    
    

}
