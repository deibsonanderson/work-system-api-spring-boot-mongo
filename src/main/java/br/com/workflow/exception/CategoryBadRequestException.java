package br.com.workflow.exception;

public class CategoryBadRequestException extends RuntimeException {

	public CategoryBadRequestException(){}
	
	public CategoryBadRequestException(String message){
		super(message);
	}
	
}
