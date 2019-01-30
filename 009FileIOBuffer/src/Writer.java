import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Writer {
	public static void main(String[] srgs) throws FileNotFoundException {
		PrintWriter out = new PrintWriter("/home/compsci/eclipse-workspace/textfiles/output.txt");
		for (int i=0; i <= 10; i++) {
			out.println(i);
		}
		out.close();
	}
}
