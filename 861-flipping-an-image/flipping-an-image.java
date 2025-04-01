class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image.length];
        for (int i = 0; i < image.length; i++) {
            for (int j = image.length-1; j >= 0; j--) {
                 ans[i][image.length-1-j] = image[i][j];
                 if(ans[i][image.length-1-j]==1){
                     ans[i][image.length-1-j] = 0;
                 }else{
                    ans[i][image.length-1-j] = 1;
                 }
            }
        }

        return ans;
    }
}