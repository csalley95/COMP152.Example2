// 1. Create a list by reading those 20 fortunes from your file
// 2. Ask the user how many fortunes he/she wants to see.
//      store the value in a variable
// 3. Inside of a loop (loop as many times as the user asked)
//      select a random answer from your list of fortunes
//      wait for the user to press the enter key (the easy way is to use the Scanner's nextLine method)
// Christopher Salley
// COMP 152

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class FortuneCookie2 {
    public static void main(String[] args) throws IOException {
        String all_fortunes, path;
        String fortune_list[];

        path = "Fortune.txt";
        Random ran = new Random();
        int quote = ran.nextInt(19);
        all_fortunes = Files.readString(Paths.get(path));
        fortune_list = all_fortunes.split("\n");
        Scanner reader = new Scanner(System.in);
        System.out.print("How many fortunes would you like to see?:\n");
        int fortune = reader.nextInt();

        for (int i = 0; i < fortune; i++) {
            reader.nextLine();
            System.out.println(fortune_list[quote + i]);

        }
    }
}