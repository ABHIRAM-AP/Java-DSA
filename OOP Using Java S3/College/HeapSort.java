import java.util.*;

class Heap
{
    void swap(int a[], int i,int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}
  void maxHeapify(int a[], int i, int n) {
    int largest = i;  
    int left = 2 * i + 1; // Left child index
    int right = 2 * i + 2; // Right child index

    if (left < n && a[left] > a[largest]) { 
        largest = left;
    }
    if (right < n && a[right] > a[largest]) { 
        largest = right;
    }
    if (largest != i) {
        swap(a,i,largest);
        maxHeapify(a, largest, n);  
    }
}

void buildMaxHeap(int a[], int n) {
    for (int i = n / 2 - 1; i >= 0; i--) { 
        maxHeapify(a, i, n);
    }
}

void heapSort(int a[], int n) {
    buildMaxHeap(a, n);
    for (int i = n - 1; i > 0; i--) { 
        swap(a,0,i); // Swap root with last element
        maxHeapify(a, 0, i);  
    }
}
}



public class HeapSort
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int []a=new int[5];
        System.out.println("Enter elements");
        for(int i=0;i<5;i++)
        {
            a[i]=s.nextInt();
        }
        s.nextLine();
        Heap ob=new Heap();
        ob.heapSort(a,5);
        System.out.println("Sorted array ");
        for(int i=0;i<5;i++)
        {
        System.out.print(a[i]+"\t");
        }
    }
}