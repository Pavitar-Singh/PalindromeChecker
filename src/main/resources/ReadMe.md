# Palindrome

### The process
The user is asked to enter a sentence to check for palindromes and to
choose which method with which to check if the words are palindromes.
The palindromes are then return.

### Checkers
There are three methods of checking for palindromes which are:
- A for loop
- A while loop
- A StringBuiilder

### Interface
There are 3 palindrome checkers named PalFirst, PalSecond
and PalThird that all implement the interface PalInterface.
The PalInterface has the code:
```java
public interface PalInterface {
    boolean isPalindrome(String text);
}
```
This code mean that all 3 palindrome checkers have a isPalindrome method.

### Tests

The class PalindromeCheckTest contains three methods which each test
a single palindrome checker class using assertions. The code looks
like below:

``` Java
    PalFirst first = new PalFirst();
    @Test
    @DisplayName("Check Pal Method 1")
    public void pal1(){
        Assertions.assertEquals(true, first.isPalindrome("racecar"));
        Assertions.assertEquals(false,first.isPalindrome("cloudy"));
        Assertions.assertEquals(true,first.isPalindrome("dOggoD"));
        Assertions.assertEquals(false,first.isPalindrome("ab"));
        Assertions.assertEquals(true,first.isPalindrome("a"));
        Assertions.assertEquals(false,first.isPalindrome("aab"));
        Assertions.assertEquals(true,first.isPalindrome("Mr. Owl ate my metal worm"));
    }
```