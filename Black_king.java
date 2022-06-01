class Black_king extends chessPawns{ 
            String chessPawn(){ return "BLACK_KING";}
             
            char pawnType()
            { return 'B';}
            String image="\u265A\t";
                
            void printImage(){System.out.print(image);}
            
            boolean isValid(chessPawns chessboard[][],int srcRow, int srcCol, int destRow, int destCol){
                if(chessboard[destRow][destCol].pawnType()=='A'||chessboard[destRow][destCol].pawnType()=='B'){
                 if(srcCol==destCol){
                    if(srcRow+1==destRow||srcRow-1==destRow){
                     return true;
                    }
                    
                  }
                  else if(srcRow==destRow){
                    if(srcCol+1==destCol||srcCol-1==destCol){
                     return true;
                    }
                  }
                 else if(srcRow+1==destRow && (srcCol+1==destCol||srcCol-1==destCol)){return true;}
                 else if(srcRow-1==destRow && (srcCol+1==destCol||srcCol-1==destCol)){return true;}
              }
               return false;
            }
         
             boolean isCheck(chessPawns chessboard[][],int srcRow,int srcCol){
              //check attack by Pawns
                if((srcRow>0)&&(srcRow<7)){
                    if((srcCol>0)&&(srcCol<7)){
                        //Check in all 8 directions for a threat to king
                        //check left cells 
                         if(chessboard[srcRow][srcCol-1].pawnType() !='B'){
                            if(chessboard[srcRow][srcCol-1].chessPawn().equals("WHITE_KING")){return true;}
                            for(int i=srcCol-1;i>=0; i--){
                                char c = chessboard[srcRow][i].pawnType();
                                switch(c){
                                    case 'B':break;
                                    case 'W':
                                        if((chessboard[srcRow][i].chessPawn().equals("WHITE_QUEEN"))||(chessboard[srcRow][i].chessPawn().equals("WHITE_ROOK"))){
                                            return true;
                                        }
                                        break;                                 
                                }
                             }
                         }
                         //check right cells 
                         if(chessboard[srcRow][srcCol+1].pawnType() !='B'){
                             if(chessboard[srcRow][srcCol+1].chessPawn().equals("WHITE_KING")){return true;}
                            for(int i=srcCol+1;i<=7; i++){
                                char c = chessboard[srcRow][i].pawnType();
                                switch(c){
                                    case 'B':break;
                                    case 'W':
                                        if((chessboard[srcRow][i].chessPawn().equals("WHITE_QUEEN"))||(chessboard[srcRow][i].chessPawn().equals("WHITE_ROOK"))){
                                            return true;
                                        }
                                        break;                                 
                                }
                             }
                         }        
                         //check bottom left cells 
                         if(chessboard[srcRow+1][srcCol-1].pawnType() !='B'){
                            if(chessboard[srcRow+1][srcCol-1].chessPawn().equals("WHITE_PAWN")||chessboard[srcRow+1][srcCol-1].chessPawn().equals("WHITE_KING"))
                            {return true;}
                            int i=1;
                            do{
                                char c = chessboard[srcRow+i][srcCol-i].pawnType();
                                //System.out.println("row="+(srcRow+i)+",Col="+(srcCol-i)+",Type="+c+",Pawn="+chessboard[srcRow+i][srcCol-i].chessPawn());
                                switch(c){
                                    case 'B':break;
                                    case 'W':{
                                            if((chessboard[srcRow+i][srcCol-i].chessPawn().equals("WHITE_QUEEN"))||
                                            (chessboard[srcRow+i][srcCol-i].chessPawn().equals("WHITE_BISHOP"))){
                                                return true;
                                        }
                                        break;}                           
                                    }
                                i++;
                            }while ((srcRow+i<=7)&&(srcCol-i>=0)); 
                         }

                         //check bottom cells 
                         if(chessboard[srcRow+1][srcCol].pawnType() !='B'){
                             if(chessboard[srcRow+1][srcCol].chessPawn().equals("WHITE_KING")){return true;}
                            for(int i=srcRow+1;i<=7; i++){
                                char c = chessboard[i][srcCol].pawnType();
                                switch(c){
                                    case 'B':break;
                                    case 'W':
                                        if((chessboard[i][srcCol].chessPawn().equals("WHITE_QUEEN"))||(chessboard[i][srcCol].chessPawn().equals("WHITE_ROOK"))){
                                            return true;
                                        }
                                        break;                                 
                                }
                             }
                         }
                         //check bottom right cells 
            
                         if(chessboard[srcRow+1][srcCol+1].pawnType() !='B'){
                            if(chessboard[srcRow+1][srcCol+1].chessPawn().equals("WHITE_PAWN")||chessboard[srcRow+1][srcCol+1].chessPawn().equals("WHITE_KING"))
                            {return true;}
                                int i=1;
                                do{
                                    char c = chessboard[srcRow+i][srcCol+i].pawnType();
                                    //System.out.println("row="+(srcRow+i)+",Col="+(srcCol+i)+",Type="+c+",Pawn="+chessboard[srcRow+i][srcCol+i].chessPawn());
                                    switch(c){
                                        case 'B':break;
                                        case 'W':{
                                                if((chessboard[srcRow+i][srcCol+i].chessPawn().equals("WHITE_QUEEN"))||
                                                (chessboard[srcRow+i][srcCol+i].chessPawn().equals("WHITE_BISHOP"))){
                                                    return true;
                                            }
                                            break;}                           
                                        }
                                    i++;
                                }while ((srcRow+i<=7)&&(srcCol+i<=7));    
                         }              
        
                         //check top left cells   
                         if(chessboard[srcRow-1][srcCol-1].pawnType() !='B'){
                            if(chessboard[srcRow-1][srcCol-1].chessPawn().equals("WHITE_PAWN")||chessboard[srcRow-1][srcCol-1].chessPawn().equals("WHITE_KING"))
                            {return true;}
                                int i=1;
                                do{
                                    char c = chessboard[srcRow-i][srcCol-i].pawnType();
                                    //System.out.println("row="+(srcRow-i)+",Col="+(srcCol-i)+",Type="+c+",Pawn="+chessboard[srcRow-i][srcCol-i].chessPawn());
                                    switch(c){
                                        case 'B':break;
                                        case 'W':{
                                                if((chessboard[srcRow-i][srcCol-i].chessPawn().equals("WHITE_QUEEN"))||
                                                (chessboard[srcRow-i][srcCol-i].chessPawn().equals("WHITE_BISHOP"))){
                                                    return true;
                                            }
                                            break;}                           
                                        }
                                    i++;
                                }while ((srcRow-i>=0)&&(srcCol-i>=0));
                         }  
        
                         //check top cells  
                        if(chessboard[srcRow-1][srcCol].pawnType() !='B'){
                         if(chessboard[srcRow-1][srcCol].chessPawn().equals("WHITE_KING")){return true;}   
                         for(int i=srcRow-1;i>=0; i--){
                                char c = chessboard[i][srcCol].pawnType();
                                switch(c){
                                    case 'B':break;
                                    case 'W':
                                        if((chessboard[i][srcCol].chessPawn().equals("WHITE_QUEEN"))||(chessboard[i][srcCol].chessPawn().equals("WHITE_ROOK"))){
                                            return true;
                                        }
                                        break;                                 
                                }
                             }
                        }

                        //check top right cells  
                        if(chessboard[srcRow-1][srcCol+1].pawnType() !='B'){
                            if(chessboard[srcRow-1][srcCol+1].chessPawn().equals("WHITE_PAWN")||chessboard[srcRow-1][srcCol+1].chessPawn().equals("WHITE_KING"))
                            {return true;}
                                int i=1;
                                do{
                                    char c = chessboard[srcRow-i][srcCol+i].pawnType();
                                    //System.out.println("row="+(srcRow-i)+",Col="+(srcCol+i)+",Type="+c+",Pawn="+chessboard[srcRow-i][srcCol+i].chessPawn());
                                    switch(c){
                                        case 'B':break;
                                        case 'W':{
                                                if((chessboard[srcRow-i][srcCol+i].chessPawn().equals("WHITE_QUEEN"))||
                                                (chessboard[srcRow-i][srcCol+i].chessPawn().equals("WHITE_BISHOP"))){
                                                    return true;
                                            }
                                            break;}                           
                                        }
                                    i++;
                                }while ((srcRow-i>=0)&&(srcCol+i<=7));
                        }
                    }
                    else if(srcCol==0){
                    //check in 5 directions possible

                    //check right cells  
                        if(chessboard[srcRow][srcCol+1].pawnType() !='B'){
                            if(chessboard[srcRow][srcCol+1].chessPawn().equals("WHITE_KING")){return true;}
                            for(int i=srcCol+1;i<=7; i++){
                                char c = chessboard[srcRow][i].pawnType();
                                switch(c){
                                    case 'B':break;
                                    case 'W':
                                        if((chessboard[srcRow][i].chessPawn().equals("WHITE_QUEEN"))||(chessboard[srcRow][i].chessPawn().equals("WHITE_ROOK"))){
                                            return true;
                                        }
                                        break;                                 
                                }
                             }
                          }  
                          //check bottom cells  
                          if(chessboard[srcRow+1][srcCol].pawnType() !='B'){
                              if(chessboard[srcRow+1][srcCol].chessPawn().equals("WHITE_KING")){return true;}
                            for(int i=srcRow+1;i<=7; i++){
                                char c = chessboard[i][srcCol].pawnType();
                                switch(c){
                                    case 'B':break;
                                    case 'W':
                                        if((chessboard[i][srcCol].chessPawn().equals("WHITE_QUEEN"))||(chessboard[i][srcCol].chessPawn().equals("WHITE_ROOK"))){
                                            return true;
                                        }
                                        break;                                 
                                }
                             }
                            }
        
                            //check bottom right cells  
                            if(chessboard[srcRow+1][srcCol+1].pawnType() !='B'){
                              if(chessboard[srcRow+1][srcCol+1].chessPawn().equals("WHITE_PAWN")||chessboard[srcRow+1][srcCol+1].chessPawn().equals("WHITE_KING")){return true;}
    
                                int i=1;
                                do{
                                    char c = chessboard[srcRow+i][srcCol+i].pawnType();
                                    //System.out.println("row="+(srcRow+i)+",Col="+(srcCol+i)+",Type="+c+",Pawn="+chessboard[srcRow+i][srcCol+i].chessPawn());
                                    switch(c){
                                        case 'B':break;
                                        case 'W':{
                                                if((chessboard[srcRow+i][srcCol+i].chessPawn().equals("WHITE_QUEEN"))||
                                                (chessboard[srcRow+i][srcCol+i].chessPawn().equals("WHITE_BISHOP"))){
                                                    return true;
                                            }
                                            break;}                           
                                        }
                                    i++;
                                }while ((srcRow+i<=7)&&(srcCol+i<=7));  
                            }  
            
                            //check top cells  
                            if(chessboard[srcRow-1][srcCol].pawnType() !='B'){
                                if(chessboard[srcRow-1][srcCol].chessPawn().equals("WHITE_KING")){return true;}
                             for(int i=srcRow-1;i>=0; i--){
                                char c = chessboard[i][srcCol].pawnType();
                                switch(c){
                                    case 'B':break;
                                    case 'W':
                                        if((chessboard[i][srcCol].chessPawn().equals("WHITE_QUEEN"))||(chessboard[i][srcCol].chessPawn().equals("WHITE_ROOK"))){
                                            return true;
                                        }
                                        break;                                 
                                }
                             }
                            }

                            //check top right cells  
                            if(chessboard[srcRow-1][srcCol+1].pawnType() !='B'){
                             if(chessboard[srcRow-1][srcCol+1].chessPawn().equals("WHITE_PAWN")||chessboard[srcRow-1][srcCol+1].chessPawn().equals("WHITE_KING"))
                             {return true;}
                                int i=1;
                                do{
                                    char c = chessboard[srcRow-i][srcCol+i].pawnType();
                                    //System.out.println("row="+(srcRow-i)+",Col="+(srcCol+i)+",Type="+c+",Pawn="+chessboard[srcRow-i][srcCol+i].chessPawn());
                                    switch(c){
                                        case 'B':break;
                                        case 'W':{
                                                if((chessboard[srcRow-i][srcCol+i].chessPawn().equals("WHITE_QUEEN"))||
                                                (chessboard[srcRow-i][srcCol+i].chessPawn().equals("WHITE_BISHOP"))){
                                                    return true;
                                            }
                                            break;}                           
                                        }
                                    i++;
                                }while ((srcRow-i>=0)&&(srcCol+i<=7));
                            }                   
                    }
                    else if(srcCol==7){
                   //check left cells  
                        if(chessboard[srcRow][srcCol-1].pawnType() !='B'){
                            if(chessboard[srcRow][srcCol-1].chessPawn().equals("WHITE_KING")){return true;}
                            for(int i=srcCol-1;i>=0; i--){
                                char c = chessboard[srcRow][i].pawnType();
                                switch(c){
                                    case 'B':break;
                                    case 'W':
                                        if((chessboard[srcRow][i].chessPawn().equals("WHITE_QUEEN"))||(chessboard[srcRow][i].chessPawn().equals("WHITE_ROOK"))){
                                            return true;
                                        }
                                        break;                                 
                                }
                             }
                        }

        //check bottom cells  
                        if(chessboard[srcRow+1][srcCol].pawnType() !='B'){
                            if(chessboard[srcRow+1][srcCol].chessPawn().equals("WHITE_KING")){return true;}
                            for(int i=srcRow+1;i<=7; i++){
                                char c = chessboard[i][srcCol].pawnType();
                                switch(c){
                                    case 'B':break;
                                    case 'W':
                                        if((chessboard[srcRow][i].chessPawn().equals("WHITE_QUEEN"))||(chessboard[srcRow][i].chessPawn().equals("WHITE_ROOK"))){
                                            return true;
                                        }
                                        break;                                 
                                }
                             }
                            }
        
        //check bottom left cells  
                        if(chessboard[srcRow+1][srcCol-1].pawnType() !='B'){
                            if(chessboard[srcRow+1][srcCol-1].chessPawn().equals("WHITE_PAWN")||chessboard[srcRow+1][srcCol-1].chessPawn().equals("WHITE_KING"))
                            {return true;}
                            int i=1;
                            do{
                                char c = chessboard[srcRow+i][srcCol-i].pawnType();
                                //System.out.println("row="+(srcRow+i)+",Col="+(srcCol-i)+",Type="+c+",Pawn="+chessboard[srcRow+i][srcCol-i].chessPawn());
                                switch(c){
                                    case 'B':break;
                                    case 'W':{
                                            if((chessboard[srcRow+i][srcCol-i].chessPawn().equals("WHITE_QUEEN"))||
                                            (chessboard[srcRow+i][srcCol-i].chessPawn().equals("WHITE_BISHOP"))){
                                                return true;
                                        }
                                        break;}                           
                                    }
                                i++;
                            }while ((srcRow+i<=7)&&(srcCol-i>=0)); 
                         }
        
        //check top cells  
                         if(chessboard[srcRow-1][srcCol].pawnType() !='B'){
                              if(chessboard[srcRow-1][srcCol].chessPawn().equals("WHITE_KING")){return true;}
                             for(int i=srcRow-1;i>=0; i--){
                                char c = chessboard[i][srcCol].pawnType();
                                switch(c){
                                    case 'B':break;
                                    case 'W':
                                        if((chessboard[i][srcCol].chessPawn().equals("WHITE_QUEEN"))||(chessboard[i][srcCol].chessPawn().equals("WHITE_ROOK"))){
                                            return true;
                                        }
                                        break;                                 
                                }
                             }
                         }
        
        //check top left cells 
                         if(chessboard[srcRow-1][srcCol-1].pawnType() !='B'){
                             if(chessboard[srcRow-1][srcCol-1].chessPawn().equals("WHITE_PAWN")||chessboard[srcRow-1][srcCol-1].chessPawn().equals("WHITE_KING"))
                             {return true;}
                                int i=1;
                                do{
                                    char c = chessboard[srcRow-i][srcCol-i].pawnType();
                                    //System.out.println("row="+(srcRow-i)+",Col="+(srcCol-i)+",Type="+c+",Pawn="+chessboard[srcRow-i][srcCol-i].chessPawn());
                                    switch(c){
                                        case 'B':break;
                                        case 'W':{
                                                if((chessboard[srcRow-i][srcCol-i].chessPawn().equals("WHITE_QUEEN"))||
                                                (chessboard[srcRow-i][srcCol-i].chessPawn().equals("WHITE_BISHOP"))){
                                                    return true;
                                            }
                                            break;}                           
                                        }
                                    i++;
                                }while ((srcRow-i>=0)&&(srcCol-i>=0));
                         }       
                    }
                }
                else if(srcRow==0){     
                //check 5 possible directions 
                    if ((srcCol>0)&&(srcCol<7)){
                    //Check in all 5 directions for a threat to king
                    //check left cells 
                    if(chessboard[srcRow][srcCol-1].pawnType() !='B'){
                        if(chessboard[srcRow][srcCol-1].chessPawn().equals("WHITE_KING")){return true;}
                        for(int i=srcCol-1;i>=0; i--){
                            char c = chessboard[srcRow][i].pawnType();
                            switch(c){
                                case 'B':break;
                                case 'W':
                                    if((chessboard[srcRow][i].chessPawn().equals("WHITE_QUEEN"))||(chessboard[srcRow][i].chessPawn().equals("WHITE_ROOK"))){
                                        return true;
                                    }
                                    break;                                 
                            }
                         }
                     }
        //check right cells                     
                    if(chessboard[srcRow][srcCol+1].pawnType() !='B'){
                        if(chessboard[srcRow][srcCol+1].chessPawn().equals("WHITE_KING")){return true;}
                     for(int i=srcCol+1;i<=7; i++){
                            char c = chessboard[srcRow][i].pawnType();
                            switch(c){
                                case 'B':break;
                                case 'W':
                                    if((chessboard[srcRow][i].chessPawn().equals("WHITE_QUEEN"))||(chessboard[srcRow][i].chessPawn().equals("WHITE_ROOK"))){
                                        return true;
                                    }
                                    break;                                 
                            }
                         }
                    }        
        //check right cells 
                    if(chessboard[srcRow+1][srcCol-1].pawnType() !='B'){
                     if(chessboard[srcRow+1][srcCol-1].chessPawn().equals("WHITE_PAWN")||chessboard[srcRow+1][srcCol-1].chessPawn().equals("WHITE_KING"))
                     {return true;}
                     int i=1;
                        do{
                            char c = chessboard[srcRow+i][srcCol-i].pawnType();
                           // System.out.println("row="+(srcRow+i)+",Col="+(srcCol-i)+",Type="+c+",Pawn="+chessboard[srcRow+i][srcCol-i].chessPawn());
                            switch(c){
                                case 'B':break;
                                case 'W':{
                                        if((chessboard[srcRow+i][srcCol-i].chessPawn().equals("WHITE_QUEEN"))||
                                        (chessboard[srcRow+i][srcCol-i].chessPawn().equals("WHITE_BISHOP"))){
                                            return true;
                                    }
                                    break;}                           
                                }
                            i++;
                        }while ((srcRow+i<=7)&&(srcCol-i>=0)); 
                    }  
                    if(chessboard[srcRow+1][srcCol].pawnType() !='B'){
                        if(chessboard[srcRow+1][srcCol].chessPawn().equals("WHITE_KING")){return true;}
                        for(int i=srcRow+1;i<=7; i++){
                            char c = chessboard[i][srcCol].pawnType();
                            switch(c){
                                case 'B':break;
                                case 'W':
                                    if((chessboard[srcRow][i].chessPawn().equals("WHITE_QUEEN"))||(chessboard[srcRow][i].chessPawn().equals("WHITE_ROOK"))){
                                        return true;
                                    }
                                    break;                                 
                            }
                         }
                        }
                    if(chessboard[srcRow+1][srcCol+1].pawnType() !='B'){
                     if(chessboard[srcRow+1][srcCol+1].chessPawn().equals("WHITE_PAWN")||chessboard[srcRow+1][srcCol+1].chessPawn().equals("WHITE_KING"))
                        { return true;}
                            int i=1;
                            do{
                                char c = chessboard[srcRow+i][srcCol+i].pawnType();
                                //System.out.println("row="+(srcRow+i)+",Col="+(srcCol+i)+",Type="+c+",Pawn="+chessboard[srcRow+i][srcCol+i].chessPawn());
                                switch(c){
                                    case 'B':break;
                                    case 'W':{
                                            if((chessboard[srcRow+i][srcCol+i].chessPawn().equals("WHITE_QUEEN"))||
                                            (chessboard[srcRow+i][srcCol+i].chessPawn().equals("WHITE_BISHOP"))){
                                                return true;
                                        }
                                        break;}                           
                                    }
                                i++;
                            }while ((srcRow+i<=7)&&(srcCol+i<=7));  
                    }
                }
                else if(srcCol==0){
                    //check in 3 directions possible
                    if(chessboard[srcRow][srcCol+1].pawnType() !='B'){
                        if(chessboard[srcRow][srcCol+1].chessPawn().equals("WHITE_KING")){return true;}
                        for(int i=srcCol+1;i<=7; i++){
                            char c = chessboard[srcRow][i].pawnType();
                            switch(c){
                                case 'B':break;
                                case 'W':
                                    if((chessboard[srcRow][i].chessPawn().equals("WHITE_QUEEN"))||(chessboard[srcRow][i].chessPawn().equals("WHITE_ROOK"))){
                                        return true;
                                    }
                                    break;                                 
                            }
                         }
                      }  
                      if(chessboard[srcRow+1][srcCol].pawnType() !='B'){
                          if(chessboard[srcRow+1][srcCol].chessPawn().equals("WHITE_KING")){return true;}
                        for(int i=srcRow+1;i<=7; i++){
                            char c = chessboard[i][srcCol].pawnType();
                            switch(c){
                                case 'B':break;
                                case 'W':
                                    if((chessboard[i][srcCol].chessPawn().equals("WHITE_QUEEN"))||(chessboard[i][srcCol].chessPawn().equals("WHITE_ROOK"))){
                                        return true;
                                    }
                                    break;                                 
                            }
                         }
                        }
                        if(chessboard[srcRow+1][srcCol+1].pawnType() !='B'){
                          if(chessboard[srcRow+1][srcCol+1].chessPawn().equals("WHITE_PAWN")||chessboard[srcRow+1][srcCol+1].chessPawn().equals("WHITE_KING"))
                          {return true;}
                            int i=1;
                            do{
                                char c = chessboard[srcRow+i][srcCol+i].pawnType();
                                //System.out.println("row="+(srcRow+i)+",Col="+(srcCol+i)+",Type="+c+",Pawn="+chessboard[srcRow+i][srcCol+i].chessPawn());
                                switch(c){
                                    case 'B':break;
                                    case 'W':{
                                            if((chessboard[srcRow+i][srcCol+i].chessPawn().equals("WHITE_QUEEN"))||
                                            (chessboard[srcRow+i][srcCol+i].chessPawn().equals("WHITE_BISHOP"))){
                                                return true;
                                        }
                                        break;}                           
                                    }
                                i++;
                            }while ((srcRow+i<=7)&&(srcCol+i<=7));  
                        }  
                }
                else if(srcCol==7){
                    if(chessboard[srcRow][srcCol-1].pawnType() !='B'){
                        if(chessboard[srcRow][srcCol-1].chessPawn().equals("WHITE_KING")){return true;}
                        for(int i=srcCol-1;i>=0; i--){
                            char c = chessboard[srcRow][i].pawnType();
                            switch(c){
                                case 'B':break;
                                case 'W':
                                    if((chessboard[srcRow][i].chessPawn().equals("WHITE_QUEEN"))||(chessboard[srcRow][i].chessPawn().equals("WHITE_ROOK"))){
                                        return true;
                                    }
                                    break;                                 
                            }
                         }
                     }
                     if(chessboard[srcRow+1][srcCol].pawnType() !='B'){
                        if(chessboard[srcRow+1][srcCol].chessPawn().equals("WHITE_KING")){return true;}
                        for(int i=srcRow+1;i<=7; i++){
                            char c = chessboard[i][srcCol].pawnType();
                            switch(c){
                                case 'B':break;
                                case 'W':
                                    if((chessboard[i][srcCol].chessPawn().equals("WHITE_QUEEN"))||(chessboard[i][srcCol].chessPawn().equals("WHITE_ROOK"))){
                                        return true;
                                    }
                                    break;                                 
                            }
                         }
                     }
                     if(chessboard[srcRow+1][srcCol-1].pawnType() !='B'){
                        if(chessboard[srcRow+1][srcCol-1].chessPawn().equals("WHITE_PAWN")||chessboard[srcRow+1][srcCol-1].chessPawn().equals("WHITE_KING"))
                        {return true;}

                        int i=1;
                        do{
                            char c = chessboard[srcRow+i][srcCol-i].pawnType();
                           // System.out.println("row="+(srcRow+i)+",Col="+(srcCol-i)+",Type="+c+",Pawn="+chessboard[srcRow+i][srcCol-i].chessPawn());
                            switch(c){
                                case 'B':break;
                                case 'W':{
                                        if((chessboard[srcRow+i][srcCol-i].chessPawn().equals("WHITE_QUEEN"))||
                                        (chessboard[srcRow+i][srcCol-i].chessPawn().equals("WHITE_BISHOP"))){
                                            return true;
                                    }
                                    break;}                           
                                }
                            i++;
                        }while ((srcRow+i<=7)&&(srcCol-i>=0)); 
                     }
                }
            }  
				else if(srcRow==7){
                if ((srcCol>0)&&(srcCol<7)){
                    //Check in all 5 directions for a threat to king
                    if(chessboard[srcRow][srcCol-1].pawnType() !='B'){
                        if(chessboard[srcRow][srcCol-1].chessPawn().equals("WHITE_KING")){return true;}
                    
                        for(int i=srcCol-1;i>=0; i--){
                            char c = chessboard[srcRow][i].pawnType();
                            switch(c){
                                case 'B':break;
                                case 'W':
                                    if((chessboard[srcRow][i].chessPawn().equals("WHITE_QUEEN"))||(chessboard[srcRow][i].chessPawn().equals("WHITE_ROOK"))){
                                        return true;
                                    }
                                    break;                                 
                            }
                         }
                     
                    }
                    if(chessboard[srcRow][srcCol+1].pawnType() !='B'){
                        if(chessboard[srcRow][srcCol+1].chessPawn().equals("WHITE_KING")){return true;}
                    
                        for(int i=srcCol+1;i<=7; i++){
                            char c = chessboard[srcRow][i].pawnType();
                            switch(c){
                                case 'B':break;
                                case 'W':
                                    if((chessboard[srcRow][i].chessPawn().equals("WHITE_QUEEN"))||(chessboard[srcRow][i].chessPawn().equals("WHITE_ROOK"))){
                                        return true;
                                    }
                                    break;                                 
                            }
                         }
                        }               
                    if(chessboard[srcRow-1][srcCol-1].pawnType() !='B'){
                        if(chessboard[srcRow-1][srcCol-1].chessPawn().equals("WHITE_PAWN")||chessboard[srcRow-1][srcCol-1].chessPawn().equals("WHITE_KING"))
                            {return true;}
                            int i=1;
                            do{
                                char c = chessboard[srcRow-i][srcCol-i].pawnType();
                                //System.out.println("row="+(srcRow-i)+",Col="+(srcCol-i)+",Type="+c+",Pawn="+chessboard[srcRow-i][srcCol-i].chessPawn());
                                switch(c){
                                    case 'B':break;
                                    case 'W':{
                                            if((chessboard[srcRow-i][srcCol-i].chessPawn().equals("WHITE_QUEEN"))||
                                            (chessboard[srcRow-i][srcCol-i].chessPawn().equals("WHITE_BISHOP"))){
                                                return true;
                                        }
                                        break;}                           
                                    }
                                i++;
                            }while ((srcRow-i>=0)&&(srcCol-i>=0));

                    }  
                    //check for north direction 
                    if(chessboard[srcRow-1][srcCol].pawnType() !='B'){
                        if(chessboard[srcRow-1][srcCol].chessPawn().equals("WHITE_KING")){return true;}
                        //System.out.println("Check1:");
                        for(int i=srcRow-1;i>=0; i--){
                            char c = chessboard[i][srcCol].pawnType();
                            switch(c){
                                case 'B':break;
                                case 'W':
                                    if((chessboard[i][srcCol].chessPawn().equals("WHITE_QUEEN"))||(chessboard[i][srcCol].chessPawn().equals("WHITE_ROOK"))){
                                        return true;
                                    }
                                    break;                                 
                            }
                         }
                    }
                        
                    if(chessboard[srcRow-1][srcCol+1].pawnType() !='B'){
                        if(chessboard[srcRow-1][srcCol+1].chessPawn().equals("WHITE_PAWN")||chessboard[srcRow-1][srcCol+1].chessPawn().equals("WHITE_KING"))
                        {return true;}
                        int i=1;
                        do{
                            char c = chessboard[srcRow-i][srcCol+i].pawnType();
                           // System.out.println("row="+(srcRow-i)+",Col="+(srcCol+i)+",Type="+c+",Pawn="+chessboard[srcRow-i][srcCol+i].chessPawn());
                            switch(c){
                                case 'B':break;
                                case 'W':{
                                        if((chessboard[srcRow-i][srcCol+i].chessPawn().equals("WHITE_QUEEN"))||
                                        (chessboard[srcRow-i][srcCol+i].chessPawn().equals("WHITE_BISHOP"))){
                                            return true;
                                    }
                                    break;}                           
                                }
                            i++;
                        }while ((srcRow-i>=0)&&(srcCol+i<=7));
                    }
                }
                else if(srcCol==0){
                    //check in 3 directions possible
                    if(chessboard[srcRow-1][srcCol].pawnType() !='B'){
                         if(chessboard[srcRow-1][srcCol].chessPawn().equals("WHITE_KING")){return true;}
                         for(int i=srcRow-1;i>=0; i--){
                            char c = chessboard[i][srcCol].pawnType();
                            switch(c){
                                case 'B':break;
                                case 'W':
                                    if((chessboard[i][srcCol].chessPawn().equals("WHITE_QUEEN"))||(chessboard[i][srcCol].chessPawn().equals("WHITE_ROOK"))){
                                        return true;
                                    }
                                    break;                                 
                            }
                         }
                        }
                        if(chessboard[srcRow][srcCol+1].pawnType() !='B'){
                            if(chessboard[srcRow][srcCol+1].chessPawn().equals("WHITE_KING")){return true;}
                        for(int i=srcCol+1;i<=7; i++){
                            char c = chessboard[srcRow][i].pawnType();
                            switch(c){
                                case 'B':break;
                                case 'W':
                                    if((chessboard[srcRow][i].chessPawn().equals("WHITE_QUEEN"))||(chessboard[srcRow][i].chessPawn().equals("WHITE_ROOK"))){
                                        return true;
                                    }
                                    break;                                 
                            }
                         }
                      }  
                      if(chessboard[srcRow-1][srcCol+1].pawnType() !='B'){
                        if(chessboard[srcRow-1][srcCol+1].chessPawn().equals("WHITE_PAWN")||chessboard[srcRow-1][srcCol+1].chessPawn().equals("WHITE_KING"))
                        {return true;}
                        int i=1;
                        do{
                            char c = chessboard[srcRow+i][srcCol-i].pawnType();
                           // System.out.println("row="+(srcRow+i)+",Col="+(srcCol-i)+",Type="+c+",Pawn="+chessboard[srcRow+i][srcCol-i].chessPawn());
                            switch(c){
                                case 'B':break;
                                case 'W':{
                                        if((chessboard[srcRow+i][srcCol-i].chessPawn().equals("WHITE_QUEEN"))||
                                        (chessboard[srcRow+i][srcCol-i].chessPawn().equals("WHITE_BISHOP"))){
                                            return true;
                                    }
                                    break;}                           
                                }
                            i++;
                        }while ((srcRow+i<=7)&&(srcCol-i>=0)); 

                    }            
                      
                }
                else if(srcCol==7){
                     if(chessboard[srcRow-1][srcCol].pawnType() !='B'){
                         if(chessboard[srcRow-1][srcCol].chessPawn().equals("WHITE_KING")){return true;}
                         for(int i=srcRow-1;i>=0; i--){
                            char c = chessboard[i][srcCol].pawnType();
                            switch(c){
                                case 'B':break;
                                case 'W':
                                    if((chessboard[i][srcCol].chessPawn().equals("WHITE_QUEEN"))||(chessboard[i][srcCol].chessPawn().equals("WHITE_ROOK"))){
                                        return true;
                                    }
                                    break;                                 
                            }
                         }
                        }
                      if(chessboard[srcRow][srcCol-1].pawnType() !='B'){
                          if(chessboard[srcRow][srcCol-1].chessPawn().equals("WHITE_KING")){return true;}
                        for(int i=srcCol-1;i>=0; i--){
                            char c = chessboard[srcRow][i].pawnType();
                            switch(c){
                                case 'B':break;
                                case 'W':
                                    if((chessboard[srcRow][i].chessPawn().equals("WHITE_QUEEN"))||(chessboard[srcRow][i].chessPawn().equals("WHITE_ROOK"))){
                                        return true;
                                    }
                                    break;                                 
                            }
                         }
                      } 
                        if(chessboard[srcRow-1][srcCol-1].pawnType() !='B'){
                         if(chessboard[srcRow-1][srcCol-1].chessPawn().equals("WHITE_PAWN")||chessboard[srcRow-1][srcCol-1].chessPawn().equals("WHITE_KING"))
                         {return true;}
                            int i=1;
                            do{
                                char c = chessboard[srcRow-i][srcCol-i].pawnType();
                                //System.out.println("row="+(srcRow-i)+",Col="+(srcCol-i)+",Type="+c+",Pawn="+chessboard[srcRow-i][srcCol-i].chessPawn());
                                switch(c){
                                    case 'B':break;
                                    case 'W':{
                                            if((chessboard[srcRow-i][srcCol-i].chessPawn().equals("WHITE_QUEEN"))||
                                            (chessboard[srcRow-i][srcCol-i].chessPawn().equals("WHITE_BISHOP"))){
                                                return true;
                                        }
                                        break;}                           
                                    }
                                i++;
                            }while ((srcRow-i>=0)&&(srcCol-i>=0));

                      }
                }
            }
            //check attack by knight
            if((srcRow+2 <= 7)&&(srcCol+1 <= 7)){
                if(chessboard[srcRow+2][srcCol+1].chessPawn().equals("WHITE_KNIGHT")){return true;}
            }
            if((srcRow+2 <= 7)&&(srcCol-1 >= 0)){
                if(chessboard[srcRow+2][srcCol-1].chessPawn().equals("WHITE_KNIGHT")){return true;}
            }           
            if((srcRow-2 >= 0)&&(srcCol+1 <= 7)){
                if(chessboard[srcRow-2][srcCol+1].chessPawn().equals("WHITE_KNIGHT")){return true;}
            }  
            if((srcRow-2 >= 0)&&(srcCol-1 >= 0)){
                if(chessboard[srcRow-2][srcCol-1].chessPawn().equals("WHITE_KNIGHT")){return true;}
            }             
            if((srcRow+1 <= 7)&&(srcCol+2 <= 7)){
                if(chessboard[srcRow+1][srcCol+2].chessPawn().equals("WHITE_KNIGHT")){return true;}
            }  
            if((srcRow+1 <= 7)&&(srcCol-2 >= 0)){
                if(chessboard[srcRow+1][srcCol-2].chessPawn().equals("WHITE_KNIGHT")){return true;}
            }            
            if((srcRow-1 >= 0)&&(srcCol+2 <= 7)){
                if(chessboard[srcRow-1][srcCol+2].chessPawn().equals("WHITE_KNIGHT")){return true;}
            }  
            if((srcRow-1 >= 0)&&(srcCol-2 >= 0)){
                if(chessboard[srcRow-1][srcCol-2].chessPawn().equals("WHITE_KNIGHT")){return true;}
            }             
            
            
            return false;
        }
    
}

