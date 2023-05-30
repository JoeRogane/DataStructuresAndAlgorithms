class BitonicSort {  
      
/*In this function the parameter 'd' represents the sorting direction*/  
static void exchange(int a[], int i, int j, int d)    
{    
    int temp;    
           if ( (a[i] > a[j] && d == 1) || (a[i] < a[j] && d == 0))  
    {    
        temp = a[i];    
        a[i] = a[j];    
        a[j] = temp;    
    }    
}    
static void merge(int a[], int beg, int c, int d)    
{    
    int k, i;    
    if (c > 1)    
    {    
        k = c/2;    
        for (i = beg; i < beg+k; i++)    
            exchange(a, i, i+k, d);    
        merge(a, beg, k, d);    
        merge(a, beg+k, k, d);    
    }    
}    
static void bitonicSort(int a[] ,int beg, int c, int d)    
{    
    int k;    
    if (c>1)    
    {    
        k = c/2;    
        bitonicSort(a, beg, k, 1);  // sort in ascending order  
        bitonicSort(a, beg+k, k, 0);  // sort in descending order  
        merge(a,beg, c, d);  //merge the sequence in ascending order  
    }    
}    
     
/* function to call the bitonicSort() function to sort the given array in  
 
ascending order */  
static void sort(int a[], int n, int order)    
{    
    bitonicSort(a, 0, n, order);    
}    
 static void print(int a[], int n) //function to print array elements  
    {  
    int i;  
    for(i = 0; i < n; i++)    
    {    
        System.out.print(a[i] + " ");    
    }        
    }  
  
public static void main(String args[]) {   
    int[] a= {20, 60, 30, 70, 50, 10, 5, 40};    
    int n = a.length;   
    int order = 1; //It means sorting in increasing order   
    System.out.print("Before sorting array elements are - \n");  
    print(a, n);  
    sort(a, n, order);    
    System.out.print("\nAfter sorting array elements are - \n");    
    print(a, n);  
}  
}  