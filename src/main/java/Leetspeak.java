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

    //cut off first letter of String
    //replace all s's with z's
    //return new string and add first character back to the start of the string


      String str = "Susie Sunshine";
      str = str.substring (0);

    if(word.contains("s"))  {
      word = word.replace("s", "z");
    }
     return word;
   }
  }


// git init
// git config user.name 'your name'
// git config user.email your@email.com
// git add .
// git commit -m "your message"
// git remote add origin http://....
// git push origin master
