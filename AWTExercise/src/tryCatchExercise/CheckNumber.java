package tryCatchExercise;

public class CheckNumber {
    int num;

    public void checkNumber(int num) throws OddError {
        this.num = num;
        if (num % 2 != 0) {
            throw new OddError();
        }
        System.out.println("The number is even: " + num);
    }

    public class OddError extends Exception {
        public OddError() {
            super("Error! Number can't be odd.");
        }
    }
}
