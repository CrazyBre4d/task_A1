package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        try {
            FileReader reader = new FileReader("D:\\programs\\JAVA_LABS\\logins.csv");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // обработка каждой строки файла
                System.out.println(line + "\n");
            }

            bufferedReader.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader reader = new FileReader("D:\\programs\\JAVA_LABS\\postings.csv");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line1;
            while ((line1 = bufferedReader.readLine()) != null) {
                // обработка каждой строки файла
                System.out.println(line1 + "\n");
            }

            bufferedReader.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, Boolean> loginData = new HashMap<>();
        try {
            FileReader reader = new FileReader("D:\\programs\\JAVA_LABS\\logins.csv");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                String appAccountName = data[1];
                Boolean isActive = Boolean.valueOf(data[1]);
                loginData.put(appAccountName, isActive);
            }

            bufferedReader.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader reader = new FileReader("D:\\programs\\JAVA_LABS\\postings.csv");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                String userName = data[9];
                boolean authorized = loginData.containsKey(userName) && loginData.get(userName);
                // добавление булевого поля в данные из postings.csv
            }

            bufferedReader.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}