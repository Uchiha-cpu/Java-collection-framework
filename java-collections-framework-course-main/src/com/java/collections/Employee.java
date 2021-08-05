package com.java.collections;

import java.time.LocalDate;

public class Employee {


		// TODO Auto-generated method stub
		private int id;
		private String name;
		private double salary;
		private LocalDate joiningdate;
		
		public Employee(int id, String name, double salary, LocalDate joiningdate) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.joiningdate = joiningdate;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public LocalDate getJoiningdate() {
			return joiningdate;
		}

		public void setJoiningdate(LocalDate joiningdate) {
			this.joiningdate = joiningdate;
		}

		@Override
		public String toString() {
			return "Employee [Id="+id+"Name=" + name + ", Salary=" + salary + "+Joining Date="+joiningdate+"]";
		}
	}


