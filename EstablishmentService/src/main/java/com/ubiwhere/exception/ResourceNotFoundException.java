package com.ubiwhere.exception;

/**
 * Exception to be thrown when a entity was not founded on the databases.
 * @author vinicius
 *
 */
public class ResourceNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object resourId) {
		super(resourId != null ? resourId.toString() : null);
	}

}
