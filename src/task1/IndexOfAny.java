package task1;

/**
 * Писал тесты к оригинальной логике:
 * Выдает индекс для совпадающего символа если следующий символ в массиве тоже совпадает со следующим символом в строке
 *
 */
public class IndexOfAny {
  /**
   * Write covering tests + refactor code.
   * In this task signature should stay the same
   */
  public static int indexOfAny(String str, char[] searchChars) {
    if(!str.isEmpty() && searchChars.length > 0) {
      int csLen = str.length();
      int csLast = csLen - 1;
      int searchLen = searchChars.length;
      int searchLast = searchLen - 1;

      for(int i = 0; i < csLen; ++i) {
        char ch = str.charAt(i);

        for(int j = 0; j < searchLen; ++j) {
          if(searchChars[j] == ch) {
            if(i == csLast || j == searchLast) {
              return i;
            }
            if(searchChars[j + 1] == str.charAt(i + 1)) {
              return i;
            }
          }
        }
      }
    }

    return -1;
  }
}
