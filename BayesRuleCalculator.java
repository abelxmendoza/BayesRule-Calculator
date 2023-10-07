public class BayesRuleCalculator {
    public static void main(String[] args) {
        // Define the prior probability P(A)
        double priorProbabilityA = 0.3;

        // Define the likelihood P(B|A)
        double likelihoodBA = 0.8;

        // Define the marginal probability P(B)
        double marginalProbabilityB = 0.5;

        // Calculate the posterior probability P(A|B) using Bayes' Rule
        double posteriorProbabilityA = (priorProbabilityA * likelihoodBA) / marginalProbabilityB;

        // Display the results
        System.out.println("Prior Probability P(A): " + priorProbabilityA);
        System.out.println("Likelihood P(B|A): " + likelihoodBA);
        System.out.println("Marginal Probability P(B): " + marginalProbabilityB);
        System.out.println("Posterior Probability P(A|B): " + posteriorProbabilityA);
    }
}
