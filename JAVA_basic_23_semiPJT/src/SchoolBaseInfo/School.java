package SchoolBaseInfo;

import java.util.ArrayList;

// 학교는 하나이기 때문에 singleTone pattern 으로 만든다
public class School {
	// method 밖에서는 만들 수 없게 default constructor 는 private 로 생성
	private static School instance = new School();
	
	// 원래는 DB 에서 관리하는 자료들이나, 아직 거기까지 다뤄보지 못앴으므로
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	private School() {}
	
	public static School getInstance() {
		
		if (instance == null) {
			return new School();
		}
		
		return instance;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}
	
	// 새로운 학생이나 과목을 들록시킴
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}
	
}