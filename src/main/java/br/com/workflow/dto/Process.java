package br.com.workflow.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "process")
public class Process implements Serializable{

	@Id
	private String id;

	private String title;

	private String description;
	
	private Float provision;
	
	private User user;

	private Flow flow;

	private Date date;
	
	private List<Comment> comments;

}
