BellamanFord (G, V, E, S)  
Step 1:  
for each vertex v ϵ G do  
dist[v] = ∞  
dist[source] = 0  
  
Step 2:  
Relax (u, v, w)  
for i = 1 to |v|-1  
           for each edge (u, v) ϵ G do  
           (dist[v] > dist[u]+w(u, v))  
           (dist[v] <- dist[u]+w(u, v))  
Step 3:  
for each edge (u, v) ϵ G  
if (dist[u]+w(u, v)< dist[v])  
return "Graph contains negative weight cycle"  
return distance  
