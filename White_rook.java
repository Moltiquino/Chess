class White_rook extends chessPawns
{ 
      String chessPawn(){ return "WHITE_ROOK";}
       
      char pawnType()
    { return 'W';}
    String image="\u2656\t";
    void printImage(){System.out.print(image);}
    
    boolean isValid(chessPawns chessboard[][],int srcRow, int srcCol, int destRow, int destCol)
      {    
         boolean checkFlag=false;
        
        if(chessboard[destRow][destCol].pawnType()=='A'||chessboard[destRow][destCol].pawnType()=='B'){
            if(destRow==srcRow){
                if (destCol > srcCol){ 
                    for(int i=srcCol+1;i<=destCol;i++)
                    {
                        if(chessboard[srcRow][i].pawnType()=='A'||chessboard[destRow][destCol].pawnType()=='B')
                        {checkFlag=true;
                        }else {checkFlag=false;break;}
                    }
                }
                else{
                    for(int i=srcCol-1;i>=destCol;i--)
                    {
                        if(chessboard[srcRow][i].pawnType()=='A'||chessboard[destRow][destCol].pawnType()=='B')
                        {checkFlag=true;
                        }else {checkFlag=false;break;}
                    }
                }
            }
            else if (destCol==srcCol) {  
                if (destRow > srcRow){ 
                    for(int i=srcRow+1;i<=destRow;i++){
                        if(chessboard[i][destCol].pawnType()=='A'||chessboard[destRow][destCol].pawnType()=='B'){
                            checkFlag=true;
                        }else {checkFlag=false;break;}
                    }
                }
                else{
                    for(int i=srcRow-1;i>=destRow;i--){
                        if(chessboard[i][destCol].pawnType()=='A'||chessboard[destRow][destCol].pawnType()=='B'){
                            checkFlag=true;
                        }else {checkFlag=false;break;}
                    }
                }
            }          
        }
        return checkFlag; 
 }
 }