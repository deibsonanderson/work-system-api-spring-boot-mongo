package br.com.workflow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.workflow.constants.Profiles;
import br.com.workflow.constants.Propertys;
import br.com.workflow.dto.Activity;
import br.com.workflow.dto.Category;
import br.com.workflow.dto.Flow;
import br.com.workflow.dto.Process;
import br.com.workflow.dto.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestExample {

	
	@Test
	public void testeObjeto(){
		Process process = new Process();
		process.setId("44");
		process.setDate(new Date());
		process.setDescription("description");
		process.setFlow(getFlow());
		process.setProvision(20.0f);
		process.setTitle("title");
		process.setUser(getUser());
	}
	
	private User getUser(){
		User user = new User();
		user.setId("1");
		user.setImage("image");
		user.setLogin("login");
		user.setName("name");
		user.setPassword("password");
		user.setProfile(Profiles.ADMINISTRATOR);
		return user;
	}
	
	private Flow getFlow(){
		Flow flow = new Flow();
		flow.setActivitys(getActivitys());
		flow.setDescription("description");
		flow.setId("44");
		flow.setTitle("title");
		return flow;
	}
	
	private List<Activity> getActivitys(){
		List<Activity> activitys = new ArrayList<>();
		activitys.add(getActivity("1"));
		activitys.add(getActivity("2"));
		return activitys;
	}
	
	private Activity getActivity(String id){
		Activity activity = new Activity();
		activity.setId(id);
		activity.setTitle("title");
		activity.setDescription("description");
		activity.setImage("imagem.jpg");
		activity.setLink("http://www.google.com");
		activity.setFile("arquive.pdf"); //anexo
		activity.setValue(10.1f); //price or coust
		activity.setProperty(Propertys.POSITIV); //negative or positiv
		activity.setCategory(getCategory());
		activity.setUser(getUser());
		activity.setMaturity(23); //limit date
		activity.setActive(true); //open or closed
		activity.setFocus(false);//atuante
		return activity;
	}
	
	private Category getCategory(){
		Category category = new Category();
		category.setId("22");
		category.setTitle("title");
		category.setDescription("description");
		return category;
	} 
	
}
