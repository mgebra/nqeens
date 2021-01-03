# NQeens
N Queens problem with no 3 queen on same line

#### Algorithm Summary
* Queens are saved as one dimensional array, were index is row and value is column where queen is located at the board. For example: [0, 2, 4] means that queens are located at [0:0], [1:2] and [2:4] places. 
* To find solution, we try to place queen on all columns (check if it does not violate rules) and for each case apply same algorithm with other board part recursively. For example: if we have 8x8 board, we first try to put queens at first row and then apply same logic to 7x8 board.
* When deciding is it valid place for queen or not, we have to tale into account 3 things:
  1) No queens can be on same column
  2) No queens can be in same diagonal
  3) No 3 queens can be on same line  


#### Running app
gradle run --args="1"

#### Running tests
gradle test