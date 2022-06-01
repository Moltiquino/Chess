public class White_queen extends chessPawns
{
    String chessPawn(){ return "WHITE_QUEEN";}
    
      char pawnType()
    { return 'W';}
    String image="\u2655\t";
    void printImage(){System.out.print(image);}
   
    boolean isValid(chessPawns chessboard[][],int srcRow, int srcCol, int destRow, int destCol){
        White_rook rook=new White_rook();
        boolean check=rook.isValid(chessboard,srcRow,srcCol,destRow,destCol);
        White_bishop bis=new White_bishop();
        boolean check1=bis.isValid(chessboard,srcRow,srcCol,destRow,destCol);
        if(check){return true;}
        else if(check1){return true;}
        return false;}
}

