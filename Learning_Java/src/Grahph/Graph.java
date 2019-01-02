package Grahph;
import Stack_Queue.Stack;


public class Graph {
	private Vertex[] vertexList;
	private int[][] adjMat;
	private int nVertex; // added nodes
	private Stack stack;
	
	public Graph(int maxSize) {
		vertexList = new Vertex[maxSize];
		adjMat = new int[maxSize][maxSize];
		for(int i = 0; i < maxSize; i ++) {
			for(int j = 0; j < maxSize; j ++) {
				adjMat[i][j] = 0;
			}
		}
		
		nVertex = 0;
		stack = new Stack();
	}
	
	public void addVertex(char label) {
		vertexList[nVertex++] = new Vertex(label);
	}
	
	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	
	public int getAdjUnvisitedVertex(int v) {
		for(int i = 0; i < nVertex; i++) {
			if(adjMat[v][i] == 1&& vertexList[i].wasVisited == false) {
				return i;
			}
		}
		return -1;
	}
	
	
	public void dfs() { // depth first search 
		vertexList[0].wasVisited = true;
		displayVertex(0);
		stack.push(0);
		while(!stack.isEmpty()) {
			int v = getAdjUnvisitedVertex((int)stack.peek());
			if(v == -1) {
				stack.pop();
			} else {
				vertexList[v].wasVisited = true;
				displayVertex(v);
				stack.push(v);
			}
		}
		
		for(int i = 0; i < nVertex; i++) {
			vertexList[i].wasVisited = false;
		}
		
		
	}
	
	public void wfs() { // width first search 
		
	}
	
	public void displayVertex(int v) {
		System.out.print(vertexList[v].label);
	}
	
	
	
}
