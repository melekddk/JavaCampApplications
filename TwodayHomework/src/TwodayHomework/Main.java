package TwodayHomework;

public class Main {

	public static void main(String[] args) {
	
		Courses courses1 = new Courses(1, "Programlamaya Giriþ için Temel Kurs", "Engin Demiroð", 0.100, "Kurs yeni baþlayanlara");
		Courses courses2 = new Courses(2,"C# Yetiþtirme Kampý", "Engin Demiroð", 0.40, "C#, Angular tabanlý program");
		Courses courses3 = new Courses(3,"Java Yetiþtirme Kampý", "Engin Demiroð", 0.50, "Java ve React tabanlý bir kamp");

		Courses[] courses = {courses1,courses2,courses3};
		
		for(Courses course: courses) {
			System.out.println(course.KursAdi);
			
		}
		System.out.println(courses.length);
	}

}
