import java.util.*;

public class StringUtils {
    String str;

    public StringUtils(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String must have characters");
        }

        this.str = str;
    }

    String reverseString() {
        StringBuilder reversedString = new StringBuilder();

        for (int index = str.length() - 1; index >= 0; index--) {
            var element = str.charAt(index);

            reversedString.append(element);
        }

        return reversedString.toString();
    }

    boolean isPalindrome() {
        var reversedStr = this.reverseString();
        return reversedStr.equals(str);
    }

    int countVowels() {
        var count = 0;
        var vowels = List.of("a", "e", "i", "o", "u");

        for (char element : str.toCharArray()) {
            var letter = Objects.toString(element).toLowerCase();

            if (vowels.contains(letter)) {
                count++;
            }
        }

        return count;
    }

    LinkedHashMap<String, Integer> getCharFrequency() {
        var frequencyMap = new LinkedHashMap<String, Integer>();

        for (char letter : str.toCharArray()) {
            var letterInLowerCase = String.valueOf(letter).toLowerCase();
            var currentFrequency = frequencyMap.get(letterInLowerCase);

            if (currentFrequency == null) frequencyMap.put(letterInLowerCase, 1);
            else frequencyMap.put(letterInLowerCase, currentFrequency + 1);
        }

        return frequencyMap;
    }

    String removeDuplicates() {
        var result = "";
        var charFrequency = new HashMap<Character, Integer>();

        for (char element : str.toCharArray()) {
            var convertedElement = String.valueOf(element).toLowerCase();

            if (charFrequency.get(element) == null) {
                charFrequency.put(element, 1);
                result = result.concat(convertedElement);
            }
        }

        return result;
    }

    String encodeString() {
        var result = "";

        for (int i = 0; i < str.length(); i++) {
            var letter = String.valueOf(str.charAt(i));
            var letterIsSpace = letter.equals(" ");

            result = result.concat(letterIsSpace ? "%20" : letter);
        }

        return result;
    }

    String findBiggestSubstringWithoutRepeatedCharacter() {
        int end;
        var start = 0;
        var biggestSubstring = "";
        var charIndexMapper = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            end = i + 1;
            var currentChar = str.charAt(i);
            var charIndex = charIndexMapper.get(currentChar);

            if (charIndex != null && charIndex >= start) {
                start = charIndex + 1;
            }

            charIndexMapper.put(currentChar, i);

            var currentSubstring = str.substring(start, end);

            if (currentSubstring.length() > biggestSubstring.length()) {
                biggestSubstring = currentSubstring;
            }
        }

        return  biggestSubstring;
    }
}
