package Prgm;

import java.util.*;

public class EuclideanDistance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < n; i++) {

            int k = scanner.nextInt(); // Number of points

            int[] x = new int[k];

            int[] y = new int[k];

            for (int j = 0; j < k; j++) {

                x[j] = scanner.nextInt();

            }

            for (int j = 0; j < k; j++) {

                y[j] = scanner.nextInt();

            }

            int[] distances = calculateDistances(x, y);

            int result = findMostFrequentDistance(distances);

            System.out.println(result);

        }

        scanner.close();

    }

    private static int[] calculateDistances(int[] x, int[] y) {

        int k = x.length;

        int[] distances = new int[k * (k - 1) / 2];

        int index = 0;

        for (int i = 0; i < k - 1; i++) {

            for (int j = i + 1; j < k; j++) {

                int distance = (int) Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));

                distances[index++] = distance;

            }

        }

        return distances;

    }

    private static int findMostFrequentDistance(int[] distances) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int distance : distances) {

            frequencyMap.put(distance, frequencyMap.getOrDefault(distance, 0) + 1);

        }

        int mostFrequentDistance = -1;

        int maxFrequency = -1;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {

            if (entry.getValue() > maxFrequency) {

                maxFrequency = entry.getValue();

                mostFrequentDistance = entry.getKey();

            }

        }

        return mostFrequentDistance;

    }

}