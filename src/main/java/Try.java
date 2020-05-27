/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruona
 */
public class Try 
{

    public static void main (String[] args)
    {
            String[] cities = {"Toront","hamilton","Oakvile","Brampton"};
            System.out.println("First element= "+cities[0]);
            System.out.println("Second element= "+cities[3]);
             System.out.println("Length Variable= "+ cities.length);
              System.out.println(cities[cities.length-1]);
              for(int num=0; num<cities.length;num++)
              {
                   System.out.println("City " +num+ " is " +cities[num]);
              }
              int[] number = new int[5];
               System.out.println("numberlength= "+number.length);
             for(int num=0; num<number.length;num++)
             {
                 
               System.out.println(number[num]=num*2);
             
             }
             int index=0;
             while(index<number.length){
              System.out.println(number[index]);
              index++;
             }
              System.out.println("For Cities: "+cities);
               System.out.println("For Numbers: "+number);
             
             
    }
               
}
