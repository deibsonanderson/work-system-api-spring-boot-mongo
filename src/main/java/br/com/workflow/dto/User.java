package br.com.workflow.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.workflow.constants.Profiles;
import lombok.Data;

@Data
@Document(collection = "user")
public class User implements Serializable {

	@Id
	private String id;

	private String name;

	private String image;

	private String login;

	private String password;

	private Profiles profile;
}
