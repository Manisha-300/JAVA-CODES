class Arrays1{

    //video 18 dsa and java arrays 
 void mutiArrays()
 {
   // int [][]arr_1=new int [3][4];
    int [][]arr_2={{3,5,2,1},{4,5,6,7},{8,9,4,2}};
    System.out.println(arr_2[1][2]);

    //arr[0]=array ,arr[0][2]
    System.out.println(arr_2[0][0]);//3
    System.out.println(arr_2[0][1]);//5
    System.out.println(arr_2[0][2]);//2
    
 }

    void demoArrays(){
        int [] age =new int [3];
        float[] weights= new float[4];
        String []name=new String[3];
        age[0]=32;
        age[1]=24;
        age[2]=45;
        name[0]="simran";
        weights[0]=45.5f;
          //age[5]=34; array index out of bound execption
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(name[0]);
        System.out.println(weights[0]);
    }
               public static void main(String args[]){
               // directly defining and intialising an array
              // int arr[]={3,55,21,54,23} ;
               //accessing elements in single dimensional array
              
               Arrays1 obj=new Arrays1();
                obj.mutiArrays();
               obj.demoArrays();
          //     output of the code 
// 6
// 3
// 5
// 2
// 32
// 24
// 45
// simran
// 45.5
             
}
}