package task2;

public class Abbreviate {
  /**
   * Write covering tests + refactor code.
   * In this task you can simplify the signature. All usages in project are listed in Usages.java
   */

  public static String abbreviate(String str, int offset, int maxWidth) {
    return new Abbreviator(str, offset, maxWidth).abbreviate();
  }

  private static class Abbreviator {
    private String str;
    private int offset;
    private int maxWidth;

    public Abbreviator(String str, int offset, int maxWidth) {
      this.str = str;
      this.offset = offset;
      this.maxWidth = maxWidth;
    }

    public String abbreviate() {
      if(str == null) {
        return null;
      } else if(maxWidth < 4) {
        throw new IllegalArgumentException("Minimum abbreviation width is 4");
      } else if(str.length() <= maxWidth) {
        return str;
      }

      tryChangeOffset();

      if(offset <= 4) {
        return str.substring(0, maxWidth - 3) + "...";
      } else if(maxWidth < 7) {
        throw new IllegalArgumentException("Minimum abbreviation width with offset is 7");
      }

      return offset + (maxWidth - 3) < str.length() ?
              "..." + new Abbreviator(str.substring(offset), 0, maxWidth - 3).abbreviate() :
              "..." + str.substring(str.length() - (maxWidth - 3));
    }

    private void tryChangeOffset() {
      if(offset > str.length()) {
        offset = str.length();
      }
      if(str.length() - offset < maxWidth - 3) {
        offset = str.length() - (maxWidth - 3);
      }
    }
  }


}
