package com.data.coupling;

public class Validation {

	private String globalVariable;
	private String[] commentAccess;
	private String[] commentModified;

	/**
	 * @return the commentAccess
	 */
	public String[] getCommentAccess() {
		return commentAccess;
	}

	/**
	 * @param commentAccess
	 *            the commentAccess to set
	 */
	public void setCommentAccess(String[] commentAccess) {
		this.commentAccess = commentAccess;
	}

	/**
	 * @return the commentModified
	 */
	public String[] getCommentModified() {
		return commentModified;
	}

	/**
	 * @param commentModified
	 *            the commentModified to set
	 */
	public void setCommentModified(String[] commentModified) {
		this.commentModified = commentModified;
	}

	/**
	 * @return the globalVariable
	 */
	public String getGlobalVariable() {
		return globalVariable;
	}

	/**
	 * @param globalVariable
	 *            the globalVariable to set
	 */
	public void setGlobalVariable(String globalVariable) {
		this.globalVariable = globalVariable;
	}

	
	

}
