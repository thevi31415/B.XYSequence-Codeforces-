/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b.xy.sequence;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class BXYSequence {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
 
        while (t > 0) {
            tinh();
            t = t - 1;
        }
    }
    public static void tinh() {
        int n =sc.nextInt();
        long B = sc.nextLong();
        long x = sc.nextInt();
        long y = sc.nextLong();
        long [] A = new long [n+1];
        A[0]=0;
        long S=0;
        for(int i =1; i<=n; i++){
            if(A[i-1]+x <= B){
                A[i] = A[i-1]+ x;
                
            }else{
                A[i] = A[i-1] - y;
            }
        }
        for(int i=0; i<=n; i++){
           S=S+A[i];
        }
        System.out.println(S);
        
 
    }
    public static int max(int a, int b){
        if(a <b){
            return b;
        }else{
            return a;
        }
    }
    public static int min(int a, int b){
        if(a > b){
            return b;
        }else{
            return a;
        }
    }
    
}
