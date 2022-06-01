class Black_queen extends chessPawns
{
    String chessPawn(){ return "BLACK_QUEEN";}
    
    char pawnType()
    { return 'B';}
    String image="\u265B\t";
    void printImage(){System.out.print(image);}
 
     boolean isValid(chessPawns chessboard[][],int srcRow, int srcCol, int destRow, int destCol){
        Black_rook rook=new Black_rook();
        boolean check=rook.isValid(chessboard,srcRow,srcCol,destRow,destCol);
        Black_bishop bis=new Black_bishop();
        boolean check1=bis.isValid(chessboard,srcRow,srcCol,destRow,destCol);
        if(check){return true;}
        else if(check1){return true;}
        return false;}
}