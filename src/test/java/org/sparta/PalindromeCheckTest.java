package org.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckTest {
    PalFirst first = new PalFirst();
    PalSecond second = new PalSecond();
    PalThird third = new PalThird();

    @Test
    @DisplayName("Check Pal Method 1")
    public void pal1(){
        Assertions.assertEquals(true, first.isPalindrome("racecar"));
        Assertions.assertEquals(false,first.isPalindrome("cloudy"));
        Assertions.assertEquals(true,first.isPalindrome("doGgoD"));
        Assertions.assertEquals(false,first.isPalindrome("ab"));
        Assertions.assertEquals(true,first.isPalindrome("a"));
        Assertions.assertEquals(false,first.isPalindrome("aab"));
        Assertions.assertEquals(false,first.isPalindrome("Mr. Owl ate my metal worm"));
    }

    @Test
    @DisplayName("Check Pal Method 2")
    public void pal2(){
        Assertions.assertEquals(true,second.isPalindrome("racecar"));
        Assertions.assertEquals(false,second.isPalindrome("cloudy"));
        Assertions.assertEquals(true,second.isPalindrome("doGgoD"));
        Assertions.assertEquals(false,second.isPalindrome("ab"));
        Assertions.assertEquals(true,second.isPalindrome("a"));
        Assertions.assertEquals(false,second.isPalindrome("aab"));
        Assertions.assertEquals(false,second.isPalindrome("Mr. Owl ate my metal worm"));
    }

    @Test
    @DisplayName("Check Pal Method 3")
    public void pal3(){
        Assertions.assertEquals(true,third.isPalindrome("racecar"));
        Assertions.assertEquals(false,third.isPalindrome("cloudy"));
        Assertions.assertEquals(true,third.isPalindrome("doGgoD"));
        Assertions.assertEquals(false,third.isPalindrome("ab"));
        Assertions.assertEquals(true,third.isPalindrome("a"));
        Assertions.assertEquals(false,third.isPalindrome("aab"));
        Assertions.assertEquals(false,third.isPalindrome("Mr. Owl ate my metal worm"));
    }

}