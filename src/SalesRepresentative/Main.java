package SalesRepresentative;

public class Main {


    public static void main(String[] args) {

        {
            BubbleSort salesSort1 = new BubbleSort();
            int arr[] = { salesSort1.salesGuy1(), salesSort1.salesGuy2()};
            int n = arr.length;
            salesSort1.bubbleSort(arr, n);
            System.out.println("The sales values in descending order are: ");
            salesSort1.dispArray(arr, n);
        }
    }
}

