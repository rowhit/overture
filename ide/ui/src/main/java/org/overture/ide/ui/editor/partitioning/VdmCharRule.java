package org.overture.ide.ui.editor.partitioning;


import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

	public class VdmCharRule implements IPredicateRule
	{
		private static final char QUOTE = '\'';
		private static final char BACK_SLASH = '\\';
		

		@Override
		public IToken evaluate(ICharacterScanner scanner)
		{
			return evaluate(scanner, true);
		}

		@Override
		public IToken getSuccessToken()
		{
			return new Token(IVdmPartitions.STRING);
		}
		
		@Override
		public IToken evaluate(ICharacterScanner scanner, boolean resume)
		{
			//Examples of chars '\uffff' , '\xff', 'a'
			int r = scanner.read();
			int reads = 1;
			
			if(r == ICharacterScanner.EOF && r != QUOTE)
			{
				resetScanner(scanner, reads);
				return Token.UNDEFINED;
			}
			
						
			if(r == QUOTE)
			{
				r = scanner.read();
				reads++;
				
				//Is the char using escape characters? Could be '\uffff' or '\xff'
				if(r == BACK_SLASH)
				{	
					if(isAcceptedEscapeSequence(scanner))
					{
						return getSuccessToken(); 
					}
				}
				else //The char is not using escape characters
				{	
					if(isValdChar(r))
					{
						r = scanner.read();
						reads++;
						
						if(r == QUOTE)
						{
							return getSuccessToken();
						}
					}
				}
			}
			
			resetScanner(scanner, reads);	
			return Token.UNDEFINED;
		}
		
		private void resetScanner(ICharacterScanner scanner, int unreads)
		{
			for(int i = 0; i < unreads; i++)
				scanner.unread();
		}
		
		private boolean isValdChar(int c)
		{
			return c != ICharacterScanner.EOF && c != '\n' && c != '\t' && c != '\r';
		}
		
		private boolean isAcceptedEscapeSequence(ICharacterScanner scanner)
		{
			int r;
			int reads = 0;
			do
			{
				
				r = scanner.read();
				reads++;
				
				if(r == QUOTE)
					return true;
				
			}
			//Keep it simple and assume the maximum char sequence
			while(isValdChar(r) && reads <= 5); 
			
			
			//Not a valid sequence so unread what has been read
			for(int i = 0; i < reads; i++)
				scanner.unread();
			
			return false;
		}
	}