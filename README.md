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
The solution is based on comparing the arrays from the last NON EMPTY position and copying the larger  element at the end and then reducing the size of the respective arrays till the total size is traversed , if the 2nd array is already traversed then better exit from loop NO NEEDs to wait further .

### Complexity O(m+n ) => O(n) where n is the total number of elements , space complexity O(1)

## Merge Sort
Advantages of merge sort:

Merge sort is a stable sorting algorithm, which means it preserves the relative order of equal elements in the input array.
Merge sort has a guaranteed worst-case time complexity of O(n log n), which means it performs well even on large datasets.
Merge sort is a naturally parallelizable algorithm, which means it can be easily parallelized to take advantage of multiple processors or threads.

Disadvantages of merge sort:

Merge sort requires additional memory to store the two sorted halves of the array while they are being merged.
Merge sort can be slower than other sorting algorithms, such as quicksort, on small datasets.

Merge Sort is an efficient sorting algorithm with the following time and space complexities:

**Time Complexity:**
- Best Case: O(n log n)
- Average Case: O(n log n)
- Worst Case: O(n log n)

Merge Sort divides the array into two halves and recursively sorts them. The merge step takes O(n) time in each recursion, where "n" is the size of the array. Since the array is divided in half at each level of recursion, there are O(log n) levels of recursion. As a result, the total time complexity is O(n log n) in the best, average, and worst cases.

**Space Complexity:**
- O(n)

Merge Sort is not an in-place sorting algorithm, which means that it requires additional memory to store the sub-arrays during the sorting process. The space complexity of Merge Sort is O(n) because it needs additional space to store the two sub-arrays being merged. This makes it less memory-efficient compared to some other sorting algorithms, but it is very consistent and stable in its performance.