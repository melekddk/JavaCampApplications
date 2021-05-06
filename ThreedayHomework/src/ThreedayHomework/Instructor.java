package ThreedayHomework;
public class Instructor extends User {
	String courseNameTaught; //eðitimcinin verdiði ders
	String attendanceRate; //katýlým oraný
	String submitHomeworkState; //ödev gönderme durumu
	
	
	public String getCourseNameTaught() {
		return courseNameTaught;
	}
	public void setCourseNameTaught(String courseNameTaught) {
		this.courseNameTaught = courseNameTaught;
	}
	public String getAttendanceRate() {
		return attendanceRate;
	}
	public void setAttendanceRate(String attendanceRate) {
		this.attendanceRate = attendanceRate;
	}
	public String getSubmitHomeworkState() {
		return submitHomeworkState;
	}
	public void setSubmitHomeworkState(String submitHomeworkState) {
		this.submitHomeworkState = submitHomeworkState;
	}

}
