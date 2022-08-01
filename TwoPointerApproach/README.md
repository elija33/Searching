# Searching
Searching Algorithm using Java to solution.
 
`                           UNSORTED ARRAY

                        Two Pointer with Unsorted Array
when give an unsorted array and a sum, find if there is a pair with given sum

Method 1: Two Pointer Using Brute Force 
The brute force approach in these type of questions aim to check all possible two pointer present in the array. The two point with sum=Target sum will be the answer. Now the question that arises is how should one check all possible two point. To check all possible duplets fix a pointer on one element and for every such element traverse the array and check the sum. This will be the sum of all possible duplets.


Algorithm:
Take two pointers i, and j.
Initialize i with zero and start a nested loop for i.
Initialize j with (i+1) and start a nested loop for j.
If Target == arr[i] + arr[j] break the loop and print values of arr[i], arr[j].
Else keep incrementing k till it is equal to last index.
Goto step 2 and increment j and for every value of j
If j is equal to 2nd last index Goto step 1 and increment the value of i till 2rd last index and again continue the whole process till the value of i is equal to the last index. 


                            Sorted Array