/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime_number;

/**
 *
 * @author Dil
 */
public class prime_class {
    public static void main (String[] args)
    {
        int i = 0, num = 0;
        String primeNumbers = "";
        
        for(i=1;i<=100;i++)
        {
            int c = 0;
            for(num =i; num>=1; num--)
            {
             if(i%num==0)
	     {
 		c++;
	     }
            }
            
            if(c==2)
            {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
    }
}
