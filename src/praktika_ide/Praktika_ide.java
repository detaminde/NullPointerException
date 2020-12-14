
package praktika_ide;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Praktika_ide {

    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String x = null;
        int xc;
        
        System.out.println("Введите число: ");
        x = reader.readLine();
        xc = Integer.parseInt(x);
        
        xc = factorial(xc);
        
        System.out.println("Факториал этого числа: "+ xc);
        
        System.out.println("Вы успешно изменили");
        
    }
    static int factorial(int x)
    {
        if(x == 1)
        {
            return 1;
        }
        return x*factorial(x-1);
    }
}
