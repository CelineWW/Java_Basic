
public class EmployeeStaff extends EmployeePerson {

   private String managerName;

   // ***********************************************************************

   // Default constructor
   public EmployeeStaff() {
      managerName = "";
   } 

   // ***********************************************************************

   // Constructor with parameters
   public EmployeeStaff(String reportsTo) {
      managerName = reportsTo;
   } 

   // ***********************************************************************

   // Get the name of the manager
   public String getManagerName() {
      return managerName;
   } 

   // ***********************************************************************

   // FIXME: Override the EmployeePerson class' printInfo method with a 
   // FIXME: printInfo method to print all staff fields.

   @Override
   public void printInfo() {
	   super.printInfo();
	   System.out.println(", Manager: " + managerName);
   } 
}
