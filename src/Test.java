package test;

/**
 Tests for code
 @author seburoh
 */

public class Test {

    /** Amount of tests ran.*/
    private static int counter = 0;
    /** Amount of tests ran.*/
    private static int testsFailed = 0;

    /** test.Test fail string.*/
    private static final String FAIL_STR = ": FISSION MAILED: ";
    /** Line starter for failed test: expected.*/
    private static final String EXPECT_STR = "    Expect: ";
    /** Line starter for failed test: actual.*/
    private static final String ACTUAL_STR = "    Actual: ";

    /** Timer duration.*/
    private static long startTime;
    /** Timer duration.*/
    private static long endTime;

    public static void startTimer() {
        startTime = System.currentTimeMillis();
    }

    public static void endTimer() {
        endTime = System.currentTimeMillis();
    }

    public static long getDuration() {
        return endTime - startTime;
    }

    /** Formats counter for nice printing. */
    private static String count() {
        String result = String.valueOf(counter);
        if (counter < 10) {
            result = "0" + result;
        }
        return result;
    }

    /** Quick info for when testing is complete.*/
    public static void testResults() {
        System.out.println("\nTests Passed: " + (counter - testsFailed) + " / " + counter);
    }

    /** Default test fail message. */
    private static void failPrint(String msg) {
        System.out.println(count() + FAIL_STR + msg);
        testsFailed++;
    }

    /** Tests below.*/

    public static void eqNull(Object obj, String message) {
        counter++;
        if (obj == null) {
            System.out.println(count() + ": Passed Null");
        } else {
            failPrint(message);
        }
    }

    public static void eqTrue(boolean bool, String message) {
        counter++;
        if (bool) {
            System.out.println(count() + ": Passed True");
        } else {
            failPrint(message);
        }
    }

    public static void eqFalse(boolean bool, String message) {
        counter++;
        if (!bool) {
            System.out.println(count() + ": Passed Flase");
        } else {
            failPrint(message);
        }
    }

    public static void eqObject(Object expected, Object actual, String message) {
        counter++;
        if (expected.equals(actual)) {
            System.out.println(count() + ": Passed Object");
        } else {
            failPrint(message);
            System.out.println(EXPECT_STR + expected);
            System.out.println(ACTUAL_STR + actual);
        }
    }

    public static void eqInt(int expected, int actual, String message) {
        counter++;
        if (expected == actual) {
            System.out.println(count() + ": Passed Int");
        } else {
            failPrint(message);
            System.out.println(EXPECT_STR + expected);
            System.out.println(ACTUAL_STR + actual);
        }
    }

}
