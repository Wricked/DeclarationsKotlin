package academy.learnprogamming.javacode;

public class JavaEmployee {

    private final String firstName;
    private Boolean fulltime;

    public JavaEmployee(String firstName, Boolean fulltime) {
        this.firstName = firstName;
        this.fulltime = fulltime;
    }

    public String getFirstName() {
        return firstName;
    }

    public Boolean getFulltime() {
        return fulltime;
    }

    public void setFulltime(Boolean fulltime) {
        this.fulltime = fulltime;
    }
}
