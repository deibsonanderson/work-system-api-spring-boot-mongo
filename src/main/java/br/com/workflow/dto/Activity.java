package br.com.workflow.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "activity")
public class Activity implements Serializable {

	@Id
	private String id;

	private String title;

	private String description;

	private String image;

	private String link;

	private String file;

	private String value;

	private String property;

	private Category category;

	private String user;

	private String maturity;
	
	//FlowProcess
    private String active;
    
    private String practitioner;//atuante
    
    private String process;

}
