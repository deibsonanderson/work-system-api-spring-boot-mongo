package br.com.workflow.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "flow")
public class Process implements Serializable{

	@Id
	private String id;

	private String title;

	private String provision;
	
	private User user;

	private Flow flow;

	private String description;

	private Date date;

	private String flowProcess;

}
