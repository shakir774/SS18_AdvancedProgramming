/*---------------------------------------------------
This code copied from:
DATA STRUCTURES & ALGORITHMS IN JAVA  
                ROBERT LAFORE
                SECOND EDITION


-----------------------------------------------------*/
class ArrayIns{
private long[] theArray;    //ref to array theArray
private int nElems;         //number of data items

    public ArrayIns(int max)        //constructor
    {
        theArray =new long[max];        //create the array
        nElems =0;
    }

    public void insert(long value)      //put elements into array
    {
        theArray[nElems] = value;       //insert items
        nElems++;                       //increament size
    }

    public void display()               //display array contents
    {
        System.out.print(" A= ");
        for(int j=0;j<nElems;j++)
            System.out.print(theArray[j]+"  ");
        System.out.println("");
        System.out.println("");
    } 

    public void quickSort()
    {
        recQuickSort(0,nElems-1);
    }

    public void recQuickSort(int left, int right)
    {
            if(right-left<=0)       //if size <= 1
                return;             //already sorted
            else                    //size is 2 or larger
            {
                long pivot = theArray[right];       //rightmost item

                int partition = partitionIt(left,right,pivot);

                recQuickSort(left,partition-1);     //sort left side
                recQuickSort(partition+1,right);    //sort right side

            }
    }

    public int partitionIt(int left, int right, long pivot)
    {
        int leftPtr = left-1;       //left  (after ++)
        int rightPtr = right;       //right-1 (after --)
        while(true)
            {                               //find bigger item
                while(theArray[++leftPtr] < pivot)
                    ;
                                            //find smaller item
                while(rightPtr > 0 && theArray[--rightPtr] > pivot)
                    ;

                    if(leftPtr>=rightPtr)           //if pointers cross 
                    break;                          //partition done
                    else                            //not crossed
                    swap(leftPtr,rightPtr);         //swap elements
            }

            swap(leftPtr,right);                    //restore pivot
            return leftPtr;                         //return pivot location
            
    }

    public void swap(int dex1, int dex2)               //swap two elements
    {
        long temp = theArray[dex1];
        theArray[dex1] = theArray[dex2];
        theArray[dex2] = temp;
    }
    
}