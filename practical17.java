class University {

    // Static data member
    static int totalStudents;

    // Static variable
    static String universityName;

    // Static block
    static {
        universityName = "GTU University";
        totalStudents = 5000;
        System.out.println("Static Block Executed");
    }

    // Instance block
    {
        System.out.println("Instance Block Executed");
        totalStudents++;
    }

    // Constructor
    University() {
        System.out.println("Constructor Executed");
    }

    // Static method
    static int getTotalStudents() {
        return totalStudents;
    }

    public static void main(String[] args) {

        System.out.println("Main Method Started");

        University s1 = new University();
        University s2 = new University();
        University s3 = new University();

        System.out.println("Total Students: " + University.getTotalStudents());
    }
}
