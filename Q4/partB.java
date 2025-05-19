public boolean clearPair(int rows, int cols){
    for(int i = rows;i<puzzle.length;i++){
        for(int j = 0;j<puzzle[i].length;j++){
            if (!(i == rows && j == cols)){
                if((puzzle[i][j]==puzzle[rows][cols])|| (puzzle[i][j]+puzzle[rows][cols]==10)){
                    puzzle[i][j]= 0;
                    puzzle[rows][cols]= 0;
                    return true;
                }
            }
        }
    }
    return false;
}
