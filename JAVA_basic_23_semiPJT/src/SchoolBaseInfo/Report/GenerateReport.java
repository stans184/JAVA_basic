package SchoolBaseInfo.Report;

import java.util.ArrayList;

import GradeGenerate.BasicEvaluation;
import GradeGenerate.GradeEvaluation;
import GradeGenerate.MajorEvaluation;
import SchoolBaseInfo.School;
import SchoolBaseInfo.Score;
import SchoolBaseInfo.Student;
import SchoolBaseInfo.Subject;
import util.Define;

public class GenerateReport {
	
	School school = School.getInstance();
	
	public static final String TITLE = " 수강생 학점 \t\t\n";
	public static final String HEADER = " 이름  |  학번  |중점과목| 점수   \n";
	public static final String LINE = "-------------------------------------\n";
	
	private StringBuffer sb = new StringBuffer();
	
	public String getReport() {
		ArrayList<Subject> subjectList = new ArrayList<Subject>();
		
		for (Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}
		
		return sb.toString();
	}
	
	public void makeHeader(Subject subject) {
		sb.append(GenerateReport.LINE);
		sb.append("\t" + subject.getSubjectName());
		sb.append(GenerateReport.TITLE);
		sb.append(GenerateReport.HEADER);
		sb.append(GenerateReport.LINE);
	}
	
	public void makeBody(Subject subject) {
		ArrayList<Student> studentList = subject.getStudentList();
		
		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			sb.append(student.getStudentName());
			sb.append(" | ");
			sb.append(student.getStudentId());
			sb.append(" | ");
			sb.append(student.getMajorSubject().getSubjectName() + "\t");
			sb.append(" | ");
			
			getScoreGrade(student, subject.getSubjectId());
			sb.append("\n");
			sb.append(GenerateReport.LINE);
		}
	}
	
	public void getScoreGrade(Student student, int subjectId) {
		
		ArrayList<Score> scoreList = new ArrayList<Score>();
		int majorId = student.getMajorSubject().getSubjectId();
		
		GradeEvaluation[] evaluationWay = {new BasicEvaluation(), new MajorEvaluation()};
		
		for (int i = 0; i < scoreList.size(); i++) {
			
			Score score = scoreList.get(i);
			
			if (score.getSubject().getSubjectId() == subjectId) {
				
				String grade;
				
				if (score.getSubject().getSubjectId() == majorId) 
					grade = evaluationWay[Define.SAB_TYPE].getGrade(score.getPoint());
				else
					grade = evaluationWay[Define.AB_TYPE].getGrade(score.getPoint());
				
				sb.append(score.getPoint());
				sb.append(":");
				sb.append(grade);
				sb.append(" | ");
			}
		}
	}
	
	public void makeFooter() {
		sb.append("\n");
	}
}