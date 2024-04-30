import java.util.Scanner; 
import java.lang.Math.*;

public class TriangleRunner  //this class is used to test Triangle
{
	public static void main(String[] args) throws Exception{
		Triangle run = new Triangle();

		int selectchoice = run.selectchoice();

		if (selectchoice == 1){
			run.areatrianglemath();
		}

	}
}