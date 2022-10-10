package org.example;

import com.google.gson.Gson;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonObjectFactory {

    public static List<JSONObject> createSampleJsonData(int entries, String outputDirectory) throws IOException, ParseException {
        List<JSONObject> arrayJsonObjects = new ArrayList();


        StudentsFactory studentsFactory = new StudentsFactory();

        List<StudentRecords> listOfStudentRecords = studentsFactory.createStudentRecords(entries);

        for(int i=0; i < listOfStudentRecords.size(); i++){

            JSONObject main = new JSONObject();
            JSONObject metadata = new JSONObject();

            //Inserting key-value pairs into the json object
            main.put("id", String.valueOf(i));

            metadata.put("firstName", listOfStudentRecords.get(i).getFirstName());
            metadata.put("middleName", listOfStudentRecords.get(i).getMiddleName());
            metadata.put("lastName", listOfStudentRecords.get(i).getLastName());
            metadata.put("city", listOfStudentRecords.get(i).getCity());
            main.put("Metadata", metadata);

            FileWriter file = new FileWriter(outputDirectory + "\\student-record-" + String.valueOf(i) + ".json");
            file.write(main.toJSONString());
            file.close();
        }



        return arrayJsonObjects;
    }
}
