public class OfferedCourse extends Course {
   // TODO: Declare private fields
	private String instructorName;
	private String location;
	private String classTime;
	
   // TODO: Define mutator methods -
   //      setInstructorName(), setLocation(), setClassTime()
	public void setInstructorName(String instructorName_p) {
		instructorName = instructorName_p;
	}
	public void setLocation(String location_p) {
		location = location_p;
	}
	public void setClassTime(String classTime_p) {
		classTime = classTime_p;
	}

   // TODO: Define accessor methods -
   //      getInstructorName(), getLocation(), getClassTime()
	public String getInstructorName() {
		return instructorName;
	}
	public String getLocation() {
		return location;
	}
	public String getClassTime() {
		return classTime;
	}
}