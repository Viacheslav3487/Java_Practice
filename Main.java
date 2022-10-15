import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Эта программа посчитает количество елементов массиве которые больше чем среднее арифметическое елементов массива(работать будет 5 раз)
        for(int j = 0; j < 5;j++){
            int n = input.nextInt();
            int sum = 0;
            int[] a = new int[n];
            for(int i = 0; i< n; i++){
                a[i] = input.nextInt();
            }
            for(int i = 0; i< n; i++){
                sum += a[i];
            }
            int middle = sum / n;
            int cnt = 0;
            for(int i = 0; i< n; i++){
                if(a[i] > middle){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }

    }
}