package com.assignmentFive;

public class CustomProgram {
	private static void addNewApplicants(CustomList<ApplicationInfo> applicants) {
		for (int i = 0; i < 15; i++) {
			
			//For each index, add a new member (Elon Musk #) to our list, we then instantiate in main.
			ApplicationInfo applicant = new ApplicationInfo("Elon " + (i+1), "Musk " + (i+1));
			applicants.add(applicant);
			System.out.println(applicant);
		}
	}
	
	public static void main(String[] args) {
		CustomList<ApplicationInfo> applicant = new CustomArrayList<>();
		
		//Get the size and index location of the first applicant
		System.out.println("# of starting applicants: " + applicant.getSize());
		System.out.println("1st Applicant " + applicant.get(0));
		
		///Return the 5th applicant in the index.
		System.out.println("Applicant #5: " + applicant.get(4));
		
		//Add the String
		applicant.add(new ApplicationInfo("Member", " "));
		System.out.println("Number of new applicants: " + applicant.getSize());
		addNewApplicants(applicant);
		
		//Get the final size of the list
		System.out.println("Number of applicants: " + applicant.getSize());
	
	}
}
