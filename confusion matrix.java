import java.util.Arrays;


public class ConfusionMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 3, 2},
            {4, 15, 1},
            {1, 2, 8}
        };
        
        int truePositive = matrix[0][0];
        int falsePositive = matrix[0][1] + matrix[0][2];
        int falseNegative = matrix[1][0] + matrix[2][0];
        int trueNegative = matrix[1][1] + matrix[1][2] + matrix[2][1] + matrix[2][2];
        
        double precision = (double) truePositive / (truePositive + falsePositive);
        double recall = (double) truePositive / (truePositive + falseNegative);
        double accuracy = (double) (truePositive + trueNegative) / (truePositive + falsePositive + falseNegative + trueNegative);
        double f1Score = 2 * ((precision * recall) / (precision + recall));
        
        System.out.println("Precision: " + precision);
        System.out.println("Recall: " + recall);
        System.out.println("Accuracy: " + accuracy);
        System.out.println("F1 Score: " + f1Score);
    }
}
