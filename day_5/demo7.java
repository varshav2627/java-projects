package day_5;

public class demo7 {
    public static void main(String[] args) {
        String s = "programming";
        boolean[] visited = new boolean[256];

        for (int i = 0; i < s.length(); i++) {
            if (visited[s.charAt(i)])
                continue;

            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    count++;
            }

            if (count > 1)
                System.out.println(s.charAt(i) + " = " + count);

            visited[s.charAt(i)] = true;
        }
    }


}
