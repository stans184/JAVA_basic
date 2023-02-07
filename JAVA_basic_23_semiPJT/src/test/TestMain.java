package test;

import java.io.FileWriter;

import SchoolBaseInfo.School;
import SchoolBaseInfo.Score;
import SchoolBaseInfo.Student;
import SchoolBaseInfo.Subject;
import SchoolBaseInfo.Report.GenerateReport;
import util.Define;

public class TestMain {

	School bojeongHighschool = School.getInstance();
	Subject math;
	Subject korean;
	
	GenerateReport makeReport = new GenerateReport();
	
	public static void main(String[] args) {
		
		TestMain test = new TestMain();
		
		test.createSubject();
		test.createStudent();
		
		String report = test.makeReport.getReport();
		String fileName = "gradeList.txt";
		
		System.out.println(report);
		
		try (FileWriter fw = new FileWriter(fileName)){
			
			fw.write(report);
			fw.write("normally end");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("main thread done");
	}
	
	public void createSubject() {
		
		korean = new Subject("KOREAN", Define.KOREAN);
		math = new Subject("MATH", Define.MATH);
		
		bojeongHighschool.addSubject(korean);
		bojeongHighschool.addSubject(math);
	}
	
	public void createStudent() {
		
		Student student1 = new Student(211213, "KANG", korean  );
		Student student2 = new Student(212330, "KIM", math  );
		Student student3 = new Student(201518, "SHIN", korean  );
		Student student4 = new Student(202360, "LEE", korean  );
		Student student5 = new Student(201290, "HONG", math );
		
		bojeongHighschool.addStudent(student1);
		bojeongHighschool.addStudent(student2);
		bojeongHighschool.addStudent(student3);
		bojeongHighschool.addStudent(student4);
		bojeongHighschool.addStudent(student5);
		
		korean.register(student1);
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);
		korean.register(student5);
		
		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);
		
		addScoreForStudent(student1, korean, 95); 
		addScoreForStudent(student1, math, 56);	
		
		addScoreForStudent(student2, korean, 95); 
		addScoreForStudent(student2, math, 95);	
		
		addScoreForStudent(student3, korean, 100); 
		addScoreForStudent(student3, math, 88);	
		
		addScoreForStudent(student4, korean, 89); 
		addScoreForStudent(student4, math, 95);	
		
		addScoreForStudent(student5, korean, 85); 
		addScoreForStudent(student5, math, 56);	
	}
	
	public void addScoreForStudent(Student student, Subject subject, int point) {
		
		Score score = new Score(student.getStudentId(), subject, point);
		student.addSubjectScore(score);
	}
}