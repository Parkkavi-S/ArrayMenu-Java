import java.util.*;
class Array{
    public static int n;
    public static int[] arr;
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int E_flag=0;
        System.out.println("Enter the size of the array:");
         n = input.nextInt();
         arr = new int[n];

        for (int i=0;i<n;i=i+1){
        System.out.println("Enter the elements:");
        arr[i]=input.nextInt();
        }
        
        while ( E_flag != 1){
            //menu
            System.out.println("\n=====Menu=====\n");
            System.out.println("1.Print element");
            System.out.println("2.Max and Min element");
            System.out.println("3.Sum of elements");
            System.out.println("4.Search an element");
            System.out.println("5.Reverse of array");
            System.out.println("6.Count of even and odd numbers");
            System.out.println("7.Exit\n");
            
            System.out.println("Enter your choice(1-6):");
            int choice = input.nextInt();
            
            switch (choice){
                
                case 1:
                    for (int i=0;i<n;i=i+1){
                        System.out.println("\n arr["+i+"] -> "+arr[i]);
                    }
                    break;

                case 2:
                    if ( arr!= null){
                    // Maximum 
                    int max=arr[0];
                        for (int i=1;i<n;i=i+1){
                            if ( max<arr[i] ){
                                max=arr[i];
                            }
                        }
                        System.out.println("\nMaximum number of the array:"+max);
                    //minimum element
                    int min=arr[0];
                        for (int i=1;i<n;i=i+1){
                            if ( min>arr[i] ){
                                min=arr[i];
                            }
                        }
                        System.out.println("Minimum number of the array:"+min);
                        }
                    break;

                case 3:

                    //sum of elements
                    int sum=0;
                        for (int i=0;i<n;i=i+1){
                            sum=sum+arr[i];
                        }
                        System.out.println("\nSum of elements:"+sum);
                    break;

                case 4:

                    //search of an element
                    System.out.println("\nEnter element you want to search:");
                    int search=input.nextInt();
                    boolean flag = false;
                    for (int i=0;i<n;i=i+1){
                        if ( search == arr[i]){
                            System.out.println("Element "+search+" found at index "+i);
                            flag= true;
                        }
                    }if (flag == false){
                            System.out.println("Element not found");
                    }
                    break;

                case 5:

                    //reverse an array
                    System.out.println("\nReverse of the array");
                    for (int i=arr.length-1 ; i>=0 ;i=i-1){
                            System.out.println(arr[i]);
                        }
                    break;

                case 6:

                    //count even and odd numbers
                    int even=0;
                    int odd=0;
                        for (int i=0;i<n;i=i+1){
                            if ( arr[i] % 2==0){
                                even=even+1;
                            }
                            else{
                                odd=odd+1;
                            }
                        }
                        System.out.println("\nCount of even numbers:"+even);
                        System.out.println("Count of odd numbers:"+odd);
                    break;

                case 7:
                    System.out.println("=====Exit=====");
                    E_flag=1;
                    break;
                
                default:
                    System.out.println("Enter valid input(1-6).");

            }
        }
        input.close();

     }
}