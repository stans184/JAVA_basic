package SchoolBaseInfo;

import java.util.ArrayList;
import util.Define;

public class Subject {

	private String subjectName;
	private int subjectId;
	private int gradeType;
	
	private ArrayList<Student> studentList = new ArrayList<>();
	
	public Subject(String name, int id) {
		this.subjectName = name;
		this.subjectId = id;
		this.gradeType = Define.AB_TYPE;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}
	
	public ArrayList<Student> getStudentList(){
		return studentList;
	}
	
	public void setStudentList(ArrayList<Student> list) {
		this.studentList = list;
	}
	// 수강신청
	public void register(Student student) {
		studentList.add(student);
	}
}
