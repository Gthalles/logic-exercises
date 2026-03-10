import java.util.*;

public class StringUtils {
    String reverseString(String str) {
        StringBuilder reversedString = new StringBuilder();

        for (int index = str.length() - 1; index >= 0; index--) {
            var element = str.charAt(index);

            reversedString.append(element);
        }

        return reversedString.toString();
    }

    boolean isPalindrome(String str) {
        var reversedStr = this.reverseString(str);
        return reversedStr.equals(str);
    }

    int countVowels(String str) {
        var count = 0;
        var vowels = List.of("a", "e", "i", "o", "u");

        for (char element : str.toCharArray()) {
            var letter = Objects.toString(element);

            if (vowels.contains(letter)) {
                count++;
            }
        }

        return count;
    }

    LinkedHashMap<Character, Integer> getCharFrequency(String str) {
        var frequencyMap = new LinkedHashMap<Character, Integer>();

        for (char element : str.toCharArray()) {
            var currentFrequency = frequencyMap.get(element);

            if (currentFrequency == null) frequencyMap.put(element, 1);
            else frequencyMap.put(element, currentFrequency + 1);
        }

        return frequencyMap;
    }

    String removeDuplicates(String str) {
        var result = "";
        var charFrequency = new HashMap<Character, Integer>();

        for (char element : str.toCharArray()) {
            var convertedElement = String.valueOf(element);

            if (charFrequency.get(element) == null) {
                charFrequency.put(element, 1);
                result = result.concat(convertedElement);
            }
        }

        return result;
    }

    boolean isAnagram(String str) {
        var reversedString = "";
        var startIndex = str.length() - 1;

        for (int i = startIndex; i >= 0; i--) {
            var letterString = String.valueOf(str.charAt(i));
            reversedString = reversedString.concat(letterString);
        }

        return Objects.equals(str, reversedString);
    }

    String encodeString(String str) {
        var result = "";

        for (int i = 0; i < str.length(); i++) {
            var letter = String.valueOf(str.charAt(i));
            var letterIsSpace = letter.equals(" ");

            result = result.concat(letterIsSpace ? "%20" : letter);
        }

        return result;
    }

    String findBiggestSubstringWithoutRepeatedCharacter(String str) {
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
