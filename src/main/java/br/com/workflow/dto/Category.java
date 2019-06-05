package br.com.workflow.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "category")
public class Category implements Serializable {

	@Id
	private String id;

	private String title;

	private String description;

}
