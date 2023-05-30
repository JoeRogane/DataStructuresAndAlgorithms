import java.util.*;

class Graph
{
	int v;
	LinkedList<Integer> adj[];

	Graph(int v)
	{
		this.v=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++)
			adj[i]=new LinkedList<Integer>();
	}


	void addEdge(int u,int v)
	{
		adj[u].add(v);
	}
	
	void BFS(int s)
	{
		boolean[] visited=new boolean[v];
		LinkedList<Integer> q=new LinkedList<Integer>();
		q.add(s);
		visited[s]=true;

		while(!q.isEmpty())
		{
			int x=q.poll();
			System.out.print(x+" ");

			Iterator<Integer> itr=adj[x].listIterator();
			while(itr.hasNext())
			{
			  int p=itr.next();
			  if(visited[p]==false)
				{
					visited[p]=true;
					q.add(p);
				}
			}
		}
	}
	
	
	void DFSUtil(int s,boolean[] visited)
	{
		visited[s]=true;
		System.out.println(s);

		Iterator<Integer> itr=adj[s].listIterator();
		while(itr.hasNext())
		{
			int x=itr.next();
			if(visited[x]==false)
			{                                                        
				//visited[x]=true;

				DFSUtil(x,visited);
			} 
		}
	}
	
	
	void DFS(int s){
		boolean visited[]=new boolean[v];
		DFSUtil(s,visited);
	}

	public static void main(String[] args)
		{
			Graph g=new Graph(4);
			g.addEdge(0,1);
			g.addEdge(0,2);
			g.addEdge(1,2);
			g.addEdge(2,0);
			g.addEdge(2,3);
			g.addEdge(3,3);
			
			g.BFS(2);
			g.DFS(2);

		}
}
