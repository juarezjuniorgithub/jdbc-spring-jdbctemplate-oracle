package com.oracle.jdbc.template;

public enum EmployeeMessages {

	EMPLOYEE_CREATION_FAILED("Employee creation failed: "), EMPLOYEE_UPDATE_FAILED("Employee updated failed: "),
	EMPLOYEE_DELETION_FAILED("Employee deletion failed: "), EMPLOYEE_NOT_FOUND("Employee not found: "),
	EMPLOYEE_CREATED("Employee created: "), EMPLOYEE_UPDATED("Employee updated: "),
	EMPLOYEE_DELETED("Employee deleted: ");

	private final String message;

	private EmployeeMessages(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
