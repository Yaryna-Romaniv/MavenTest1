public class Student {
    //fields
    public String lastName;
    private String firstName;
    public int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String lastName) {
        this.firstName = firstName;
    }

    //constructor
    public Student(String name){
        firstName = name;
    }

    public boolean passExam(String subject){
        //do smth
        return true;
    }

    /*public void print() {
        System.out.println(firstName);
    }*/


}
