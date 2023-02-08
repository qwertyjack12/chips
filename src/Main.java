import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 37 (33)	47	107	117	147	207	247	287	347	393	399	427
public class Main {

    public static double[] z_33(double X, double A, double Y) {
        double[] answer = new double[2];
        answer[0] = A / X;
        answer[1] = Y * answer[0];
        return answer;
    }

    public static int z_47(double a, double b) {
        if (b < a)
            return 1;
        return 0;
    }

    public static double z_107(int N) {
        double total = 0;
        for (int i = 1; i <= N; i++) {
            total += i * i;
        }
        return total;
    }

    public static int z_117(int N) {
        int i = 0;
        while (i * i <= N) {
            i++;
        }
        return i;
    }

    public static int[] z_147(int[] arr) {
        int N, max, min, i_max, i_min;
        int[] result = new int[2];
        N = arr.length;
        max = arr[0];
        min = arr[0];
        i_max = 0;
        i_min = 0;
        for (int i = 0; i < N; i++) {
            int element = arr[i];
            if (element > max) {
                max = element;
                i_max = i;
            } else if (element <= min) {
                min = element;
                i_min = i;
            }
        }
        result[0] = i_max;
        result[1] = i_min;
        return result;
    }

    public static int z_207(int[] arr) {
        int total = 0;
        boolean flag = false;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] >= arr[i - 1]) && (!flag)) {
                total += 1;
                flag = true;
            } else if (arr[i] < arr[i - 1]) {
                flag = false;
            }
        }
        return total;
    }

    public static double[] z_247(double[] brr) {
        double[] arr = brr.clone();
        for (int i = 1; i < brr.length - 1; i++) {
            if ((brr[i] < brr[i - 1]) && (brr[i] < brr[i + 1])) {
                double el = arr[i];
                arr[i] = el * el;
            }
        }
        return arr;
    }

    public static void z_287(Integer[] arr){
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        int total_index = 0;
        ArrayList<Integer> list_index = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0){
                list_index.add(i);
                continue;
            }
            if (arr[i] != arr[i-1]){
                list_index.add(i);
            }
        }
        for (int i = 0; i < list_index.size(); i++) {
            list.add(list_index.get(i) + total_index, 0);
            total_index += 1;
        }
        System.out.printf(list.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        -----------------------------------------------------------------------------
        стоимость 1кг и Y=10кг
         */
        System.out.println(Arrays.toString(z_33(5., 200., 10.)));    //33
         /*
         -----------------------------------------------------------------------------
        номер меньшего числа
         */
        System.out.println(z_47(16., 15.));    //47
         /*
         -----------------------------------------------------------------------------
        сумма N элементов по формуле
         */
        System.out.println(z_107(4));    //107
         /*
         -----------------------------------------------------------------------------
        целое + число квадрат которого больше N
         */
        System.out.println(z_117(80));    //117
         /*
         -----------------------------------------------------------------------------
        номер первого максимального и последнего минимального
         */
        int[] array = {4, 3, 2, 1, 0, 5, 0, 7, 0, 15, 15, 15, 0};
        System.out.println((Arrays.toString(z_147(array))));    //147
         /*
         -----------------------------------------------------------------------------
        кол-во участков, на которых элементы массива возрастают
         */
        //    arr =   1 2 1 3 1 5 4 3 4 4 5 3 3 4; N = 14
        System.out.print("Введите размерность массива: ");
        int N = sc.nextInt();
        int[] in_array = new int[N];
        System.out.print("Введите массив целых чисел: ");
        for (int i = 0; i < in_array.length; i++) {
            in_array[i] = sc.nextInt();
        }
        System.out.println(z_207(in_array));   //207
         /*
         -----------------------------------------------------------------------------
        возвести в квадрат локальные минимумы
         */
        //    arr = 3 2 2 3 2 3 5 4 5 5 5 9 8 9; N = 14
        System.out.print("N: ");
        int n = sc.nextInt();
        double[] in_array1 = new double[n];
        System.out.print("array: ");
        for (int i = 0; i < in_array1.length; i++) {
            in_array1[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(z_247(in_array1))); //247
         /*
         -----------------------------------------------------------------------------
        перед каждой серий элемент с нулевым значением 287
        серия - группа подряд идущих одинаковых элементов
        длина серии - кол-во этих элементов (может быть равной 1)
         */
        Integer [] array1 = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6};
        z_287(array1); // 287
        /*
         -----------------------------------------------------------------------------
        перед каждой серий элемент с нулевым значением 287
        серия - группа подряд идущих одинаковых элементов
        длина серии - кол-во этих элементов (может быть равной 1)
         */
        

    }
}