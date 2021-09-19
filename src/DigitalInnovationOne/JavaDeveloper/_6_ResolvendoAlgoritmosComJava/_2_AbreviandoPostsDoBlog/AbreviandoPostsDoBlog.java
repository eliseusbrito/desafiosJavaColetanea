package DigitalInnovationOne.JavaDeveloper._6_ResolvendoAlgoritmosComJava._2_AbreviandoPostsDoBlog;

import java.util.Scanner;

public class AbreviandoPostsDoBlog {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String line = scan.nextLine()
                    .trim()
                    .toLowerCase()
                    .replaceAll("\n", " ")
                    .replaceAll("\t", " ");

            while (!line.equals(".")) {
                String[] wordsToReplace = new String[26];
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.length() <= 2) continue;
                    int charIndex = word.charAt(0) - 'a';
                    if (wordsToReplace[charIndex] == null || newWordIsBetter(wordsToReplace[charIndex], word, line)
                    )
                        wordsToReplace[charIndex] = word;
                }
                int N = 0;
                for (int i = 0; i < wordsToReplace.length; i++) {
                    if (wordsToReplace[i] == null) continue;
                    N++;
                    line = line.replaceAll("\\b" + wordsToReplace[i] + "\\b", (char) ('a' + i) + ".");
                }
                System.out.println(line);
                System.out.println(N);
                for (int i = 0; i < wordsToReplace.length; i++) {
                    if (wordsToReplace[i] == null) continue;
                    System.out.println(String.format("%c. = %s", 'a' + i, wordsToReplace[i]));
                }
                line = scan.nextLine()
                        .trim()
                        .toLowerCase()
                        .replaceAll("\n", " ")
                        .replaceAll("\t", " ");
            }
        }
    }

    public static boolean newWordIsBetter(String current, String newWord, String line) {
        return (
                line.replaceAll("\\b" + newWord + "\\b", "-.").length()
                        < line.replaceAll("\\b" + current + "\\b", "-.").length()
        );
    }

}


