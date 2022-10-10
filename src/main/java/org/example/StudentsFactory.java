package org.example;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentsFactory {


    public List<StudentRecords> createStudentRecords(int number) throws IOException, ParseException {
        List<StudentRecords> listSampleStudents = new ArrayList<>();

        JSONParser jsonParser = new JSONParser();

        FileReader firstNames = new FileReader("names-data-json\\first-names.json");
        FileReader middleNames = new FileReader("names-data-json\\middle-names.json");
        FileReader lastNames = new FileReader("names-data-json\\names.json");
        FileReader city = new FileReader("names-data-json\\places.json");

        Object objFirstNames = jsonParser.parse(firstNames);
        Object objMiddleNames = jsonParser.parse(middleNames);
        Object objLastNames = jsonParser.parse(lastNames);
        Object objCity = jsonParser.parse(city);

        JSONArray firstNamesList = (JSONArray) objFirstNames;
        JSONArray middleNamesList = (JSONArray) objMiddleNames;
        JSONArray lastNamesList = (JSONArray) objLastNames;
        JSONArray cityList = (JSONArray) objCity;

        for(int i = 0; i < number; i++){
            StudentRecords student = new StudentRecords();
            student.setFirstName(firstNamesList.get(i).toString());
            student.setMiddleName(middleNamesList.get(i).toString());
            student.setLastName(lastNamesList.get(i).toString());
            student.setCity(cityList.get(i).toString());

            listSampleStudents.add(student);
        }

        return listSampleStudents;
    }
}
