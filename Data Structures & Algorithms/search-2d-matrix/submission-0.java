class Solution { 
    public boolean searchMatrix(int[][] matrix, int target) { 
 
        int rows = matrix.length; 
        int cols = matrix[0].length; 
 
        if (rows == 1) { 
            return binarySearch(matrix, 0, 0, cols - 1, target); 
        } 
 
        int rstart = 0; 
        int rend = rows - 1; 
        int cmid = cols / 2;
 
        while (rstart < rend - 1) { 
 
            int rmid = rstart + (rend - rstart) / 2; 
 
            if (matrix[rmid][cmid] == target) { 
                return true; 
            } 
 
            if (matrix[rmid][cmid] > target) { 
                rend = rmid; 
            } else { 
                rstart = rmid; 
            } 
        } 
 
        if (matrix[rstart][cmid] == target) { 
            return true; 
        } 
 
        if (matrix[rstart + 1][cmid] == target) { 
            return true; 
        } 
         
        if ( cmid>0 && target <= matrix[rstart][cmid - 1]) { 
            return binarySearch(matrix, rstart, 0, cmid - 1, target); 
        } 
 
        if (cmid <cols-1 && target >= matrix[rstart][cmid + 1] 
                && target <= matrix[rstart][cols - 1]) { 
            return binarySearch(matrix, rstart, cmid + 1, cols - 1, target); 
        } 
 
        if (target <= matrix[rstart + 1][cmid]) { 
            return binarySearch(matrix, rstart + 1, 0, cmid - 1, target); 
        } else { 
            return binarySearch(matrix, rstart + 1, cmid + 1, cols - 1, target); 
        } 
    } 
 
    boolean binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) { 
 
        while (cStart <= cEnd) { 
            int cMid = cStart + (cEnd - cStart) / 2; 
 
            if (target == matrix[row][cMid]) { 
                return true; 
            } 
         
            if (matrix[row][cMid] > target) { 
                cEnd = cMid - 1; 
            } else { 
                cStart = cMid + 1; 
            } 
        } 
 
        return false;  
    } 
}