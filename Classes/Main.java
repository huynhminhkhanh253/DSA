package Classes;

public class Main {
    public static void main(String[] args) {
        Cookie cookieOne = new Cookie("blue");
        Cookie cookieTwo = new Cookie("green");

        cookieOne.setColor("yellow");
        
        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());
    }
}