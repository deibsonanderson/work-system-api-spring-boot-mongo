package br.com.workflow.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "comment")
public class Comment  implements Serializable {

	@Id
	private String id;

	private String description;

	private String attachment;

	private Date date;

}
