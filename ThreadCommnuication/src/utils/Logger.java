package utils;

public class Logger{

    public static void log(String message){
        System.out.println("[INFO:]"+ message);
    }

    public static void error(String error){
        System.out.println("[ERROR]"+ error);
    }
}