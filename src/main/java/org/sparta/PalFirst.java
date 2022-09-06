package org.sparta;

public class PalFirst implements PalInterface{

    @Override
    public boolean isPalindrome(String text) {
        String noSpaces = text.replaceAll("\\s+","").toLowerCase();
        int length = noSpaces.length();
        int front = 0;
        int back = length-1;

        while(back>front){
            char frontCharacter = noSpaces.charAt(front++);
            char backCharacter = noSpaces.charAt(back--);
            if(frontCharacter!=backCharacter){
                return false;
            }
        }
        return true;
    }
}
