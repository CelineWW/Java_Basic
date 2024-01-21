
/**
 * enumeration class EnumerationMonth- ask user for the number of month,
 * display the name of the month. 
 *
 * @Celine Wang
 * @01/19/2024
 */
public enum Month2{
    JAN("January"),
    FEB("Feburay"),
    MAR("March"),
    APR("April"),
    MAY("May"),
    JUN("June"),
    JUL("July"),
    AUG("August"),
    SEP("September"),
    OCT("October"),
    NOV("November"),
    DEC("December");
    
    String month;
    
    private Month2(String month){
        this.month = month;
    }
    
    public String getMonth(){
        return month;
    }
}
