//import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    double[] doubleArr = {1.3, 1.6, 3.6, 1.8};
    System.out.println(sumArray(doubleArr));

    String[] stringArr1 = {"Yay", "Damn", "Every", "Length"};
    System.out.println(averageLength(stringArr1));

    int[] intArray = {1,6,8,4,10,3};
    System.out.println(arrayMax(intArray));

    String[] stringArr2 = {"Yay", "Damn", "Every", "Length"};
    System.out.println(linearSearch(stringArr2, "Yay"));
    System.out.println(linearSearch(stringArr2, "Robot"));
  }

  public static double sumArray(double[] arr)
  {
    double sum = 0.0;
    for (int i = 0; i < arr.length; i++)
    {
      sum += arr[i];
    }
    return sum;
  }

  public static double averageLength(String[] arr)
  {
    double meanLength = 0.0;
    for (int i = 0; i < arr.length; i++)
    {
      meanLength += arr[i].length();
    }
    return (double)meanLength/arr.length;
  }

  public static int arrayMax(int[] arr)
  {
    int max = 0;
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] > max)
      {
        max = arr[i];
      }
    }
    return max;
  }

  public static boolean linearSearch(String[] arr, String target)
  {
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i].equals(target))
      {
        return true;
      }
    }
    return false;
  }
}
