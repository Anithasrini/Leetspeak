public class Leetspeak {
  public static void main(String[] args) {
    // // String word = toLeetSpeak("summerIo");
    // System.out.println(word);
  }

  public static String toLeetSpeak(String word) {
    //
    // "summer is awesome"
    // word.charAt(0)
    // String newWord;

    if(word.contains("e")) {
      word = word.replace("e", "3");
    }
    if (word.contains("o")) {
      word = word.replace("o", "0");
    }
    if(word.contains("I")) {
      word = word.replace("I", "1");
    }
    //
    if(word.contains("s")) {
      word = word.replace("s", "z");
    }

    return word;
  }
}
