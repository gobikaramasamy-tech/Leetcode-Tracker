// Last updated: 10/10/2026, 9:47:01 AM
1class AllOne {
2    private Map<String, Integer> count;
3    private TreeSet<Pair<Integer, String>> set;
4
5    public AllOne() {
6        count = new HashMap<>();
7        set = new TreeSet<>((a, b) -> a.getKey().equals(b.getKey()) ? a.getValue().compareTo(b.getValue()) : a.getKey() - b.getKey());
8    }
9
10    public void inc(String key) {
11        int n = count.getOrDefault(key, 0);
12        count.put(key, n + 1);
13        set.remove(new Pair<>(n, key));
14        set.add(new Pair<>(n + 1, key));
15    }
16
17    public void dec(String key) {
18        int n = count.get(key);
19        set.remove(new Pair<>(n, key));
20        if (n == 1) count.remove(key);
21        else {
22            count.put(key, n - 1);
23            set.add(new Pair<>(n - 1, key));
24        }
25    }
26
27    public String getMaxKey() {
28        return set.isEmpty() ? "" : set.last().getValue();
29    }
30
31    public String getMinKey() {
32        return set.isEmpty() ? "" : set.first().getValue();
33    }
34}