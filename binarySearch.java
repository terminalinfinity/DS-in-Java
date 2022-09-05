package dsa;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        int a[]={5,10,15,20,15,30,35,40};
        int left=0,right=(8-1),found=0;
        
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        
        while(left<=right){
            int mid = (left+right)/2;
            if(a[mid]==search){
                System.out.println(search+" is found "+mid+" index.");
                found++;
                break;
            }
            else if(a[mid]<search){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        if(found==0){
            System.out.println(search+" is not found.");
        }
    }
}