//Reference class for all pawn types. 
//Used for creating the array of chess pawn objects to hold all types of chess pawns 

class chessPawns
{
    String image="  ";
    
    String chessPawn(){return "";}
    
    char pawnType(){return ' ';}
    
    void printImage(){System.out.print(image);}
    
    boolean isValid(chessPawns chessboard[][],int srcRow, int srcCol, int destRow, int destCol){return true;}
    
}