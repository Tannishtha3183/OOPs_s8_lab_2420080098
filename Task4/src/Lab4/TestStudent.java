package Lab4;

public class TestStudent {
    public static void main(String[] args) {
        student student = new student();
        student.setDetails(101, 'A', "John Doe");
        student.showDetails();
        System.out.println("Accessing name directly: " + student.name);
        

}


}
