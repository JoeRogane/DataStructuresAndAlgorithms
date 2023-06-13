Algorithm Greedy (a, n)  
{  
   Solution : = 0;  
  for i = 0 to n do  
  {  
      x: = select(a);  
     if feasible(solution, x)  
    {  
        Solution: = union(solution , x)  
    }  
       return solution;  
  } }  
