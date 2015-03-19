import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        for (int m = 1; m <= n; m++) {
            
            int remove = 0;
            String s = br.readLine();
            ArrayList<String> strList = new ArrayList();
            
            for (int i = 0; i < s.length(); i++) {
                if (i == s.length() - 1)
                    break;
                
                if (s.charAt(i) == s.charAt(i + 1))
                    remove++;
            }
            
            System.out.println(remove);
        }
    }
}
