/*
 *  implement the "paint fill" function. That is, given a screen(represented by a two-dimensional array of colors),
 *  a point and a new color, fill in the surrounding area until the color changes from the original color
 */
enum color{
	Black, White, Red, Yellow, Green
}
public class ci5_9_7 {
	public boolean paintFill(color[][] screen, int x, int y, color newColor){
		if(screen[x][y] == newColor){
			return false;
		}
		return paintFillHelper(screen, x, y, screen[x][y], newColor);
	}
	public boolean paintFillHelper(color[][] screen, int x, int y, color oldColor, color newColor){
		if(x < 0 || x >= screen.length || y < 0 || y >= screen[0].length){
			return false;
		}
		if(screen[x][y] == newColor){
			return false;
		}
		else{
			screen[x][y] = newColor;
			paintFillHelper(screen,x-1, y, oldColor, newColor);
			paintFillHelper(screen, x, y-1, oldColor, newColor);
			paintFillHelper(screen,x+1, y, oldColor, newColor);
			paintFillHelper(screen,x, y+1, oldColor, newColor);
		}
		return true;
	}
    public static void main(String[] args){
    	System.out.print(color.Black);
    	
    }
}
