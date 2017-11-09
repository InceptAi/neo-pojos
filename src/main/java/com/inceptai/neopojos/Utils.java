package com.inceptai.neopojos;

public class Utils {
    public static final String EMPTY_STRING = "";

    public static String sanitizeText(String input) {
        if (nullOrEmpty(input)) {
            return input;
        }
        //input = input.replaceAll("[^\\w\\s]","").trim().toLowerCase();
        input = input.replaceAll("[^\\w\\s.@]","").trim().toLowerCase();
        //Squash multiple consecutive white spaces
        input = input.replaceAll("\\s+"," ");
        return input;
    }

    public static boolean nullOrEmpty(String target) {
        return target == null || target.isEmpty() || target.equals("null");
    }
}
