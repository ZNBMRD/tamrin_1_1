package tamrin_1_1;
import java.util.Scanner;
public class TAMRIN_1_1 {
    public static void main(String[] args) {
        int[] array1=new int[4];
        int[] array2=new int[4];
        int[] array3=new int[4];
        int x=3,y=3,z=3;
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the first polynomial : ...");
        for(int i=0;i<4;i++){
            array1[i]=input.nextInt();
        }
        System.out.print("first polynomial : ");
        if(array1[0]>0 || array1[0]<0){
                System.out.print(array1[0] + "x^" + x);
            }
            x--;
        for(int i=1;i<3;i++){
            if(array1[i]>0){
                System.out.print("+" + array1[i] + "x^" + x);
            }
            if(array1[i]<0){
                System.out.print(array1[i] + "x^" + x);
            }
            x--;
        }
        if(array1[3]>0){
                System.out.print("+" + array1[3]);
            }
        if(array1[3]<0){
            System.out.print(array1[3]);
        }
        System.out.println("");
        System.out.println("please enter a second polynomial : ...");
        for(int i=0;i<4;i++){
            array2[i]=input.nextInt();
        }
        System.out.print("second polynomial : ");
        if(array2[0]>0 || array2[0]<0){
                System.out.print(array2[0] + "x^" + y);
            }
            y--;
        for(int i=1;i<3;i++){
            if(array2[i]>0){
                System.out.print("+" + array2[i] + "x^" + y);
            }
            if(array2[i]<0){
                System.out.print(array2[i] + "x^" + y);
            }
            y--;
        }
        if(array2[3]>0){
                System.out.print("+" + array2[3]);
            }
        if(array2[3]<0){
            System.out.print(array2[3]);
        }
        System.out.println("");
        System.out.println("*******************************************");
        for(int i=0;i<4;i++){
            array3[i] = array1[i] + array2[i];
        }
        System.out.print("sum : ");
        for(int i=0;i<4;i++){
            System.out.print(array3[i] + " ");
        }
        System.out.print("... ");
        if(array3[0]>0 || array3[0]<0){
                System.out.print(array3[0] + "x^" + z);
            }
            z--;
        for(int i=1;i<3;i++){
            if(array3[i]>0){
                System.out.print("+" + array3[i] + "x^" + z);
            }
            if(array3[i]<0){
                System.out.print(array3[i] + "x^" + z);
            }
            z--;
        }
        if(array3[3]>0){
                System.out.print("+" + array3[3]);
            }
        if(array3[3]<0){
            System.out.print(array3[3]);
        }
        System.out.println("");
    }
}
