package com.example.quizapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> javaQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList("Number of primitive data types in Java are?",
                "6", "7", "8", "9", "8", "");


        final QuestionsList question2 = new QuestionsList("Which of the following option leads to the portability and security of Java?",
                "Bytecode is executed by JVM", "The applet makes the Java code secure and portable",
                "Use of exception handling", "Dynamic binding between objects",
                "Bytecode is executed by JVM", "");


        final QuestionsList question3 = new QuestionsList("Which of the following is not a Java features?",
                "Dynamic", "Architecture Neutral", "Use of pointers", "Object-oriented", "Use of pointers", "");

        final QuestionsList question4 = new QuestionsList("he \\u0021 article referred to as a",
                "Unicode escape sequence", "Octal escape", "Hexadecimal",
                "Line feed", "Unicode escape sequence",  "");

        final QuestionsList question5 = new QuestionsList("_____ is used to find and fix bugs in the Java programs.",
                "JVM", "JRE", "JDK",
                "JDB", "JDB",  "");

        final QuestionsList question6 = new QuestionsList(" Which of the following is a valid declaration of a char?",
                "char ch = '\\utea';", "char ca = 'tea';", "char cr = \\u0223;",
                "char cc = '\\itea';", "char ch = '\\utea';",  "");



        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;


    }



    private static List<QuestionsList> phpQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Number of primitive data types in Java are?",
                "6", "7", "8", "9", "8","");

        final QuestionsList question2 = new QuestionsList("Number of primitive data types in Java are?",
                "6", "7", "8", "9", "8", "");

        final QuestionsList question3 = new QuestionsList("Number of primitive data types in Java are?",
                "6", "7", "8", "9", "8", "");

        final QuestionsList question4 = new QuestionsList("Number of primitive data types in Java are?",
                "6", "7", "8", "9", "8", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);

        return questionsLists;

    }


    private static List<QuestionsList> htmlQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();
        final QuestionsList question1 = new QuestionsList("Number of primitive data types in Java are?",
                "6", "7", "8", "9", "8", "");

        final QuestionsList question2 = new QuestionsList("Number of primitive data types in Java are?",
                "6", "7", "8", "9", "8", "");

        final QuestionsList question3 = new QuestionsList("Number of primitive data types in Java are?",
                "6", "7", "8", "9", "8", "");

        final QuestionsList question4 = new QuestionsList("Number of primitive data types in Java are?",
                "6", "7", "8", "9", "8", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);

        return questionsLists;

    }




    private static List<QuestionsList> pythonQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();
        final QuestionsList question1 = new QuestionsList("Number of primitive data types in Java are?",
                "6", "7", "8", "9", "8", "");;

        final QuestionsList question2 = new QuestionsList("Number of primitive data types in Java are?",
                "6", "7", "8", "9", "8", "");

        final QuestionsList question3 = new QuestionsList("Number of primitive data types in Java are?",
                "6", "7", "8", "9", "8", "");

        final QuestionsList question4 = new QuestionsList("Number of primitive data types in Java are?",
                "6", "7", "8", "9", "8", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);

        return questionsLists;

    }


        public  static List<QuestionsList>getQuestions(String selectedTopicName){

        switch (selectedTopicName) {
            case "java":
                return javaQuestions();

            case "php":
                return phpQuestions();

            case "html":
                return htmlQuestions();

            default:
                return pythonQuestions();
        }

    }
}
