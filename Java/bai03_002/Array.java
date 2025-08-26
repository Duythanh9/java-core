package Java.bai03_002;

public class Array {
    public static void main(String[] args) {
        //Mảng 1 chiều/ Java Dimenstion Arrays
        // int[] arr;
        // int[] arrB = new int[3];
        
        // long[] arrC = {1, 2, 5, 8};

        // arr = new int[]{1, 2, 3, 4};
        // arrB =  new String[]{"A", "B", "C", "D"};

        
        // System.out.println("Array arr");
        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);

        // }

        // System.out.println("Array arrB");
        // for(String s : arrB){
        //     System.out.println(s);
        // }

        // System.out.println("Array arrC");
        // for(int i = 0; i < arrC.length; i++){
        //     System.out.println(arrC[i]);
        // }

        //Mảng 2 chiều
        // int[][] arr = new int[3][3];

        // arr[0] [0] = 1;
        // arr[0] [1] = 2;
        // arr[0] [2] = 3;

        // arr[1] [0] = 4;
        // arr[1] [1] = 5;
        // arr[1] [2] = 6;

        // arr[2] [0] = 7;
        // arr[2] [1] = 8;
        // arr[2] [2] = 9;

        // System.out.println("Array mang 2 chieu");
        // for(int i = 0; i < 3; i++){
        //     for(int j = 0; j < 3; j++){
        //     System.out.println(arr[i][j]);
        //     }
        //     System.out.println();
        // }

        // int[][] arr2 = new int[][]{{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        // System.out.println("Array arr2");
        // for (int[] is : arr2) {
        //     for (int is2 : is) {
        //         System.out.println(is2);
        //     }
        //     System.out.println();
        // }

        // Mang rang cua
        // int[][] arr = new int[3][];
        // arr[0] = new int[3];
        // arr[1] = new int[5];
        // arr[2] = new int[2];

        // //Tao mang rang cua
        // int count = 0;
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = 0; j < arr[i].length; j++){
        //         arr[i][j] = count++;
        //     }
        // }
        // for(int[] a : arr){
        //     for(int ar : a){
        //         System.out.println(ar);
        //     }
        //     System.out.println();
        // }

        // //Clone Array
        // int[] originalArray = {1, 2, 3, 4, 5};
        // // Clone mảng
        // int[] cloneArray = originalArray.clone();

        // originalArray[0] = 100;// Thay đổi mảng gốc, nhưng mảng clone ko thay đổi
        // //In cả 2 mảng
        // System.out.println("Mang goc:");
        // for(int i : originalArray){
        //     System.out.println(i);
        // }
        
        // //In cả 2 mảng
        // System.out.println("Mang clone");
        // for(int i : cloneArray){
        //     System.out.println(i);
        // }

        // int[][] originalArray = new int[][]{
        //     {1, 2, 3},{4, 5, 6}, {7, 8, 9}
        // };
        // int[][] cloneMang = originalArray.clone(); 

        //  System.out.println("Mang goc 1");
        // for(int[] row : originalArray){
        //     for(int element : row){
        //         System.out.print(element);
        //     }
        //     System.out.println();
        // }
        // // Thay đổi giá trị trong mảng gốc
        // originalArray[0][0] = 101;

        // // In ra màn hình mảng gốc
        // System.out.println("Mang goc 2");
        // for(int[] row : originalArray){
        //     for(int element : row){
        //         System.out.println(element);
        //     }
        //     System.out.println();
        // }

        // // In mảng clone
        // System.out.println("mang clone");
        // for(int[] row : cloneMang){
        //     for(int elementClone : row){
        //         System.out.println(elementClone);
        //     }
        //     System.out.println();
        // }

         int[][] originalArray = new int[][]{
            {1, 2, 3},{4, 5, 6}, {7, 8, 9}
        };
        //Deep copy
        int[][] cloneArray = new int[originalArray.length][];
        for(int i = 0; i < originalArray.length; i++){
            cloneArray[i] = originalArray[i].clone(); 
        }
         System.out.println("Mang goc 1");
        for(int[] row : originalArray){
            for(int element : row){
                System.out.print(element);
            }
            System.out.println();
        }
        // Thay đổi giá trị trong mảng gốc
        originalArray[0][0] = 102;

        // In ra màn hình mảng gốc
        System.out.println("Mang goc 2");
        for(int[] row : originalArray){
            for(int element : row){
                System.out.println(element);
            }
            System.out.println();
        }

        // In mảng clone
        System.out.println("mang clone");
        for(int[] row : cloneArray){
            for(int elementClone : row){
                System.out.println(elementClone);
            }
            System.out.println();
        }
    }
}
