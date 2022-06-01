 class Black_pawn extends chessPawns
{ 
    String chessPawn(){ return "BLACK_PAWN";}
    String image="\u265F\t";
    void printImage(){System.out.print(image);}
    
    char pawnType()
    { return 'B';}
    
    boolean isValid(chessPawns chessboard[][],int srcRow, int srcCol, int destRow, int destCol){
     
       try{
           //check for stright move
            if ((chessboard[destRow][destCol].pawnType()=='A')&&(chessboard[srcRow+1][destCol].pawnType()=='A')){
               // System.out.println("hi");
               if ((srcRow!=destRow)&&(destRow>srcRow)){//System.out.println("hi2");System.out.println("SrcRow= "+srcRow+"SrcCol="+srcCol);
                //System.out.println("DestRow= "+destRow+"DsetCol="+destCol);
                   if((srcRow!=1 && destRow==srcRow+1)||(srcRow==1 && destRow<=srcRow+2 && destCol==srcCol)){                   
                      //System.out.println("hi4");
                       return true;
                    }
                } 
            }
            else if(srcCol!=destCol){
                     
                //System.out.println("SrcRow= "+srcRow+"SrcCol="+srcCol);
                // System.out.println("DestRow= "+destRow+"DsetCol="+destCol);
               
                //check for opponent for sidewise attack
                if(chessboard[srcRow+1][srcCol-1].pawnType()=='W' || chessboard[srcRow+1][srcCol+1].pawnType()=='W')
                       { return true;}
               }
            }
         
        catch (Exception Ex){
           //System.out.println("hi:exeption");
           return false; 
        }
       //System.out.println("hi not in if");
      
     return false;
    }
    
   
}