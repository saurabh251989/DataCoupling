package com.data.coupling;

public class Check {

	static Validation getComment(String globalVariable, DataSheet dataSheet) {

		Validation validation = new Validation();
		validation.setGlobalVariable(globalVariable);

		if (dataSheet.getAccessedFileName() == null) {

		} else {

			String commentAccess[] = new String[dataSheet.getAccessedFileName().length];
			String[] accessedFileName = dataSheet.getAccessedFileName();

			for (int i = 0; i < accessedFileName.length; i++) {
			
					String name=accessedFileName[i];

					String[] accessedTSCname = dataSheet.getAccessedTSCname();
					boolean flag = false;
					found: for (int j = 0; accessedTSCname != null && j < accessedTSCname.length; j++) {

						if (accessedTSCname[j].startsWith(name.replace(".c", ""))) {
							flag = true;
							break found;
						} else {
							continue;
						}

					}
					if (!flag) {
						commentAccess[i] = globalVariable + " is not mapped for " + accessedFileName[i];
					}

					if (accessedFileName != null) {
						if (dataSheet.getAccessedTSCname() != null && dataSheet.getAccessedTestCaseNO() != null) {
							if (dataSheet.getAccessedTSCname().length != dataSheet.getAccessedTestCaseNO().length) {

								commentAccess[dataSheet.getAccessedFileName().length] = globalVariable
										+ "TSC and Test case no is not mapped proper ";

							}
						}

					}

				}
			
			validation.setCommentAccess(commentAccess);
		}

		if (dataSheet.getModifiedFileName() == null) {

		} else {

			String commentModified[] = new String[dataSheet.getModifiedFileName().length + 1];
			String[] modifiedFileName = dataSheet.getModifiedFileName();

			for (int i = 0; i < modifiedFileName.length; i++) {
					
					String name=modifiedFileName[i];
					String[] modifiedTSCname = dataSheet.getModifiedTSCname();
					boolean flag = false;
					found: for (int j = 0; modifiedTSCname != null && j < modifiedTSCname.length; j++) {

						if (modifiedTSCname[j].startsWith(name.replace(".c", ""))) {
							flag = true;
							break found;
						} else {
							continue;
						}
					}
					if (!flag) {
						commentModified[i] = globalVariable + " is not mapped for " + modifiedFileName[i];
					}

				}

				if (modifiedFileName != null) {
					if (dataSheet.getModifiedTSCname() != null && dataSheet.getModifiedTestCaseNO() != null) {
						if (dataSheet.getModifiedTSCname().length != dataSheet.getModifiedTestCaseNO().length) {

							commentModified[dataSheet.getModifiedFileName().length] = globalVariable
									+ "TSC and Test case no is not mapped proper ";

						}
					}

				}
			
			validation.setCommentModified(commentModified);
		}

		return validation;
	}

}
