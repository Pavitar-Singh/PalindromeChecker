package org.sparta;

public class PalSecond implements PalInterface{
    @Override
    public boolean isPalindrome(String text) {
        String noSpaces = text.replaceAll("\\s+","").toLowerCase();
        for(int i = 0;i<noSpaces.length()/2; i++){
            if(noSpaces.charAt(i)!=noSpaces.charAt(noSpaces.length()-i-1)){return false;}
        }
        return true;
    }
}
