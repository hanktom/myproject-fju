package com.java2.object;

public class Tester {
	class Employee {
		String name;
		String email;
		int experience;

		public Employee(String name, String email, int experience) {
			super();
			this.name = name;
			this.email = email;
			this.experience = experience;
		}

		public String getName() {
			return name;
		}

		public String getEmail() {
			return email;
		}

		public int getExperience() {
			return experience;
		}
	}

	class Developer extends Employee {
		String mainLanguage;
		String[] skills;
		public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
			super(name, email, experience);
			this.mainLanguage = mainLanguage;
			this.skills = skills;
		}
		public String getMainLanguage() {
			return mainLanguage;
		}
		public String[] getSkills() {
			return skills;
		}
		
	}

	class DataAnalyst extends Employee {
		boolean phd;
		String[] methods;
		public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
			super(name, email, experience);
			this.phd = phd;
			this.methods = methods;
		}
		public boolean isPhd() {
			return phd;
		}
		public String[] getMethods() {
			return methods;
		}
	}

	public static void main(String[] args) {
		String[] skills = { "git", "Scala", "JBoss", "UML" };
		Developer developer = new Developer("Mary", "mary@mail.com", 3, "Java", skills);

		String[] mlMethods = { "neural networks", "decision tree", "bayesian algorithms" };
		DataAnalyst analyst = new DataAnalyst("John", "john@gmail.com", 2, true, mlMethods);
	}

}
