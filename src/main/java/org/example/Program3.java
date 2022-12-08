/** Текст задачи:
 Дан массив nums = [3,2,2,3] и число val = 3.
 Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
 Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
 */

package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Program3 {
 public static void main(String[] args) {
  ex3();

 }

 private static void ex3() {
  Random random = new Random();
  int[] arr = new int[20];
  final int VAL = 3;

  for (int i = 0; i < arr.length - 1; i++) {
   arr[i] = random.nextInt(1, 6);
  }

  System.out.println(Arrays.toString(arr));


  int left = 0;
  int right = arr.length - 1;

  while (left < right) {
   if (arr[right] == VAL) {
    right--;
   } else if (arr[left] == VAL) {
    arr[left] = arr[right];
    arr[right] = VAL;

    right--;
    left++;
   } else if (arr[left] != VAL) {
    left++;
   }
  }

  System.out.println(Arrays.toString(arr));

 }
}