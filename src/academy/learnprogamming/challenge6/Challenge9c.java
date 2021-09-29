package academy.learnprogamming.challenge6;

public class Challenge9c {
    public static void main(String[] args) {

        Challenge9bKt.sayHelloToJava("Student");

        EmployeeKt employeeKt = new EmployeeKt("John", "Smith", 2010);
        employeeKt.setStartYear(2009);

        Challenge.INSTANCE.doMath(5, 4);

        /*KotlinStuff.sayHelloToJava("Student");

        EmployeeKt employeeKt = new EmployeeKt("John", "Smith", 2010);
        employeeKt.startYear = 2009;

        Challenge.doMath(5, 4);*/

        employeeKt.takesDefault(null);

    }
}
