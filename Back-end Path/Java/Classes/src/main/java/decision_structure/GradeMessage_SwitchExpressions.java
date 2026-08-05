package decision_structure;

import java.util.Scanner;

public class GradeMessage_SwitchExpressions {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What was your grade? ");
        String grade = sc.next();

        String message = switch (grade) {
            case "A", "B" ->"You are the first grade.";
            //case "B" ->"You are the second grade.";
            case "C" -> {
                System.out.println("print");
                yield "You are the third grade.";
            }
            case "D" ->"You are the fourth grade.";
            case "E" ->"You are the fifth grade.";
            default ->"None grade detected";
        };



        sc.close();
    }
}
