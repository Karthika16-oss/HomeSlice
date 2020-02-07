package com.foodie.homeslice.exception;

public class NoItemAvailableException extends RuntimeException {
	private static final long serialVersionUID = 1L;
		public NoItemAvailableException(String exception) {
			super(exception);
		}

}
