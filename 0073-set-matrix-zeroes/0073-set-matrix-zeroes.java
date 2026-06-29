class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[] r=new int[n];
        int[] c=new int[m];
        Arrays.fill(r,-1);
        Arrays.fill(c,-1);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    r[i]=0;
                    c[j]=0;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(r[i]==0)
                matrix[i][j]=0;
                if(c[j]==0)
                matrix[i][j]=0;
            }
        }
    }
}