package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] height = {1,8,6,2,5,4,8,3,7};
        Solution s = new Solution();
        System.out.println( "max container " + s.maxContainer(height) );
    }
}
