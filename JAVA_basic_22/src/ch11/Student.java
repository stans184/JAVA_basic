package ch11;

public class Student {
	
	private String studentName;
	
	MyLogger logger = MyLogger.getLogger();
	
	public Student(String name) throws StudentNameFormatException {
		
		if (name == null) {
			throw new StudentNameFormatException("You have to input someone's name");
		}
		else if (name.split(" ").length > 4) {
			throw new StudentNameFormatException("name too long, smaller than 4");
		}
		
		this.studentName = name;
		
	}

	public String getStudentName() {
		
		logger.fine("student name sended");
		
		return studentName;
	}
	
}
