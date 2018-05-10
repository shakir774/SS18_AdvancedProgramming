class QuickSortApp
{
    public static void main(String[] args)
    {
        int maxSize = 16;                 //array maxSize
        ArrayIns arr;
        arr = new ArrayIns(maxSize);      //create array

        for(int j=0; j<maxSize;j++)       //fill array with random numbers
        {
            long n = (int)(java.lang.Math.random()*99);
            arr.insert(n);
        }

        arr.display();                     //display items before sort 
        arr.quickSort();                   //sort items
        arr.display();                     //display items after sort
    }

}