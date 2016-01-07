import org.junit.*;
import static org.junit.Assert.*;

public class LeetspeakTest {

  @Test
  public void toLeetSpeak_replaceEInAStringTo3_wordChanges() {
    Leetspeak leetspeak = new Leetspeak();
    assertEquals("tw33t", leetspeak.toLeetSpeak("tweet"));
  }

  @Test
  public void toLeetSpeak_replaceOInAStringTo0_wordChanges() {
    Leetspeak leetspeak = new Leetspeak();
    assertEquals("c00l", leetspeak.toLeetSpeak("cool"));
  }

  @Test
  public void toLeetSpeak_replaceUppercaseIInAStringTo1_wordChanges() {
    Leetspeak leetspeak = new Leetspeak();
    assertEquals("1ndia", leetspeak.toLeetSpeak("India"));
  }

  @Test
  public void     toLeetSpeak_replaceAllInstancesOfSInAStringToZ_wordChanges() {
    Leetspeak leetspeak = new Leetspeak();
    assertEquals("r0z3z ar3 r3d", leetspeak.toLeetSpeak("roses are red"));
  }

  @Test
  public void leetspeak_doesNotReplaceSWhenFirstLetter_wordChanges() {
    Leetspeak leetspeak = new Leetspeak();
  assertEquals("Suz13 Sunzh1n3", leetspeak.toLeetSpeak("Susie Sunshine"));
}

  // @Test
  // Public void Leetspeak_repalceEveryEInAStringWith3_changeword(){
  // LeetSpeak leetspeak = new LeetSpeak();
  // assertEquals("tw33t"), leetspeak.leetspeak("tweet"));

  }
