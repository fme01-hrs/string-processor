package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalStringPipeline {
    public static void main(String[] args) {

        // Given this list of sentences:
        List<String> sentences = Arrays.asList(
            "The fox jumps high",
            "The giraffe is tall",
            "The hippo is big and strong"
         );

        List<String> words = sentences.stream()
            .map(sentence -> sentence.split(" "))
            .flatMap(Arrays::stream)
            .map(String::toLowerCase)
            .filter(word -> word.length() > 3)
            .collect(Collectors.toList());

        System.out.println(words);
        // Output: [jumps, high, giraffe, tall, hippo, strong]
    }
}
