package com.yo1000.sonarqube.collaboration;

/**
 * Created by yo1000 on 2016/07/10.
 */
public class Application {
    public static void main(String[] args) {
        if (true) {
            if (false) {
                int a = 1;
                return;
            }
            // TODO: Do nothing
        }

        FizzBuzz fizzBuzz = new FizzBuzz();

        for (int i = 1; i <= 20; i++) {
            System.out.println(fizzBuzz.fizzBuzz(i));
        }
    }
}
