
class White_pawn extends chessPawns
{ 
      String chessPawn(){ return "WHITE_PAWN";}
      
      char pawnType()
    { return 'W';}
    String image="\u2659\t";
    void printImage(){System.out.print(image);}
    
    boolean isValid(chessPawns chessboard[][],int srcRow, int srcCol, int destRow, int destCol){
       try{
           //check for stright move
            if ((chessboard[destRow][destCol].pawnType()=='A')&&(chessboard[srcRow-1][destCol].pawnType()=='A')){
               //System.out.println("hi");
               if ((srcRow!=destRow)&&(destRow<srcRow)){ //System.out.println("hi2");
                   if((srcRow!=6 && destRow==srcRow-1)||(srcRow==6 && destRow>=srcRow-2&& destCol==srcCol)){                   
                       //System.out.println("hi4");
                       return true;
                    }
                } 
            }
            else if(srcCol!=destCol){

                //System.out.println("SrcRow= "+srcRow+"SrcCol="+srcCol);
                //System.out.println("DestRow= "+destRow+"DsetCol="+destCol);
               
                //check for opponent for sidewise attack
                if(chessboard[srcRow-1][srcCol+1].pawnType()=='B' || chessboard[srcRow-1][srcCol-1].pawnType()=='B')
                        return true;
            }
        }
        catch (Exception Ex){
           System.out.println("hi:exeption");
           return false; 
        }
       //System.out.println("hi not in if");
     return false;
    }
    
}