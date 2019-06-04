package br.com.workflow.dto;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "flow")
public class Flow implements Serializable{

	@Id
	private String id;
	
	private String title;
	
    private String description;

    private List<Activity> activitys;
    
}
