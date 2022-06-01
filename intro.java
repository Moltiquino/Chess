class intro 
        
    {   
        
        static void rocketStationary(){
                System.out.println("\t\t\t\t\t\t               |       ");
                System.out.println("\t\t\t\t\t\t              /-\\       ");
                System.out.println("\t\t\t\t\t\t             /---\\       ");
                System.out.println("\t\t\t\t\t\t            /-----\\       ");
                System.out.println("\t\t\t\t\t\t           | | M | |        ");
                System.out.println("\t\t\t\t\t\t           | | E | |      ");
                System.out.println("\t\t\t\t\t\t           |_| G |_|        "); 
                System.out.println("\t\t\t\t\t\t           |   H   |        ");
                System.out.println("\t\t\t\t\t\t           |   A   |        ");
                System.out.println("\t\t\t\t\t\t           |   V   |         ");
                System.out.println("\t\t\t\t\t\t           |   I   |        ");
                System.out.println("\t\t\t\t\t\t          /  _____  \\         ");
                System.out.println("\t\t\t\t\t\t         /  |_____|  \\         ");
                System.out.println("\t\t\t\t\t\t        |   |__@__|   |       ");
                System.out.println("\t\t\t\t\t\t        |   |_____|   |        ");
                System.out.println("\t\t\t\t\t\t        |    Sports   |        ");
                System.out.println("\t\t\t\t\t\t        |   Presents  |        ");
                System.out.println("\t\t\t\t\t\t        |_____________|       ");
             
            }
            
    	 static void rocketFlame(){
                 System.out.println("\t\t\t\t\t\t        ^^^^^^^^^^^^^^^       ");
                 System.out.println("\t\t\t\t\t\t        ^^^^^^^^^^^^^^^       ");
                 System.out.println("\t\t\t\t\t\t        ^^^^^^^^^^^^^^^       ");
                 
        }
    
        void main()throws Exception{    
            System.out.print("\n\n\n\n\n\n\n\n");
            intro.rocketStationary();
    	Thread.sleep(4000);
    	System.out.println("\t\t\tCOUNTDOWN :: THREE");
    	Thread.sleep(1000);
    	System.out.print("\u000C");
    	System.out.print("\n\n\n\n\n\n\n\n");
    	intro.rocketStationary();
    	System.out.println("\t\t\tCOUNTDOWN :: TWO ");
    	Thread.sleep(1000);
    	System.out.print("\u000C");
    	System.out.print("\n\n\n\n\n\n\n\n");
    	intro.rocketStationary();
    	System.out.println("\t\t\tCOUNTDOWN :: ONE ");
    	Thread.sleep(1000);
    	System.out.print("\u000C");
    	System.out.print("\n\n\n\n\n\n\n\n");
    	intro.rocketStationary();
    	System.out.println("\t\t\tLAUNCH");
    	
        for(int i=1;i<=8;i++){
        	Thread.sleep(1000);
        	System.out.print("\u000C");
        	for(int j=i;j<=8;j++){
        	    System.out.print("\n");
        	}   
        	intro.rocketStationary();
        	intro.rocketFlame();
        }
  	System.out.println("\u000C");
	System.out.println("\n\n\n\n\n");
        System.out.println("\t\t\t -------   ---   ------  ------   --    --   -----  --   --   -----  -----  -----  ");  
	System.out.println("\t\t\t    ||   ||   ||     //      //    \\\\ //    ||      ||   ||  ||     ||     ||      "); 
	System.out.println("\t\t\t    ||   ||   ||    //      //       ||     ||      ||---||  ||---    ----   ----  ");
	System.out.println("\t\t\t    ||   ||---||   //      //        ||     ||      ||   ||  ||          ||     || ");
	System.out.println("\t\t\t ___||   ||   ||   -----    ----     --      -----  --   --   -----  -----  -----  ");
        Thread.sleep(5000);
        System.out.println("\u000C");
        /*
        for(int i=1;i<=1;i++)
         { System.out.println("\n\n\n\n\t\t\t\t\t\t            LOADING");
            // System.out.print("\t\t\t");
            System.out.println("\n\n");
             for(int j=0;j<=128;j++)
             {
                 System.out.print(">");
                Thread.sleep(70);
                }
            System.out.println("\u000C");
            }*/
        //System.out.println("\u000C");
        }
    }
