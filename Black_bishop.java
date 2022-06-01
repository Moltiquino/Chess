class Black_bishop extends chessPawns
{ 
    String chessPawn(){ return "BLACK_BISHOP";}
    
     char pawnType()
    { return 'B';}
     
    String image="\u265D\t";
    void printImage(){System.out.print(image);}
 
    boolean isValid(chessPawns chessboard[][],int srcRow, int srcCol, int destRow, int destCol){
        boolean checkFlag=false;
        //System.out.println(chessboard[destRow][destCol].pawnType());
        if(chessboard[destRow][destCol].pawnType()=='A'||chessboard[destRow][destCol].pawnType()=='W')
       {
            if(destRow!=srcRow && destCol!= srcCol){ 
                if(destCol>srcCol){
                     if(destRow<srcRow){                   
                         for (int i=srcCol+1,j=srcRow-1;i<=destCol && j>=destRow;i++,j--){                
                             if (chessboard[j][i].pawnType()=='A'||chessboard[destRow][destCol].pawnType()=='W')
                             {checkFlag = true;}
                             else{checkFlag=false;break;}
                         }
                     }
                     else if(destRow>srcRow)
                     { for (int i=srcCol+1,j=srcRow+1;i<=destCol && j<=destRow;i++,j++){
                         if (chessboard[j][i].pawnType()=='A'||chessboard[destRow][destCol].pawnType()=='W')
                         {checkFlag = true;}
                         else{checkFlag=false;break;}
                       }
                    } 
                } 
                if(destCol<srcCol){
                    if(destRow<srcRow){ 
                        for(int i=srcCol-1,j=srcRow-1;i>=destCol && j>=destRow;i--,j--){                  
                           if (chessboard[j][i].pawnType()=='A'||chessboard[destRow][destCol].pawnType()=='W')
                           {checkFlag = true;}
                           else{checkFlag=false;break;}
                       }
                     }
                    else if(destRow>srcRow){
                        for(int i=srcCol-1,j=srcRow+1;i>=destCol && j<=destRow;i--,j++){
                            if (chessboard[j][i].pawnType()=='A'||chessboard[destRow][destCol].pawnType()=='W')
                            {checkFlag = true;}
                            else{checkFlag=false;break;}
                       }
                    }
                }
        }
     }
     return checkFlag;
    }
    }