import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CyclesTest {
	static String outFileName = "cycles4.dat";
	static PrintWriter out;
	public static void main(String[] args) throws FileNotFoundException {
		out = new PrintWriter (outFileName);
		int i;
		printStr("Testing for loop and printing to file");
		for (i=0;i<5;i++) {
			printStr("i=" + i);
		}
		printStr("Testing do while loop and printing to file");
		do {
			printStr("i=" + i);
			i--;
		} while (i>0);
		printStr("Testing while loop and printing to file");
		while(i<5) {
			printStr("i=" + i);
			i++;
		} ;
		out.close();
	}
	
	public static void printStr(String str) {
		System.out.println(str);
		out.println(str);
	}
	
}
