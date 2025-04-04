package InputOutputPractice;
import java.io.*;
import java.util.*;
/* Simple practice for learning the use of input/output through
 * the use of BufferedReader and StringTokenizer. 
 */
public class input {
    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;
    
        public InputReader(InputStream stream){
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()){
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt(){
            return Integer.parseInt(next()); 
        }
        public long nextLong(){
            return Long.parseLong(next()); 
        }
        public double nextDouble(){
            return Double.parseDouble(next()); 
        }
}   
    static InputReader r = new InputReader(System.in);
    static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException{
        int a = r.nextInt();
        int b = r.nextInt();
        int c = r.nextInt();
        pw.println(a + b + c);
        pw.close();

    }
}
