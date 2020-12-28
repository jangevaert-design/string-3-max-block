public class MaxBlock {
/*

Given a string, return the length of the largest "block" in the string.
A block is a run of adjacent chars that are the same.
 */

  public static void main(String[] args) {
    MaxBlock newMaxBlock = new MaxBlock();
    String str = "abbbcbbbxbbbx";
    System.out.printf("\nthe largest block in String %s is " + newMaxBlock.maxBlock(str) + "\n", str);
  }
  public int maxBlock(String str) {
    int count = 0;
    int temp = 1;

    for (int i = 0; i < str.length(); i++) {
      if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
        temp++;
      } else {
        temp = 1;
      }
      if (temp > count) {
        count = temp;
      }
    }
    return count;
  }
}
