class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];

        // Build adjacency list (using ArrayList for neighbors)
        List<Integer>[] adj = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) adj[i] = new ArrayList<>();

        for (int[] e : prerequisites) {
            adj[e[0]].add(e[1]);
            indegree[e[1]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        // List<Integer> topo = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) q.add(i);
        }
        int cnt = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            // topo.add(node);
            cnt++;

            for (int next : adj[node]) {
                indegree[next]--;
                if (indegree[next] == 0) {
                    q.add(next);
                }
            }
        }

        if(cnt == numCourses) return true;
        return false;
    }
}