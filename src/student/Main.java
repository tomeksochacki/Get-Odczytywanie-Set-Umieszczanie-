package student;

public class Main {
    public static void main(String[] args) {

    Student s1 = new Student();
    s1.setSurename("Sochacki");
        System.out.println(s1.getSurename());
        s1.setSurename("S");
        System.out.println(s1.getSurename());

        s1.setRating(3);
        System.out.println(s1.getRating());
        s1.setRating(6);
        System.out.println(s1.getRating());


    }
}
