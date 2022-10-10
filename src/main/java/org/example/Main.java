package org.example;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of student records to be created: ");
        int noOfStudentRecords = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the full path of the output directory: ");
        String outputDirectory = scanner.nextLine();

        JsonObjectFactory jsonObjectFactory = new JsonObjectFactory();
        List<JSONObject> x = jsonObjectFactory.createSampleJsonData(noOfStudentRecords, outputDirectory);

    }
}