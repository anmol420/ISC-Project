# ALGORITHM

- Step-1 :- START
- Step-2 :- Create a class named as `decimal`.
- Step-3 :- Create a function named as `dec_con` which takes an integer type array and two integer arguments and displays the decimal equivalent of the given number. In this function, first create a for loop (from 0 to row length of array) inside which create a variable named `decNum` and initialise it with 0. Inside the runnng for loop, start another for loop (from 0 to column length of array) and then store the sum value of the the array indexes at `[i][j]` raised to the power `(8,n-j-i)` in the variable `decNum`, in this loop print the array element at `[i][j]`. After the inner for loop ends, print the value of `decNum`.
- Step-4 :- Create a function named as `main` and call the method `dec_con` and pass the array and the number of rows and columns as arguments after taking the input of number of rows and columns and the array from the user.
- Step-5 :- END

# VD TABLE

| Sr. No. | Variable | Data Type | Description |
| --- | --- | --- | --- |
| 1 | i | int | To store the value of the loop variable |
| 2 | j | int | To store the value of the loop variable |
| 3 | m | int | To store the number of rows |
| 4 | n | int | To store the number of columns |
| 5 | decNum | int | To store the sum of decimal equivalent of the array indexes |
| 6 | a | int | To store the array elements |


# OUTPUT

<p align="center">
<img width="auto" height="auto" alt="output" src="output.png">
</p>
