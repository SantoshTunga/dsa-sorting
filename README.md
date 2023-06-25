# dsa-sorting
all sorting algorithm 

## Bubble Sort 

Bubble sort works on the repeatedly swapping of adjacent elements until they are not in the intended order .
### The average and worst-case complexity of Bubble sort is O(n2), where n is a number of items .</h2>

The outer loop ensure for comparing all the elements and control the length of the array for the each iteration
The inner loop compare all the elements ,swap them as required
and ensure the biggest / smallest element at the end . 

## Merge Two sorted arrays and keep the final result in the first array 

In this case the length of the non empty size of the first array is known .
The solution is based on comparing the arrays from the last NON EMPTY position and copying the larger  element at the end and then reducing the size of the respective arrays till the total size is traversed , if the 2nd array is already traversed then better exit from loop NO NEEDs to wait furthers .

### Complexity O(m+n ) => O(n) where n is the total number of elements , space complexity O(1)