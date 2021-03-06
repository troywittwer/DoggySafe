import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import javax.swing.*;

/**
 * This program is designed to win me some doggo's from the safe event.
 *
 * @author Asus1
 */
public class DoggySafe {

  /**
   * @param args the command line arguments
   */

  public static void main(String[] args) throws AWTException {

    /**
     * This section can be commented out if not being used. It creates a JFrame mimicing the safe
     * numpad in the game. It needs to overlay the same location as in-game. This was being used
     * when I was performing safe combinations entirely with mouse-inputs from the Robot class, but
     * it turns out key inputs require one less step.
     */
    //doggoFrame doggo = new doggoFrame();
    //doggo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //doggo.setVisible(true);

    //System.out.println("Mouse info: " + MouseInfo.getPointerInfo().getLocation());
    Scanner in = new Scanner(System.in);
    Robot safeBot = new Robot();
    safeBot.setAutoDelay(1);

    /**
     * the password just determines which version of the loop will be used. If you supply the
     * correct password, it will run the version that allows as many attempts as possible within 30 seconds.
     */
    System.out.print("Please enter the password: ");
    String userPassword = in.nextLine();

    /**
     * Move the mouse pointer to the side of the screen containing either Notepad (for testing)
     * or the Nox emulator playing MapleStory M. After mouse has been moved, the Robot object will
     * perform a left-click press and release to make sure any future inputs performed by the
     * Robot object will be recognized as inputs within the emulator.
     */
    int msmButton = InputEvent.BUTTON1_DOWN_MASK;
    Coordinates bEnter = new Coordinates(1788, 849); // coords within testing application

    safeBot.mouseMove(bEnter.x(), bEnter.y());
    safeBot.mousePress(msmButton);
    safeBot.mouseRelease(msmButton);

    /**
     * This random object is used to create a random series of four numbers for the combination
     * attempt. It is possible for the combination to contain duplicates, which is why I created an
     * ArrayList object to store a copy of all attempts made. Once the loop is finished running, a
     * Set object is created which uses the ArrayList as an argument when initializing to determine
     * just how many duplicates were created.
     */
    Random rando = new Random();
    ArrayList<String> randomValues = new ArrayList<String>();

    /**
     * This combos variable is only used if I'm willing to stay within my 6,000 - 6,999 range
     * (this range was assigned by my guild, but no one would know if I'm following it, anyway).
     */
    int combos = 1; //

    long t = System.currentTimeMillis();
    long end = t + 30000; // three zeros are required since time is told in milliseconds

    /**
     *
     */

    /**
     * This section is for the 3 golden richie figurines. Requires correct
     * password input.
     *
     * The loop performs 5 button inputs: four numbers and one enter button.
     *
     * My random object chooses an integer between 0 - 9, that value is stored in the String
     * object (which is stored in the ArrayList at the end of the loop iteration), then 96 is
     * added to the integer storing the random integer. 96 is added because the KeyEvent for
     * VK_NUMPAD0 happens to be 96. KeyEvent.VK_NUMPAD0 - KeyEvent.VK_NUMPAD9 would then become
     * 96 - 105.
     */
    if (userPassword.equalsIgnoreCase("Doggydoodle")) {
      int digit1, digit2, digit3, digit4;

      while (System.currentTimeMillis() < end) {
        // Comment out this line unless testing.
        //printAttemptNumber(combos);

        String currentNum = Integer.toString(combos); // Stored in ArrayList for duplicate checking

        // Thousands
        digit1 = rando.nextInt(10);
        currentNum += Integer.toString(digit1);
        digit1 += 96; // gives a value representative of the numpad
        safeBot.keyPress(digit1);
        safeBot.keyRelease(digit1);

        // Hundreds
        digit2 = rando.nextInt(10);
        currentNum += Integer.toString(digit2);
        digit2 += 96;
        safeBot.keyPress(digit2);
        safeBot.keyRelease(digit2);

        // Tens
        digit3 = rando.nextInt(10);
        currentNum += Integer.toString(digit3);
        digit3 += 96;
        safeBot.keyPress(digit3);
        safeBot.keyRelease(digit3);

        // Ones
        digit4 = rando.nextInt(10);
        currentNum += Integer.toString(digit4);
        digit4 += 96;
        safeBot.keyPress(digit4);
        safeBot.keyRelease(digit4);

        // Enter button
        safeBot.keyPress(KeyEvent.VK_ENTER);
        safeBot.keyRelease(KeyEvent.VK_ENTER);

        // Because the Enter key requires communication with the server to check whether an attempt
        // was correct or not, a delay is required to make sure keys are not entered during the
        // confirmation process.

        safeBot.delay(10);

        randomValues.add(currentNum);
        combos++;
      }
      //printMessage("STOP");

      //System.out.println("While loop finished");
    }
    // This section is for wooden richie figurines. Type the incorrect
    // password to activate this section and make sure the for loop has the
    // correct amount of iterations.
    else {
      int digit1, digit2, digit3, digit4;

      for (int i = 0; i < 3; i++) {
        String currentNum = Integer.toString(combos); // used to determine any repeats

        // Thousands
        digit1 = rando.nextInt(10);
        currentNum += Integer.toString(digit1);
        digit1 += 96; // gives a value representative of the numpad
        safeBot.keyPress(digit1);
        safeBot.keyRelease(digit1);

        // Hundreds
        digit2 = rando.nextInt(10);
        currentNum += Integer.toString(digit2);
        digit2 += 96;
        safeBot.keyPress(digit2);
        safeBot.keyRelease(digit2);

        // Tens
        digit3 = rando.nextInt(10);
        currentNum += Integer.toString(digit3);
        digit3 += 96;
        safeBot.keyPress(digit3);
        safeBot.keyRelease(digit3);

        // Ones
        digit4 = rando.nextInt(10);
        currentNum += Integer.toString(digit4);
        digit4 += 96;
        safeBot.keyPress(digit4);
        safeBot.keyRelease(digit4);

        // Enter button
        safeBot.keyPress(KeyEvent.VK_ENTER);
        safeBot.keyRelease(KeyEvent.VK_ENTER);

        safeBot.delay(100);

        randomValues.add(currentNum);
        combos--;
      }
    }


       /*
        //for (int digit1 = 0; digit1 < 1; digit1++){
            for (int digit2 = 0; digit2 < 10; digit2++){
                for (int digit3 = 0; digit3 < 10; digit3++){
                    for (int digit4 = 0; digit4 < 10; digit4++){

                        // These four objects represent which key will be
                        // pressed for each of the four numbers.
                        doggoKey puppers1 = new doggoKey(digit1);
                        doggoKey puppers2 = new doggoKey(digit2);
                        doggoKey puppers3 = new doggoKey(digit3);
                        doggoKey puppers4 = new doggoKey(digit4);

                        // Thousands Place
                        safeBot.keyPress(puppers1.getKeyValue());
                        safeBot.keyRelease(puppers1.getKeyValue());

                        // Hundreds Place
                        safeBot.keyPress(puppers2.getKeyValue());
                        safeBot.keyRelease(puppers2.getKeyValue());

                        // Tens Place
                        safeBot.keyPress(puppers3.getKeyValue());
                        safeBot.keyRelease(puppers3.getKeyValue());

                        // Ones Place
                        safeBot.keyPress(puppers4.getKeyValue());
                        safeBot.keyRelease(puppers4.getKeyValue());

                        // Enter button
                        safeBot.keyPress(KeyEvent.VK_ENTER);
                        safeBot.keyRelease(KeyEvent.VK_ENTER);

                        combos++;

                    }// end of ones
                }// end of tens
            }// end of hundreds
        //}// end of thousands
        */

    Set<String> repeatFinder = new HashSet<String>(randomValues);

    if (repeatFinder.size() < randomValues.size()) {
      System.out.println("There are " + (randomValues.size() -
          repeatFinder.size()) + " repeats.");
    }

    System.out.println(randomValues.size() + " combinations were entered.\n"
        + repeatFinder.size() + " unique combinations were entered.");

    in.close();
  }

