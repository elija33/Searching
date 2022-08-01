# Searching
Searching Algorithm using Java to solution. 

                                            Finding Triplet with given sum.
Given an array of distinct elements. The task is to find triplets in array whose sum is equal to a given number.

                                        Method 1: Finding Triplet Using Brute Force 
The brute force approach in these type of questions aim to check all possible triplets present in the array. The triplet with sum=Target sum will be the answer. Now the question that arises is how should one check all possible triplets. To check all possible duplets fix a pointer on one element and for every such element traverse the array and check the sum. This will be the sum of all possible duplets.


Algorithm:
Take three pointers i, j, k.
Initialize i with zero and start a nested loop for i.
Initialize j with (i+1) and start a nested loop for j.
Initialize k with (j+1) and start a loop for k.
If Target == arr[i] + arr[j] + arr[k] break the loop and print values of arr[i], arr[j], arr[k].
Else keep incrementing k till it is equal to last index.
Goto step 2 and increment j and for every value of j run the inner loop of k.
If j is equal to 2nd last index Goto step 1 and increment the value of i till 3rd last index and again continue the whole process till the value of i is equal to the last index. 