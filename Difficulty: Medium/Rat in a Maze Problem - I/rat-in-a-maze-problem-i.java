class Solution {
    // Function to find all possible paths
    void helper(int[][] maze,int r,int c,ArrayList<String>ans,String path){
      int n=maze.length;
      if(c<0 || r<0 || c>=n || r>=n || maze[r][c]==0 || maze[r][c]==-1){
          return;
      }
      if(r==n-1 && c==n-1){
          ans.add(path);
      }
      maze[r][c]=-1;
      helper(maze,r+1,c,ans,path+"D");
       helper(maze,r,c-1,ans,path+"L");
      helper(maze,r,c+1,ans,path+"R");
      helper(maze,r-1,c,ans,path+"U");
     
      maze[r][c]=1;
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> ans=new ArrayList<>();
        String path="";
        helper(maze,0,0,ans,path);
        
        return ans;
    }
}