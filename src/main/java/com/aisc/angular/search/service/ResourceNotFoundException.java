package com.aisc.angular.search.service;

public class ResourceNotFoundException extends Exception {

	private static final long serialVersionUID = -9079454849611061074L;

	public ResourceNotFoundException() {
		super();
	}

	public ResourceNotFoundException(String message, String recordId, long id) {
		super(message);
	}

	public ResourceNotFoundException(final String message) {
		super(message);
	}
}