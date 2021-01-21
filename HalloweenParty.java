import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Halloween party
 * https://www.hackerrank.com/challenges/halloween-party/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=7-day-campaign
 */
public class HalloweenParty {

    /*
     * Complete the halloweenParty function below.
     * v == vertical cuts
     * h == horizontal cuts
     */
    static long halloweenParty(int k) {

        // **** sanity check(s) ****
        if (k < 2)
            return 0;

        // **** distribute the cuts (k = v + h) ****
        long v = k / 2;
        long h = k - v;

        // **** compute and return the number of pieces ****
        return v * h;
    }

    /**
     * Test scaffolding.
     * 
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        // **** open buffered reader ****
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // **** read number of test cases ****
        int T = Integer.parseInt(br.readLine().trim());

        // ???? ????
        System.out.println("main <<<      T: " + T);
        
        // **** loop once per test case ****
        for (int t = 0; t < T; t++) {

            // **** read the number of cuts ****
            int k = Integer.parseInt(br.readLine().trim());

            // ???? ????
            System.out.println("main <<<      k: " + k);

            // **** compute and display result ****
            System.out.println("main <<< pieces: " + halloweenParty(k));
        }
        
        // **** close buffered reader ****
        br.close();
    }
}