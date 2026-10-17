class Solution {
    public List<List<String>> partition(String s) {

        List<List<String>> arr = new ArrayList<>();

        generateP(0, s, arr, new ArrayList<String>());
        return arr;

    }

    void generateP(int i, String s, List<List<String>> arr, ArrayList<String> sub) {
        if (i == s.length()) {
            arr.add(new ArrayList<>(sub));
            return;
        }
        for (int j = i; j < s.length(); j++) {
            if (isPali(s, i, j)) {
                sub.add(s.substring(i, j + 1));
                generateP(j + 1, s, arr, sub);
                sub.remove(sub.size() - 1);
            }

        }
    }

    boolean isPali(String s, int i, int j) {
        int x = 0;
        int y = s.length();
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
