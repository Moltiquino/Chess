class Black_knight extends chessPawns
{ 
    String chessPawn(){ return "BLACK_KNIGHT";}
      
      char pawnType()
    { return 'B';}
      
    String image="\u265E\t";
    void printImage(){System.out.print(image);}
    
    boolean isValid(chessPawns chessboard[][],int srcRow, int srcCol, int destRow, int destCol){
        //System.out.println("Knight valid check PawnType"+chessboard[destRow][destCol].pawnType());
        //System.out.println("in Knight srcRow="+srcRow+",srcCol="+srcCol+",destRow="+destRow+",destCol="+destCol);
        if(chessboard[destRow][destCol].pawnType()=='A'||chessboard[destRow][destCol].pawnType()=='W'){
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
