/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criba;

import java.util.Scanner;

/**
 *
 * @author omar_
 */
public class Criba {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Digite el valor N del intervalo a buscar primos [2,N]: ");
        int n=sc.nextInt();
        int Criba[]=new int[100];
        int primos[]=new int[100];
        int contPrimos=0;
        for (int i = 2; i <= n; i++) {
            Criba[i-2]=i;
        }
        n=n-3;
        while(contPrimos<n){
           primos[contPrimos]=Criba[0];
           Eliminar(Criba,primos[contPrimos],n);
           contPrimos++;
           n--;
        }
        for (int i = 0; i < contPrimos; i++) {
            System.out.print(primos[i]+"\t");
        }
        
    }

    private static void Eliminar(int[] Criba, int multiplo,int n) {
        int j=0;
        while(j<=n){
           if (Criba[j]%multiplo==0) {
               for (int i = j; i <=n; i++) {
                   Criba[i]=Criba[i+1];
               }
               n=n-1;               
            }
              j++; 
           
        } 
    }
}
