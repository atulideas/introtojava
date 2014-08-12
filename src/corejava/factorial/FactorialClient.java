package corejava.factorial;

public class FactorialClient {

    public static void main(String[] args) {
        int number = 4;
        long factorial = 0;
        FactorialByIteration factorialByIteration = new FactorialByIteration();
        try {
            long startTimeOfIteration = System.nanoTime();
            factorial = factorialByIteration.factorialOf(number);
            long endTimeOfIteration = System.nanoTime();

            System.out.println("iterativeFactorialMethod returned: " + factorial);
            System.out.println("Time for execution of recursiveFactorialMethod in nano second: " + (endTimeOfIteration - startTimeOfIteration));
        } catch (FactorialProgramException exception) {
            System.out.println("exception message: " + exception.getMessage());
            // exception.printStackTrace();
        } finally {
            System.out.println("for interesting factorial information, visit wiki entry at http://en.wikipedia.org/wiki/Factorial\n\n");
        }

        long startTimeOfrecursion = System.nanoTime();
        FactorialByRecursion recursion = new FactorialByRecursion();
        long factorialByRecursion = recursion.factorialOfNumber(number);
        long endTimeOfrecursion = System.nanoTime();

        System.out.println("recursiveFactorialMethod returned: " + factorialByRecursion);
        System.out.println("Time for execution of recursiveFactorialMethod in nano second: " + (endTimeOfrecursion - startTimeOfrecursion));
    }
}
