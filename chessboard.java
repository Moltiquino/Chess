
import java.io.*;
//import util.*;
class chessboard
{
    // Global Variables list 
    static chessPawns chessboard[][]=new chessPawns[8][8];
    //String nextMove = "White";
        int nextMove=1;
        char prevValidMove = 'B';
        boolean flgWin=false;
    //Initialize the king position for checking 
        int wkrow=0;int wkcol=0;
        int bkrow=0;int bkcol=0;
    
    //Draw initial chessboard pattern
    //Get objects of all ppossible pawns 
        Black_king bk =new Black_king();
        Black_queen bq =new Black_queen();
        Black_bishop bb1 =new Black_bishop();
        Black_knight bk1 =new Black_knight();
        Black_rook br1 =new Black_rook();        
        Black_pawn bp =new Black_pawn();
        
        White_king wk =new White_king();
        White_queen wq =new White_queen();
        White_bishop wb1 =new White_bishop();
        White_knight wk1 =new White_knight();
        White_rook wr1 =new White_rook();
        White_pawn wp =new White_pawn();
        
        Blank blk =new Blank();
        
        boolean validCheck=true;
        
       void populate_chessboard(){
       
           for(int i=0;i<8;i++){
               switch(i) 
                 {case 0 :case 7: 
                  chessboard[0][0]=br1;
                  chessboard[0][7]=br1;
                  chessboard[7][0]=wr1;
                  chessboard[7][7]=wr1;
                  break;
                  case 1: case 6:
                  chessboard[0][1]=bk1;
                  chessboard[0][6]=bk1;
                  chessboard[7][1]=wk1;
                  chessboard[7][6]=wk1;
                  break;
                  case 2: case 5:
                  chessboard[0][2]=bb1;
                  chessboard[0][5]=bb1;
                  chessboard[7][2]=wb1;
                  chessboard[7][5]=wb1;
                  break;
                  case 3:
                  chessboard[0][3]=bq;
                  chessboard[7][3]=wq;
                  break;
                  case 4:
                  chessboard[0][4]=bk;
                  chessboard[7][4]=wk;
                  break;
                 }
                 
                chessboard[1][i]=bp;
                chessboard[6][i]=wp; 
                chessboard[2][i]=blk;
                chessboard[3][i]=blk;
                chessboard[4][i]=blk;
                chessboard[5][i]=blk;
            }
            wkrow=7;wkcol=4;
            bkrow=0;bkcol=4;
        }
        //A global method to print the array for chessboard
        void print_chessboard()
        {
            char a = 'a';
            
            if(!flgWin){
                System.out.print("\t");
                for (int l = 0; l < 8; l++) {
                    System.out.print(a+"\t");
                    a++;  
                }
                System.out.println("\r");
                
                //System.out.println("Type="+temp);
                for(int i=0;i<8;i++) {
                    System.out.print(8-i + ". \t");
            
                    for(int k=0;k<8;k++){
                        chessboard[i][k].printImage();                        
                    }  
                    System.out.println();
                    if(i%2==0){System.out.println("     -------         -------          -------         -------       ");}
                    else{System.out.println("            --------         --------         --------        -------");}
                }
                
                
                
                  
                //print the valid next move and set the previous succesful move, to check whether move for black / white
                if (nextMove%2==0){
                    System.out.println ("\n\n\nMove is for BLACK");
                    System.out.println ("-----------------");
                    prevValidMove ='W';
                }
                else{
                    System.out.println ("\n\n\nMove is for WHITE");
                    System.out.println ("-----------------");
                    prevValidMove ='B';
                }
            }
            flgWin = false;
            //movement in loop 
            try{
                  move();
                }
            catch (IOException Ex){
                System.err.println("An IO error has occurred!!");
            } 
            
        }
        //Method to validate the input given for the movement (Valid input like e1-e3)
        boolean validateInput(String in){
            if(in.length()==5){
                if((in.charAt(0)>='a')&&(in.charAt(0)<='h')&&(in.charAt(3)>='a')&&(in.charAt(3)<='h')){
                    if((in.charAt(1)>='1')&&(in.charAt(1)<='8')&&(in.charAt(4)>='1')&&(in.charAt(4)<='8')){
                        if(in.charAt(2)=='-')
                            return true;
                    }
                }
            }
            return false;
        }
        
        int getColPosition(String column){
            char first = column.charAt(0);
            switch (first)
            {case 'a':return 0;
             case 'b':return 1; 
             case 'c':return 2;
             case 'd':return 3;
             case 'e':return 4;
             case 'f':return 5;
             case 'g':return 6;
             case 'h':return 7;
         }
         return 0;
        }
        
        int getRowPosition(String column){
            char first = column.charAt(1);
            switch (first)
            {case '8':return 0;
             case '7':return 1; 
             case '6':return 2;
             case '5':return 3;
             case '4':return 4;
             case '3':return 5;
             case '2':return 6;
             case '1':return 7;
         }
         return 0;
        }
        
