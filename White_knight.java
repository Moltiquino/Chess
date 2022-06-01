class White_knight extends chessPawns
{ 
      String chessPawn(){return "WHITE_KNIGHT";}
      
      char pawnType()
    { return 'W';}
    String image="\u2658\t";
    void printImage(){System.out.print(image);}
    
    boolean isValid(chessPawns chessboard[][],int srcRow, int srcCol, int destRow, int destCol){
        if(chessboard[destRow][destCol].pawnType()=='A'||chessboard[destRow][destCol].pawnType()=='B'){
         if(destRow!=srcRow){
             
           if(srcRow+2==destRow && (srcCol+1==destCol||srcCol-1 == destCol)){return true;}
           else if(srcRow-2==destRow&& (srcCol+1==destCol||srcCol-1 == destCol)){return true;}
           else if(srcCol+2==destCol&& (srcRow+1==destRow||srcRow-1 == destRow)){return true;} 
           else if(srcCol-2==destCol&& (srcRow+1==destRow||srcRow-1 == destRow)){return true;} 
            } 
           }
        
        return false;
     }
}