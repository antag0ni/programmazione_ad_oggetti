/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdebugger;

/**
 *
 * @author antagoni
 */
public class TestDebugger {

    static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++)
            f *= i;
        return f;
    }

    public static void main(String[] args) {
        int n = 20;
        int f = factorial(n);

        System.out.println("The Factorial of " + n + " is " + f);
    }
    
}
