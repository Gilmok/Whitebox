class A
{
    public void normal()
    {
        a = b;
        c = d;
        if(x == 1)
           y = 1;
        else
           y = 2;
        {
           e = f;
        }
        return g;
    }


    public void camelTry()
    {
        try
        {
            x = 5;
            y = 20;
        }
        catch(Exception ex)
        {
        }
    }

    public final void mHexLiteral() throws RecognitionException 
    {
        try 
	  {
            int _type = HexLiteral;
            // C:\\Users\\Aaron\\Desktop\\ANTLR\\grammars\\JavaDTree.g:772:12: ( '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )? )
            // C:\\Users\\Aaron\\Desktop\\ANTLR\\grammars\\JavaDTree.g:772:14: '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )?
            {
               match('0'); 
               if ( input.LA(1)=='X'||input.LA(1)=='x' ) 
               {
                 input.consume();
               }
               else 
               {
                 MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                 recover(mse);    
                 throw mse;
               }

               // C:\\Users\\Aaron\\Desktop\\ANTLR\\grammars\\JavaDTree.g:772:28: ( HexDigit )+
               int cnt1=0;
               loop1:
               do 
               {
                 int alt1=2;
                 int LA1_0 = input.LA(1);

                 if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')||(LA1_0>='a' && LA1_0<='f')) ) 
                 {
                    alt1=1;
                 }


                 switch (alt1) 
                 {
            	  case 1 :
            	    // C:\\Users\\Aaron\\Desktop\\ANTLR\\grammars\\JavaDTree.g:772:28: HexDigit
            	    {
            	       mHexDigit(); 
            	    }
            	    break;

            	  default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                  }
                  cnt1++;
               } while (true);

               // C:\\Users\\Aaron\\Desktop\\ANTLR\\grammars\\JavaDTree.g:772:38: ( IntegerTypeSuffix )?
               int alt2=2;
               int LA2_0 = input.LA(1);

               if ( (LA2_0=='L'||LA2_0=='l') ) 
               {
                  alt2=1;
               }
               switch (alt2) 
               {
                  case 1 :
                  // C:\\Users\\Aaron\\Desktop\\ANTLR\\grammars\\JavaDTree.g:772:38: IntegerTypeSuffix
                  {
                       mIntegerTypeSuffix(); 

                  }
                  break;
               }
            }
            this.type = _type;
        }
        finally 
        {
        }
    }
}
