package TwodayHomework;

public class Main {

	public static void main(String[] args) {
	
		Courses courses1 = new Courses(1, "Programlamaya Giri� i�in Temel Kurs", "Engin Demiro�", 0.100, "Kurs yeni ba�layanlara");
		Courses courses2 = new Courses(2,"C# Yeti�tirme Kamp�", "Engin Demiro�", 0.40, "C#, Angular tabanl� program");
		Courses courses3 = new Courses(3,"Java Yeti�tirme Kamp�", "Engin Demiro�", 0.50, "Java ve React tabanl� bir kamp");

		Courses[] courses = {courses1,courses2,courses3};
		
		for(Courses course: courses) {
			System.out.println(course.KursAdi);
			
		}
		System.out.println(courses.length);
	}

}
