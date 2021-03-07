class ExMulti{

    public static void main(String[] args){

        int [][] arr1 = new int[3][3];
        int [][] arr2 = new int[3][];
        int [][] arr3 = new int[][]{{10,11},{12,13},{14,15,16}};
        int [][][] arr4 = {{{1,2,3},{4,5,6},{7,8,9}},{{10,11},{12,13},{14,15,16}}};

        for(int i=0 ; i < arr3.length ; i++){
            System.out.println("Tamanho do arr" + i + ": " + arr3[i].length);
            for(int j = 0 ; j < arr3[i].length ; j++){
                System.out.println(arr3[i][j]);
            }    
        }

        for(int[][] j1 : arr4){
            System.out.println();
            for(int[] j2: j1){                
                System.out.println();
                for(int j: j2)
                    System.out.println(j);
            }
        }

    }

}