package corejava.factorial;

public class FactorialByIteration {
    public long factorialOf(int i) throws FactorialProgramException {
        if (i < 0) {
            throw new FactorialProgramException("A number should be non negative for calculating its factorial");
        }

        long retVal = 1;
        for (int counter = 1; counter <= i; counter++) {
            retVal = retVal * counter;
        }
        return retVal;
    }
}
