package org.sparta;

public class PalThird implements PalInterface{
    @Override
    public boolean isPalindrome(String text) {
        String noSpaces = text.replaceAll("\\s+","").toLowerCase();
        StringBuilder reverse = new StringBuilder(noSpaces);
        return noSpaces.equals(reverse.reverse().toString());
    }
}
