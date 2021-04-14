package Lesson06.online;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson6 {



    public static void main(String[] args) {

        String nameOurFile = "TestFile01.txt";
        String file1data="adsasd akjd akjd kasdj kajds kasj kasdj kasd jkasd jkasd jkas jdkasj dkaj sdkas jdkaj sdkajs dkaj" +
                "kjhkj sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss" +
                "asdasssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss";
        String file2data="bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb" +
                "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc" +
                "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss";



        writeToFile("file1.txt",file1data);
        writeToFile("file2.txt",file2data);
        StringBuilder res=new StringBuilder();
        String data1=readFile("C:\\Users\\Keytz\\IdeaProjects\\stream17032021\\file1.txt");
        String data2=readFile("C:\\Users\\Keytz\\IdeaProjects\\stream17032021\\file2.txt");
        res.append(data1);
        res.append(data2);
        writeToFile("file3",res.toString());


    }

    private static void writeToFile(String nameFile,String fileData) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(nameFile, true);
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.print(fileData);
            printStream.flush();
            printStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("ERROR: File not found");
        } catch (IOException exception) {
            System.out.println("ERROR: IOException");
        }
    }

    private static String readFile(String filePath)
    {
        String content = "";

        try
        {
            content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return content;
    }

}

/*
1.	Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);
2.	Написать метод, «склеивающий» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
3.	* Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
4.  ** Написать метод, проверяющий, есть ли указанное слово в папке
*/
