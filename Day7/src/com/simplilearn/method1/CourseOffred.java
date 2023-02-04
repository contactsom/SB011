package com.simplilearn.method1;

public class CourseOffred extends Course{

	public static void main(String[] args) {
		
		CourseOffred courseOffred = new CourseOffred();
		courseOffred.bTechClass();
		courseOffred.mcaClass();
		courseOffred.mbaClass();
		courseOffred.phdClass();
		// new Courses
		courseOffred.mtechClass();

	}

	@Override
	void bTechClass() {
		System.out.println("Admission Started for B.Tech");
		
	}

	@Override
	void mcaClass() {
		System.out.println("Admission Started for MCA");
		
	}

	@Override
	void mbaClass() {
		System.out.println("Admission Started for MBA");
		
	}

	@Override
	void phdClass() {
		System.out.println("Admission Started for PhD");
		
	}

	@Override
	void mtechClass() {
		System.out.println("NEW: Admission Started for M.Tech");
		
	}

}
