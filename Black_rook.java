class Black_rook extends chessPawns
{ 
    String chessPawn(){ return "BLACK_ROOK";}
      
      char pawnType()
    { return 'B';}
    String image="\u265C\t";
    void printImage(){System.out.print(image);}
    
    boolean isValid(chessPawns chessboard[][],int srcRow, int srcCol, int destRow, int destCol)
      {    
         boolean checkFlag=false;
        
        if(chessboard[destRow][destCol].pawnType()=='A'||chessboard[destRow][destCol].pawnType()=='W'){
            if(destRow==srcRow){
                if (destCol > srcCol){ 
                    for(int i=srcCol+1;i<=destCol;i++)
                    {//System.out.println("hi4"+chessboard[srcRow][i].pawnType());
                        if(chessboard[srcRow][i].pawnType()=='A'||chessboard[destRow][destCol].pawnType()=='W')
                        {checkFlag=true;
                        }else {checkFlag=false;break;}
                    }
                }
                else{
                    for(int i=srcCol-1;i>=destCol;i--)
                    {//System.out.println("hi4"+chessboard[srcRow][i].pawnType());
                        if(chessboard[srcRow][i].pawnType()=='A'||chessboard[destRow][destCol].pawnType()=='W')
                        {checkFlag=true;
                        }else {checkFlag=false;break;}
                    }
                }
            }
            else if (destCol==srcCol) {  
                if (destRow > srcRow){ 
                    for(int i=srcRow+1;i<=destRow;i++){
                        //System.out.println("hi4"+chessboard[i][destCol].pawnType());
                        if(chessboard[i][destCol].pawnType()=='A'||chessboard[destRow][destCol].pawnType()=='W'){
                            checkFlag=true;
                        }else {checkFlag=false;break;}
                    }
                }
                else{
                    for(int i=srcRow-1;i>=destRow;i--){
                        //System.out.println("hi4"+chessboard[i][destCol].pawnType());
                        if(chessboard[i][destCol].pawnType()=='A'||chessboard[destRow][destCol].pawnType()=='W'){
                            checkFlag=true;
                        }else {checkFlag=false;break;}
                    }
                }
            }          
        }
        return checkFlag; 
 }
}
