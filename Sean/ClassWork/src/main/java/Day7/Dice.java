package Day7;

public class Dice{
	
	private int sides;
	
	public Dice(){
		setSides( 6 );
	}

	public Dice( int s ){
		setSides( s );
	}
	
	public void setSides( int s ){
		if( s < 2 ){
			sides = 6;
		}else{
			sides = s;
		}
	}
	
	public void setSides( String s ){
		setSides( Integer.parseInt( s ) );
	}
	
	public int getSides(){
		return sides;
	}
	
	public int roll(){
		return (int)Math.floor( Math.random() * sides ) + 1;
	}

}