import java.util.Scanner;

public class upg1 {
    public static void main (String[] args) {
        System.out.println("Välkommen till quizet! Svara med SMÅ bokstäver för att få rätt svar!");
        String q1 = "Vad heter jag?\n"
                 + "A: Alex\n B: Bengt\n C: MEMESON\n";
        String q2 = "Är jag bäst?\n"
                + "A: Ja ofc\n B: Nej\n C: Ingen vet...";

        Question [] questions = {
                new Question(q1, "a"),
                new Question(q2, "c")
        };
        takeTest(questions);

    }

    public static void takeTest(Question [] questions) {
        int score = 0;
        Scanner sn = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String answer = sn.nextLine();
            if (answer.equals(questions[i].answer)) {
                score++;
            }
        }
        System.out.println("You got " + score + " out of a possible " + questions.length);
    }
}