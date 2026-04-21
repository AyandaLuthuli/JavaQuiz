import java.util.Scanner;

public class QuestionService {
    
Question [] question=new Question[5];
String[] selection=new String[5];



public QuestionService() {
   question[0] = new Question(1, "Which language is commonly used to build desktop applications?", "Java", "HTML", "CSS", "SQL", "Java");
question[1] = new Question(2, "What is a software?", "A physical computer part", "A set of instructions that tells a computer what to do", "A type of keyboard", "A screen display", "A set of instructions that tells a computer what to do");
question[2] = new Question(3, "Which language is used for styling web pages?", "HTML", "JavaScript", "CSS", "Python", "CSS");
question[3] = new Question(4, "Which is a popular IDE for Java development?", "Visual Studio Code", "IntelliJ IDEA", "Node.js", "Git", "IntelliJ IDEA");
question[4] = new Question(5, "Which of these is a JavaScript runtime (not a language or IDE)?", "Java", "IntelliJ", "Node.js", "Python", "Node.js");
}




public void PlayQuiz() {

    int i=0;
for (Question q : question) {
    System.out.println("Question " + q.getId() + ": " + q.getQuestion());
    // System.out.println(q.getQuestion());
    System.out.println("1. " + q.getOpt1());
    System.out.println("2. " + q.getOpt2());
    System.out.println("3. " + q.getOpt3());
    System.out.println("4. " + q.getOpt4());
    Scanner scanner = new Scanner(System.in);
    selection [i++]=scanner.nextLine();
}

for (String s: selection)
    {System.out.println(s);}
}


public void printscore() {
    int score = 0;
    for (int i = 0; i < question.length; i++) {
        Question que = question[i];
        String actualanswer = que.getAnswer();
        String userAnswer = selection[i];  

        if (selection[i].equalsIgnoreCase(actualanswer)) {  
            score++;
        }
    }
    System.out.println("Your score is: " + score + "/" + question.length);
}

}