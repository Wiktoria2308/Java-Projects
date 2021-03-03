In this project a point is moving on the table. 

The task is to accept a set of commands and then simulate whether an object can move according to these commands without falling off the table it stands on. 
The table can be seen as a matrix where the object will have an x and y position.

Commands 
The object always has a direction (north, east, south or west). A simulation always starts with direction north. North means that if the object sits on [2, 4] and moves forward one step, the object will now stand on [2, 3]. 
The commands are: 
0 = quit simulation and print results 
1 = move forward one step 
2 = move backwards one step 
3 = rotate clockwise 90 degrees (eg north to east) 
4 = rotate counterclockwise 90 degrees (eg west to south) 


