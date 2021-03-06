// package CS.Week_5

import javax.swing.JOptionPane;

public class MultipleChoiceQuestionWeekFive extends QuestionWeekFive {
    public MultipleChoiceQuestionWeekFive(String query, String a, String b, String c, String d, String e, String answer) {
        question = query + "\n";
        question += "A. " + a + "\n";
        question += "B. " + b + "\n";
        question += "C. " + c + "\n";
        question += "D. " + d + "\n";
        question += "E. " + e + "\n";

        correctAnswer = answer;
        correctAnswer = correctAnswer.toUpperCase();
    }

    String ask() {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
            if (answer.equals("A")) {
                return answer;
            } else if (answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
                return answer;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer please enter A, B, C, D, or E");
            }

        }

    }
}
