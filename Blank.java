class Blank extends chessPawns
{ 
    String chessPawn = "BLANK";
     char pawnType()
    { return 'A';}
    String image="\u2001\t";
    void printImage(){System.out.print(image);}

    boolean isValid(chessPawns chessboard[][],int srcRow, int srcCol, int destRow, int destCol){return false;}

}