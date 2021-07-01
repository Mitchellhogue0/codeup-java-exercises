public class Oberon {

    // TODO: CREATE A NEW "OBERON" CLASS WITH AT LEAST 6 PROPERTIES
//  THAT DESCRIBE OUR OBERON COHORT. MAKE SURE TO INCLUDE
//  AT LEAST THREE DIFFERENT TYPES OF DATA IN YOUR CLASS. IN A
//  SEPARATE FILE, CREATE 3 INSTANCES OF THE OBERON CLASS AND
//  PRINT OUT A STRING THAT USES AT LEAST 3 OF THOSE PROPERTIES
//  TO DESCRIBE THAT OBERON INSTANCE.

    private String name;
    private int studentNumber;
    private int weekAmount;
    private String instructor;
    private boolean isTheBestBoot;
    private boolean isJobGuaranteed;


    public Oberon(String name, int studentNumber, int weekAmount, String instructor, boolean isTheBestBoot, boolean isJobGuaranteed) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.weekAmount = weekAmount;
        this.instructor = instructor;
        this.isTheBestBoot = isTheBestBoot;
        this.isJobGuaranteed = isJobGuaranteed;
    }

    public Oberon() {

    }

    //Properties

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getWeekAmount() {
        return weekAmount;
    }

    public void setWeekAmount(int weekAmount) {
        this.weekAmount = weekAmount;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public boolean isTheBestBoot() {
        return isTheBestBoot;
    }

    public void setTheBestBoot(boolean theBestBoot) {
        isTheBestBoot = theBestBoot;
    }

    public boolean isJobGuaranteed() {
        return isJobGuaranteed;
    }

    public void setJobGuaranteed(boolean jobGuaranteed) {
        isJobGuaranteed = jobGuaranteed;
    }

}
