package com.assignmentFive;

public class CustomProgram {
	private static void addNewApplicants(CustomList<ApplicationInfo> applicants) {
		for (int i = 0; i < 15; i++) {
			ApplicationInfo applicant = new ApplicationInfo("Elon" + (i+1), "Musk" + (i+1));
			applicants.add(applicant);
			System.out.println(applicant);
		}
	}
	
	public static void main(String[] args) {
		CustomList<ApplicationInfo> applicant = new CustomArrayList<>();
		System.out.println("# of starting applicants: " + applicant.getSize());
		System.out.println("1st Applicant " + applicant.get(0));
		applicant.add(new ApplicationInfo("Member", " "));
		System.out.println("# of new applicants: " + applicant.getSize());
		addNewApplicants(applicant);
		System.out.println("# of total applicants: " + applicant.getSize());
		System.out.println("Applicant #5: " + applicant.get(4));
	}
}
