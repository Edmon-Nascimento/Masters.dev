package objects;

import java.util.Scanner;

public class RectangleAreaCalculator2 {

    private Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {
        RectangleAreaCalculator2 calculator = new RectangleAreaCalculator2();
        Rectangle room = calculator.getRoom();

        double area = calculator.calculateAreaOfRoom(room);
        System.out.println("The area of the room is " + area);

    }

    public Rectangle getRoom(){
        System.out.println("Enter the length of the room");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the room");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public  double calculateAreaOfRoom(Rectangle room){
        return room.calculateArea();
    }



}
