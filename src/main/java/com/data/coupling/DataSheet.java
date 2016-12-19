package com.data.coupling;

import java.util.Arrays;

public class DataSheet {

	private String globalVariable;

	private String[] accessedFileName;

	private String[] accessedTestCaseNO;
	private String[] accessedTSCname;

	private String[] modifiedFileName;
	private String[] modifiedTestCaseNO;
	private String[] modifiedTSCname;
	private String[] Remark;
	
	

	/**
	 * @return the remark
	 */
	public String[] getRemark() {
		return Remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String[] remark) {
		Remark = remark;
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

	/**
	 * @return the accessedFileName
	 */
	public String[] getAccessedFileName() {
		return accessedFileName;
	}

	/**
	 * @param accessedFileName
	 *            the accessedFileName to set
	 */
	public void setAccessedFileName(String[] accessedFileName) {
		this.accessedFileName = accessedFileName;
	}

	/**
	 * @return the accessedTestCaseNO
	 */
	public String[] getAccessedTestCaseNO() {
		return accessedTestCaseNO;
	}

	/**
	 * @param accessedTestCaseNO
	 *            the accessedTestCaseNO to set
	 */
	public void setAccessedTestCaseNO(String[] accessedTestCaseNO) {
		this.accessedTestCaseNO = accessedTestCaseNO;
	}

	/**
	 * @return the accessedTSCname
	 */
	public String[] getAccessedTSCname() {
		return accessedTSCname;
	}

	/**
	 * @param accessedTSCname
	 *            the accessedTSCname to set
	 */
	public void setAccessedTSCname(String[] accessedTSCname) {
		this.accessedTSCname = accessedTSCname;
	}

	/**
	 * @return the modifiedFileName
	 */
	public String[] getModifiedFileName() {
		return modifiedFileName;
	}

	/**
	 * @param modifiedFileName
	 *            the modifiedFileName to set
	 */
	public void setModifiedFileName(String[] modifiedFileName) {
		this.modifiedFileName = modifiedFileName;
	}

	/**
	 * @return the modifiedTestCaseNO
	 */
	public String[] getModifiedTestCaseNO() {
		return modifiedTestCaseNO;
	}

	/**
	 * @param modifiedTestCaseNO
	 *            the modifiedTestCaseNO to set
	 */
	public void setModifiedTestCaseNO(String[] modifiedTestCaseNO) {
		this.modifiedTestCaseNO = modifiedTestCaseNO;
	}

	/**
	 * @return the modifiedTSCname
	 */
	public String[] getModifiedTSCname() {
		return modifiedTSCname;
	}

	/**
	 * @param modifiedTSCname
	 *            the modifiedTSCname to set
	 */
	public void setModifiedTSCname(String[] modifiedTSCname) {
		this.modifiedTSCname = modifiedTSCname;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DataSheet [globalVariable=" + globalVariable + ", accessedFileName=" + Arrays.toString(accessedFileName)
				+ ", accessedTestCaseNO=" + Arrays.toString(accessedTestCaseNO) + ", accessedTSCname="
				+ Arrays.toString(accessedTSCname) + ", modifiedFileName=" + Arrays.toString(modifiedFileName)
				+ ", modifiedTestCaseNO=" + Arrays.toString(modifiedTestCaseNO) + ", modifiedTSCname="
				+ Arrays.toString(modifiedTSCname) + "]";
	}
}
