class LPU {
    public static void main(String args[]){
        // int arr[][] = new int[3][3];
        int arr[][] = {{1,2,3,9},{4,5,6,9},{7,8,9,9}, {1,4,6,3}};

        //Print all elements
        // for(int row = 0; row < arr.length; row++){
        //     for(int col = 0; col < arr[0].length; col++){
        //         System.out.print(arr[row][col] + " ");
        //     }
        //         System.out.println();
        // }

        //Print first and last row
        
        // for(int row = 0; row < arr.length; row++){
        //     for(int col = 0; col < arr[0].length; col++){
        //         if(row == 0 || row == arr.length-1){
        //             System.out.print(arr[row][col] + " ");
        //         }
        //     }
        //     System.out.println();
        // }


        //Print border elements
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[0].length; col++){
                if(row == 0 || row == arr.length-1 || col == 0 || col == arr[0].length - 1){
                    System.out.print(arr[row][col] + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


//swap the first row wih the last row of array
// replace all the negative elements of an array with 0
// find the maximum element in the array and print
// sum of each row in an array
