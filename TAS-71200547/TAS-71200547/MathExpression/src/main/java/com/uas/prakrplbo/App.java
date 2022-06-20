package com.uas.prakrplbo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MathExpression math = new MathExpression();
        System.out.println(math.TriplePythagoras(3, 4, 5));
        System.out.println(math.TriplePythagoras(1,2,3));
        System.out.println(math.pangkat(2,3));
        System.out.println(math.pangkat(5,4));
        System.out.println(math.pangkat(3,4));

    }
}
