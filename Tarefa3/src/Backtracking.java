import java.util.ArrayList;
import java.util.List;

public  class Backtracking {

    public static void main(String[] args) {
        int[] conj1 = { 1, 2, 3 };
        int n1 = 2;
        System.out.println(calcSubConjuntos(conj1, n1));

        int[] conj2 = { 1, 2, 3, 4 };
        int n2 = 1;
        System.out.println(calcSubConjuntos(conj2, n2));
    }

    public static List<List<Integer>> calcSubConjuntos(int[] S, int n) {
        List<List<Integer>> resultCalc = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        subBacktrack(S, n, 0, subset, resultCalc);
        return resultCalc;
    }

    private static void subBacktrack(int[] S, int n, int start, List<Integer> subset, List<List<Integer>> resultCalc) {
        if (subset.size() == n) {
            resultCalc.add(new ArrayList<>(subset));
            return;
        }

        for (int i = start; i < S.length; i++) {
            subset.add(S[i]);
            subBacktrack(S, n, i + 1, subset, resultCalc);
            subset.remove(subset.size() - 1);
        }
    }

}