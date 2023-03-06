package org.example.others;

public class Strings {

    public static boolean isSubstring(String primary, String sample) {

        if(sample == null
                || sample.length() > primary.length())
            return false;

        if(sample.isEmpty())
            return true;

        int matches = 0;
        char[] dataChars = primary.toCharArray();
        char[] sampleChars = sample.toCharArray();
        for(int i = 0; i < primary.length(); i++) {

            if(dataChars[i] == sampleChars[matches]) {
                matches++;
            } else {
                matches = 0;
            }

            if(matches == sampleChars.length)
                return true;

        }

        return false;

    }

    public static boolean isPalindrome(String primary) {

        if(primary == null)
            return false;

        if(primary.isBlank())
            return true;

        int length = primary.length();
        char[] primaryChars = primary.toCharArray();
        for(int i = 0, j = length-1; i < length; i++, j--) {
            if(primaryChars[i] != primaryChars[j])
                return false;
        }

        return true;
    }

}
