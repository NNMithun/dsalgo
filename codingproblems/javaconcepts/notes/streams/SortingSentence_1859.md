Certainly! Let's use a simple example to illustrate each step of the provided code. Consider the shuffled sentence "sentence4 a3 is2 This1".

```java
String shuffledSentence = "sentence4 a3 is2 This1";
String[] words = shuffledSentence.split(" ");

Arrays.stream(words)
    .map(word -> new String[]{word.substring(0, word.length() - 1), word.substring(word.length() - 1)})
    .sorted(Comparator.comparing(wordWithIndex -> Integer.parseInt(wordWithIndex[1])))
    .map(wordWithIndex -> wordWithIndex[0])
    .collect(Collectors.joining(" "));
```

1. **`Arrays.stream(words)`**:
   - Input: `["sentence4", "a3", "is2", "This1"]`

2. **`.map(word -> new String[]{word.substring(0, word.length() - 1), word.substring(word.length() - 1)})`**:
   - Transformation: For each word, create an array with two elements - the word without its last character and the last character.
   - Output: `[["sentence", "4"], ["a", "3"], ["is", "2"], ["This", "1"]]`

3. **`.sorted(Comparator.comparing(wordWithIndex -> Integer.parseInt(wordWithIndex[1])))`**:
   - Sorting: Sort the arrays based on the second element (index) converted to an integer.
   - Output: `[["This", "1"], ["a", "3"], ["is", "2"], ["sentence", "4"]]`

4. **`.map(wordWithIndex -> wordWithIndex[0])`**:
   - Transformation: For each array, select the first element (the original word).
   - Output: `["This", "a", "is", "sentence"]`

5. **`.collect(Collectors.joining(" "))`**:
   - Joining: Concatenate the words into a single string with a space as a delimiter.
   - Output: `"This a is sentence"`

Each step of the code is applied to transform the input shuffled sentence into the original sentence "This a is sentence". The array `["This", "a", "is", "sentence"]` is just an intermediate representation, and the final result is the joined string "This a is sentence".