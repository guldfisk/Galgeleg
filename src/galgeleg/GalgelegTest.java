package galgeleg;

import java.util.ArrayList;

public class GalgelegTest {

  public static void main(String[] args) {

    HangmanGame spil = new HangmanGame();
    ArrayList<String> words = new ArrayList<>();
    words.add("lol");
    spil.setPossibelWords(words);
    spil.reset();

    try {
      spil.hentOrdFraDr();
    } catch (Exception e) {
      e.printStackTrace();
    }
    spil.logStatus();

    spil.guessLetter('e');
    spil.logStatus();

    spil.guessLetter('a');
    spil.logStatus();
    System.out.println("" + spil.getAmountWrongGuesses());
    System.out.println("" + spil.getVisibleWord());
    if (spil.gameIsFinished()) return;

    spil.guessLetter('i');
    spil.logStatus();
    if (spil.gameIsFinished()) return;

    spil.guessLetter('s');
    spil.logStatus();
    if (spil.gameIsFinished()) return;

    spil.guessLetter('r');
    spil.logStatus();
    if (spil.gameIsFinished()) return;

    spil.guessLetter('l');
    spil.logStatus();
    if (spil.gameIsFinished()) return;

    spil.guessLetter('b');
    spil.logStatus();
    if (spil.gameIsFinished()) return;

    spil.guessLetter('o');
    spil.logStatus();
    if (spil.gameIsFinished()) return;

    spil.guessLetter('t');
    spil.logStatus();
    if (spil.gameIsFinished()) return;

    spil.guessLetter('n');
    spil.logStatus();
    if (spil.gameIsFinished()) return;

    spil.guessLetter('m');
    spil.logStatus();
    if (spil.gameIsFinished()) return;

    spil.guessLetter('y');
    spil.logStatus();
    if (spil.gameIsFinished()) return;

    spil.guessLetter('p');
    spil.logStatus();
    if (spil.gameIsFinished()) return;

    spil.guessLetter('g');
    spil.logStatus();
    if (spil.gameIsFinished()) return;
  }
}
