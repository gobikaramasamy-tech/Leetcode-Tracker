// Last updated: 7/17/2026, 10:27:57 AM
1class Solution {
2
3    class TrieNode {
4        TrieNode[] child = new TrieNode[26];
5        String word;
6    }
7
8    TrieNode root = new TrieNode();
9
10    public List<String> findWords(char[][] board, String[] words) {
11
12        for (String word : words) {
13            TrieNode curr = root;
14            for (char ch : word.toCharArray()) {
15                int idx = ch - 'a';
16                if (curr.child[idx] == null)
17                    curr.child[idx] = new TrieNode();
18                curr = curr.child[idx];
19            }
20            curr.word = word;
21        }
22
23        List<String> ans = new ArrayList<>();
24
25        int m = board.length;
26        int n = board[0].length;
27
28        for (int i = 0; i < m; i++) {
29            for (int j = 0; j < n; j++) {
30                dfs(board, i, j, root, ans);
31            }
32        }
33
34        return ans;
35    }
36
37    private void dfs(char[][] board, int r, int c, TrieNode node, List<String> ans) {
38
39        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length)
40            return;
41
42        char ch = board[r][c];
43
44        if (ch == '#')
45            return;
46
47        TrieNode next = node.child[ch - 'a'];
48
49        if (next == null)
50            return;
51
52        if (next.word != null) {
53            ans.add(next.word);
54            next.word = null;
55        }
56
57        board[r][c] = '#';
58
59        dfs(board, r + 1, c, next, ans);
60        dfs(board, r - 1, c, next, ans);
61        dfs(board, r, c + 1, next, ans);
62        dfs(board, r, c - 1, next, ans);
63
64        board[r][c] = ch;
65    }
66}