  /**
   * This method is designed to troubleshoot the strange output during a test run with no auto delay
   * @param message a string message passed as an argument to print to the screen
   * @throws AWTException
   */
  public static void printMessage(String message)throws AWTException{
    Robot messagePrinter = new Robot();

    // This for loop prints the actual message
    for (int i = 0; i < message.length(); i++){
      // charAt(i) returns a char value, which can be cast as an int). VK_* stores letters according
      // to their ASCII value.
      messagePrinter.keyPress(message.charAt(i));
      messagePrinter.keyRelease(message.charAt(i));
    }
    // This for loop prints a series of enter key strokes to make it easier to spot the message
    for (int i = 0; i < 10; i++){
      messagePrinter.keyPress(KeyEvent.VK_ENTER);
      messagePrinter.keyRelease(KeyEvent.VK_ENTER);
    }
  }

  /**
   * This method is designed to provide line numbers in the Notepad document during testing.
   * @param attemptNum
   * @throws AWTException
   */
  public static void printAttemptNumber(int attemptNum) throws AWTException{
    Robot attemptBot = new Robot();

    String attemptString = Integer.toString(attemptNum);
    int[] attemptDigits = new int[attemptString.length()];

    // This loop prints allows the Robot object to print the line number.
    for (int i = 0; i < attemptString.length(); i++){
      attemptDigits[i] = Integer.parseInt(attemptString.substring(i, i+1));
      attemptDigits[i] += 96;

      attemptBot.keyPress(attemptDigits[i]);
      attemptBot.keyRelease(attemptDigits[i]);
    }
    // prints " " to deliniate the line number and actual combination attempt.
    attemptBot.keyPress(KeyEvent.VK_SPACE);
    attemptBot.keyRelease(KeyEvent.VK_SPACE);
  }
}