        void move() throws IOException{
            try{
                System.out.println("Input the moves in standard chess notation, Ex:e1-e5 or 'x' to Quit");
    
                String input = readInput();
                //Exit the game
                if (input.equalsIgnoreCase("x")){exitGame();}
                
                int col1=0; int col2=0; int row1=0;int row2=0; 
                            
                 boolean validInput = validateInput(input);
                 
                 if (!validInput){
                       System.out.println ("\u000C");
                       System.out.println ("\t*****Invalid move entered, please reneter as e1-e5*****\n");                        
                       validCheck = false;
                }
                else 
                    {  
                        String sourcePosition = input.substring(0,2);
                        String destPosition = input.substring(3,input.length());
                        System.out.println ("sourcePosition="+sourcePosition+","+"destPosition="+destPosition);     
                        col1=getColPosition(sourcePosition);
                        col2=getColPosition(destPosition);
                        row1=getRowPosition(sourcePosition);
                        row2=getRowPosition(destPosition);
                        validCheck = true;
                        
                        char pawnType =chessboard[row1][col1].pawnType();
                        boolean validMove = true; 
                        //System.out.println ("Pawn Type @ move="+pawnType);
                        
                        //check for valid next move, user cant check move same color again 
                        if(prevValidMove == pawnType){
                            validMove = false;                            
                        }
                        else{
                            //check for validity of the move                             
                            validMove = chessboard[row1][col1].isValid(chessboard,row1, col1, row2, col2);
                        }   
                          
                        //clear screen for reprinting the board 
                        System.out.println ("\u000C");
                        
                        if (validMove){
                            String Pawn=chessboard[row1][col1].chessPawn();
                            //System.out.println("In MOve="+Pawn);
                            //check if there is any "CHECK" on the king due to his own move
                            if(Pawn.equals("BLACK_KING")){
                                if(!bk.isCheck(chessboard,row2,col2)){
                                    bkrow=row2;bkcol=col2;
                                }
                                else{
                                    System.out.println ("\t*****This move results in Check, please provide a valid move*****\n");
                                    validCheck = false; }
                            }
                            else if(Pawn.equals("WHITE_KING")){
                               if(!wk.isCheck(chessboard,row2,col2)){
                                   wkrow=row2;wkcol=col2;
                                }
                                else{
                                    System.out.println ("\t*****This move results in Check, please provide a valid move*****\n");
                                    validCheck = false; }
                            }
                            
                            if(validCheck){
                                //check if the dest pawn is a king 
                                String kingPawn = chessboard[row2][col2].chessPawn();
                                if(kingPawn.equals("WHITE_KING")){
                                    System.out.println ("\n\n\n\t*****NO MORE MOVES...BLACK WINS*****\n");
                                    System.out.println ("\t************* ENTER 'X'*************\n");
                                    flgWin=true;
                                }
                                else if(kingPawn.equals("BLACK_KING")){
                                    System.out.println ("\n\n\n\t*****NO MORE MOVES...WHITE WINS*****\n"); 
                                    System.out.println ("\t************* ENTER 'X'*************\n");
                                    flgWin=true;
                                }
                                //Move the pawns accordingly and update the array 
                                chessboard[row2][col2] = chessboard[row1][col1];
                                chessboard[row1][col1] = blk;  
                                //Decide for next move
                                nextMove++;
                               
                            }
                            
                            //check if there is any "CHECK" on the king due to others move                            
                            char type=chessboard[row2][col2].pawnType();
                            if(type=='B'){
                                boolean b=wk.isCheck(chessboard,wkrow,wkcol);
                                //System.out.println("hixyzzz");
                                if(b==true){System.out.println("\t\t--------------------------------");
                                            System.out.println("\t\t*****White king is at check*****");
                                            System.out.println("\t\t--------------------------------");
                                        }
                            }
                            else if(type=='W'){
                                //System.out.println("In W loop");
                                boolean b=bk.isCheck(chessboard,bkrow,bkcol);
                                if(b==true){System.out.println("\t\t--------------------------------");
                                            System.out.println("\t\t*****Black king is at check*****");
                                            System.out.println("\t\t--------------------------------");
                                        }
                            }

                         }
                         else{
                             if(prevValidMove==pawnType)
                                 System.out.print("*******Its not your turn !!!*******");   
                             System.out.println ("\t*****Invalid Move, please re-enter*****\n");  
                             validCheck = false; }
                        //System.out.println ("validCheck1="+validCheck);
                    }
            }
            catch(Exception ex){ex.printStackTrace();System.err.print("An unhandled exeption has occured\n");  }             
            
            
            //print the updated board for continuing
            print_chessboard(); 
                
        }
        
        //To exit abruptly 
        void exitGame()throws IOException
        {
            System.out.println("\u000C");
            System.out.println("\n\n\n\n\t\t\t\t\tThank You for playing the game");
            System.out.println("\t\tWould you like to restart the game, type Y for Yes, N for No");
            String input = readInput();
            if (input.equalsIgnoreCase("y")){
               System.out.println("\u000C");
               prevValidMove = 'B';
               nextMove=1;
               populate_chessboard();
               print_chessboard();
            }
            else if(input.equalsIgnoreCase("n"))
            {
                System.out.println("\u000C");
                System.out.println("\n\n\n\n\n\n\t\t\tPlease close the window by clicking X mark on the top right corner");
                System.exit(0);}
             else{System.out.println("Not a valid option");exitGame();}
        }
         
        String readInput()throws IOException
          {  
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String input =br.readLine();
            input.trim();
            return input;
        } 
        
        void main()
          {
              // Main program 
              intro display = new intro();  
             try{
                  // Introductory messages  
                  display.main();
                  // Populate the chess board and print it  
                  populate_chessboard();
                  print_chessboard();
             }catch (Exception ex){
                    
                    System.err.println("An unhandled exception has occurred");
                    System.out.print("\u000C");
                    print_chessboard();
             } 
             //finally{ System.err.println("An unhandled exception has occurred");}
          } 
    }  
        
        