package SalesRepresentative;

public class BubbleSort {

    static void bubbleSort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j] < arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false)
                break;
        }
    }

    // Function to display the values
    static void dispArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    //Sales calculation
    public int salesGuy1(){
        int sales = 10;
        int quota = 500;

        int sum = sales * quota;
        System.out.println("Sales guy 1 has made " + sum + " USD!");
        return sum;
    }

    public int salesGuy2(){
        int sales= 7;
        int quota = 800;

        int sum = sales * quota;
        System.out.println("Sales guy 2 has made " + sum + " USD!");
        return sum;
    }
}
