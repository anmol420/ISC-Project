# ALGORITHM

- Step-1 :- START
- Step-2 :- Create a class named as `pallin`.
- Step-3 :- Create a method named as `isPallindrome` and pass a string named `word` as a parameter. In this function check whether the string is pallindrome or not.
- Step-4 :- Create a method named as `makePalindrome` and pass a string named `word` as a parameter. In this function, declare variables to store length and the last character of the string `word` in `len` and `lastChar` respectively. Using a StringBuffer class and a for-loop, append the string `word` to the StringBuffer object `sb` and then append the last character of the string `word` to the StringBuffer object `sb`. Then, return the StringBuffer object `sb` as a string.
- Step-5 :- Create a method named as `main`. In this function, using Scanner class take the input of the string `Str` as input. Then, call the method `isPallindrome` and pass the string `word` as a parameter. If the method returns `true`, then print the string `Str`. Then, call the method `makePalindrome` and pass the string `word` as a parameter. Then, print the string returned by the method `makePalindrome`.
- Step-6 :- END

# VD TABLE

| Sr. No. | Variable | Data Type | Description |
| --- | --- | --- | --- |
| 1 | Str | String | To store the input string |
| 2 | word | String | To store the words of the string |
| 3 | str | String | To store the string without front and back spaces |
| 4 | len | int | To store the length of the string |
| 5 | lastChar | char | To store the last character of the string |
| 6 | i | int | Used in for-loop |
| 7 | isPalindrome | boolean | To check whether the word is pallindrome or not |
| 8 | palin | boolean | To check whether the word is pallindrome or not |
| 9 | palinWord | String | To store the string returned by the method `makePalindrome` |
| 10 | convertedStr | String | To store the converted string |

# OUTPUT

<p align="center">
<img width="auto" height="auto" alt="output" src="output.png">
</p>

