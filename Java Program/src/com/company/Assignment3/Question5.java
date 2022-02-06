package com.company.Assignment3;

import java.util.Scanner;

public class Question5 {
        public static void main(String[] args){
            // generating random number of 2 digit
            int random_number = (int)(Math.random() * 100);
            //prompt for taking guess number by user
            Scanner input = new Scanner(System.in);
            System.out.print("Enter 2 digit number: ");
            int guess_number = input.nextInt();
            // separating digits from random number
            int random_number_digit1 = random_number / 10 ;
            int random_number_digit2 = random_number % 10 ;
            //separating digits guess number
            int guess_number_digit1 = guess_number / 10 ;
            int guess_number_digit2 = guess_number % 10 ;
            //conditions
            boolean exact_match =   random_number == guess_number;
            boolean match_all_digits =   random_number_digit1 == guess_number_digit2 && random_number_digit2 == guess_number_digit1;
            boolean match_one_digit =   random_number_digit1 == guess_number_digit1 ||
                    random_number_digit1 == guess_number_digit2 ||
                    random_number_digit2 == guess_number_digit1 ||
                    random_number_digit2 == guess_number_digit2;
            //final condition to check and show result
            if (exact_match){
                System.out.println("Exact match: you win $25,000");
            }
            else if(match_all_digits){
                System.out.println("Match all digits: you win $15,000");
            }
            else if (match_one_digit){
                System.out.println("Match one digit: you win $5,000");
            }
            else {
                System.out.println("sorry, no match");
            }
        }
    }
