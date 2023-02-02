package ch11;

public class StudentTest {

	public static void main(String[] args) {
		
		MyLogger logger = MyLogger.getLogger();
		
		String name1 = null;
		
		try {
			Student student1 = new Student(name1);
			System.out.println(student1.getStudentName());
		} catch (StudentNameFormatException e) {
			logger.warning(e.getMessage());
		}
		
		String name2 = "moon fall sun rise 345";
		try {
			Student student2 = new Student(name2);
			System.out.println(student2.getStudentName());
		} catch (StudentNameFormatException e) {
			logger.warning(e.getMessage());
		}

		String name3 = "JACK";
		try {
			Student student3 = new Student(name3);
			System.out.println(student3.getStudentName());
		} catch (StudentNameFormatException e) {
			logger.warning(e.getMessage());
		}
		
	}

}
