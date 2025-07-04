package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImperativeStringPipeline {
    public static void main(String[] args) {

        // Given this list of sentences:
        List<String> sentences = Arrays.asList(
            "The fox jumps high",
            "The giraffe is tall",
            "The hippo is big and strong"
    );

        /*
           1 - Split each sentence into words
           2 - Convert each word to lowercase
           3 - Filter out words with 3 or fewer characters
           4 - Collect all remaining words into a single list
           5 - Print the list of words
        */
        List<String> words = new ArrayList<>();

        for (String sentence : sentences) {
            String[] splitWords = sentence.split(" ");
            for (String word : splitWords) {
                String lowerCaseWord = word.toLowerCase();
                if (lowerCaseWord.length() > 3) {
                    words.add(lowerCaseWord);
                }
            }
        }

        System.out.println(words);
        // Output: [jumps, high, giraffe, tall, hippo, strong]
    }
}
