### Kenzhibayeva Sabina
### Group: SE-2513
## Assignment 4: Graph Traversal and Representation System
## A. Project Overview
### This project builds a graph representation and traversal system in Java using an adjacency list structure. It models graphs through vertices (nodes) and edges (connections between nodes) and applies two main traversal techniques: Breadth-First Search (BFS) and Depth-First Search (DFS).
### A graph is a data structure made up of:
### 1. Vertices, which represent the nodes
### 2. Edges, which define the links between those nodes
### In this project, graphs of various sizes are created to study how traversal performance changes, measured through execution time.
### BFS Overview: Breadth-First Search explores the graph layer by layer. It starts at a chosen node and visits all its immediate neighbors before moving on to nodes at the next level.
### DFS Overview: Depth-First Search goes as deep as possible along one path before backtracking to explore other unvisited branches of the graph.
## B. Class Descriptions:
### The Vertex class represents a node in the graph.
### Fields:
### id — unique identifier of the vertex
### Methods:
### Constructor
### Getter
### toString()
### The Edge class represents a connection between two vertices.
### Fields:
### source
### destination
### Methods:
### Constructor
### Getter
### The Graph class stores and manages the graph using an adjacency list representation.
### main methods: addVertex(), addEdge(), printGraph(), bfs(), dfs()
### Adjacency List Representation
### The graph is represented using a HashMap<Integer, List<Integer>>.
### Example:
### 0: 1 2
### 1: 2 3
### 2: 3 4
### this means that vertex 0 connects to vertices 1 and 2, vertex 1 connects to vertices 2 and 3
### Adjacency lists are memory efficient and suitable for sparse graphs.
## C. Algorithm Descriptions
### BFS visits all nearby vertices before moving deeper into the graph.
### Step-by-Step Process
### 1. Start from a selected vertex
### 2. Mark it as visited
### 3. Add it to a queue
### 4. Remove a vertex from the queue
### 5. Visit all unvisited neighbors
### 6. Repeat until the queue is empty
### Data structure used: queue
### Use cases: Shortest path search, Network traversal, Social network connections, Level-order exploration
### Time Complexity: O(V+E)
### V = number of vertices, E = number of edges
### DFS explores one branch deeply before backtracking.
### Step-by-Step Process
### Start from a selected vertex
### Mark it as visited
### Visit one unvisited neighbor
### Continue recursively
### Backtrack when no neighbors remain
### Data structure used: stack
### Use Cases: Path finding,  Cycle detection, Maze solving, Topological sorting
### Time Complexity: O(V+E)
### V = number of vertices, E = number of edges
## D. Experimental Results
### The algorithms were tested on graphs with:
### 10 vertices: BFS: 477 200 ns, DFS: 166 000 ns
### 30 vertices: BFS: 316 500 ns, DFS: 286 900 ns
### 100 vertices: BFS: 843 600 ns, DFS: 661700 ns
### Observations and Patterns:
### DFS was slightly faster in some tests because recursion required fewer queue operations.
### BFS and DFS produced different traversal orders depending on graph structure.
## E. Screenshots
<img width="1920" height="1080" alt="Снимок экрана (179)" src="https://github.com/user-attachments/assets/88fc9b15-38e0-4aae-841c-ac3f8fe08106" />
<img width="1920" height="1080" alt="Снимок экрана (180)" src="https://github.com/user-attachments/assets/0f990c5b-7f86-4c7f-844a-b6d895107ed0" />

<img width="1920" height="1080" alt="Снимок экрана (181)" src="https://github.com/user-attachments/assets/543b0429-d2d8-4fdd-9a97-a1bc37176c82" />

## F. Reflection Section
### This assignment improved my understanding of how graphs can be stored using adjacency lists and how traversal methods operate. I learned that BFS processes nodes level by level, while DFS goes as deep as possible before returning to explore other paths. I also gained insight into how increasing graph size impacts algorithm performance.

### One difficulty I faced was working with recursion in DFS and making sure nodes were not visited more than once. Another challenge was creating properly connected graphs for testing purposes. Overall, this project strengthened my knowledge of graph algorithms, Java data structures, and object-oriented programming principles.
### toString()

