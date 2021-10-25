# HourGlass
Given a 6 x 6 2D Array, arr:

  1 1 1 0 0 0 
  0 1 0 0 0 0
  1 1 1 0 0 0
  0 0 0 0 0 0
  0 0 0 0 0 0
  0 0 0 0 0 0
An hourglass in A is a subset of values with indices falling in this pattern in arr's graphical
representation:

  abc 
   d
  efg
  
There are 16 hourglasses in arr. An hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in arr, then print the maximum hourglass sum. The array will always be 6 x 6.
Example:
  -9 -9 -9 1 1 1 
  0 -9 0 4 3 2
  -9 -9 -9 1 2 3 
  0 0 8 6 6 0
  0 0 0 -2 0 0 
  0 0 1 2 4 0
  
The 16 hourglass sums are:
  -63 -34 -9 12
  -10 0 28 23
  -27, -11, -2, 10,
  9, 17, 25, 18
  
The highest hourglass sum is 28.

