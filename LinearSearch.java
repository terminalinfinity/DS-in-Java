package dsa;

import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int a[]={11,22,33,44,55,66,77,88,99};
        int found=0,i,search;
        
        Scanner sc = new Scanner(System.in);
        search = sc.nextInt();
        
        for(i=0;i<9;i++)
            if(a[i]==search){
                System.out.println(search+" is founded by address "+i);
                found++;
                break;
            }
        if(found==0){
            System.out.println(search+" is not founded!!");
        }
    }
}