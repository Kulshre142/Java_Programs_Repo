/*Write a java program to find all the leaders in an integer array. An element is
said to be a leader if all the elements on it’s right side are smaller than it.
Rightmost element is always a leader. For example, if {14, 9, 11, 7, 8, 5, 3} is
the given array then {14, 11, 8, 5, 3} are the leaders in this array*/

import java.util.*;
class leader_array{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.println("Enter size of array:");
int n= in.nextInt();
int arr[] =new int[n];
System.out.println("Enter array elements:");
for(int i=0; i<n;i++){
arr[i] = in.nextInt();
}

for (int i = 0; i < n; i++){
int j;
for (j = i + 1; j < n; j++){
if (arr[i] < arr[j])
break;
}
if (j == n)
System.out.print(arr[i] + " ");
}


}
}