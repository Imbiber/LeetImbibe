class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> edgeList = new ArrayList<>();

        for(int i = 0; i < numCourses; i++){
            edgeList.add(new ArrayList<>());
        }

        int[] inorder = new int[numCourses];

        for(int[] prereq: prerequisites){
            edgeList.get(prereq[1]).add(prereq[0]);
            inorder[prereq[0]]++;
        }
        
        Queue<Integer> qu = new ArrayDeque<>();
 
        for(int i = 0; i < numCourses; i++){
            if(inorder[i] == 0) qu.add(i);
        }

        int count = 0;

        while(!qu.isEmpty()){
            int node = qu.remove();

            count++;
            for(int neigh: edgeList.get(node)){
                inorder[neigh]--;
                if(inorder[neigh] == 0) qu.add(neigh);
            }
        }

        return count == numCourses;
    }
}