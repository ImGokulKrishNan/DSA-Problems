# DSA-Problems

What is Data Structure?
A data structure is a particular way of storing and organizing data in our devices to use the data efficiently and effectively. The main idea behind using data structures is to minimize the time and space complexities. An efficient data structure takes minimum memory space and requires minimum time to execute the data. 
## What is an Algorithm?

The word [****Algorithm****] means “__A set of rules to be followed in calculations or other problem-solving operations__” Or “__A procedure for solving a mathematical problem in a finite number of steps that frequently involves recursive operations__ “.

Therefore Algorithm refers to a sequence of finite steps to solve a particular problem.

****Algorithms can be simple and complex depending on what you want to achieve.****

![image](https://github.com/ImGokulKrishNan/DSA-Problems/assets/87110207/df3cd5b3-381d-42be-8538-5105b5d5f260)

# Time Complexity in Data Structure

## What is Time Complexity:

Time complexity measures how many operations an algorithm completes in relation to the size of the input. It aids in our analysis of the algorithm's performance scaling with increasing input size. Big O notation (O()) is the notation that is most frequently used to indicate temporal complexity. It offers an upper bound on how quickly an algorithm's execution time will increase.
## Best, Worst, and Average Case Complexity:

In analyzing algorithms, we consider three types of time complexity:

1. **Best-case complexity (O(best)):** This represents the minimum time required for an algorithm to complete when given the optimal input. It denotes an algorithm operating at its peak efficiency under ideal circumstances.
2. **Worst-case complexity (O(worst)):** This denotes the maximum time an algorithm will take to finish for any given input. It represents the scenario where the algorithm encounters the most unfavourable input.
3. **Average-case complexity (O(average)):** This estimates the typical running time of  an algorithm when averaged over all possible inputs. It provides a more realistic evaluation of an algorithm's performance.

## Big O Notation:

Time complexity is frequently expressed using Big O notation. It represents the maximum possible running time for an algorithm given the size of the input. Let's go through some crucial notations.:

![Time Complexity in Data Structure](https://static.javatpoint.com/ds/images/time-complexity-in-data-structure.png)

### a) O(1) - Constant Time Complexity:

If an algorithm takes the same amount of time to execute no matter how big the input is, it is said to have constant time complexity. This is the best case scenario as it shows how effective the algorithm is. Examples of operations having constant time complexity include accessing a component of an array or executing simple arithmetic calculations.

How to Calculate Time Complexity?

Analysing the growth rate of an algorithm's running time as input size grows is necessary to determine how time-complex it is. It gives an estimate of how the algorithm performs as the input size increases. Here are the general steps to calculate time complexity:

Identify the algorithm: Determine the specific algorithm or code snippet for which you want to calculate the time complexity. It could consist of a series of operations combined with a loop or a recursive function.
Identify the input size: Identify the elements that make up the algorithm's input size. For example, if the algorithm operates on an array, the input size could be the length of the array.
Determine the basic operations: Identify the fundamental operations that contribute to the running time of the algorithm. These operations could be comparisons, assignments, arithmetic operations, function calls, or any other significant actions.
Count the operations: Analyze how many times each basic operation is executed as a function of the input size. You may need to consider different scenarios or branches within the algorithm.
Express the count as a function of the input size: Create a mathematical expression that represents the count of basic operations as a function of the input size. It ought to outline the worst-case scenario or the performance limit of the algorithm.


## Time Complexity of Different Data Structures:

Here are the time complexities associated with common data structures:

### Arrays:

- Access: O(1)
- Search: O(n)
- Insertion (at the end): O(1)
- Insertion (at the beginning or middle): O(n)
- Deletion (from the end): O(1)
- Deletion (from the beginning or middle): O(n)

### Linked Lists:

- Access: O(n)
- Search: O(n)
- Insertion (at the beginning): O(1)
- Insertion (at the end, with a tail pointer): O(1)
- Insertion (at the end, without a tail pointer): O(n)
- Insertion (in the middle): O(n)
- Deletion (from the beginning): O(1)
- Deletion (from the end, with a tail pointer): O(1)
- Deletion (from the end, without a tail pointer): O(n)
- Deletion (from the middle): O(n)

### Doubly Linked List:

- Accessing an element by index: O(n)
- Searching for an element: O(n)
- Insertion (at the beginning): O(1)
- Insertion (at the end, with a tail pointer): O(1)
- Insertion (at the end, without a tail pointer): O(n)
- Insertion (in the middle): O(n)
- Deletion (from the beginning): O(1)
- Deletion (from the end, with a tail pointer): O(1)
- Deletion (from the end, without a tail pointer): O(n)
- Deletion (from the middle): O(n)

### Stacks:

- Push: O(1)
- Pop: O(1)
- Peek: O(1)

### Queues:

- Enqueue: O(1)
- Dequeue: O(1)
- Peek: O(1)

### Hash Tables:

- Search: O(1) - on average, assuming a good hash function and minimal collisions
- Insertion: O(1) - on average, assuming a good hash function and minimal collisions
- Deletion: O(1) - on average, assuming a good hash function and minimal collisions

### Binary Search Trees (BSTs):

- Search: O(log n) - on average for balanced BST, O(n) worst case for unbalanced BST
- Insertion: O(log n) - on average for balanced BST, O(n) worst case for unbalanced BST
- Deletion: O(log n) - on average for balanced BST, O(n) worst case for unbalanced BST

### AVL Tree:

- Searching for an element: O(log n)
- Insertion of an element: O(log n)
- Deletion of an element: O(log n)

### B-Tree:

- Searching for an element: O(log n)
- Insertion of an element: O(log n)
- Deletion of an element: O(log n)

### Red-Black Tree:

- Searching for an element: O(log n)
- Insertion of an element: O(log n)
- Deletion of an element: O(log n)
Simplify the expression: Simplify the mathematical expression by removing constants, lower-order terms, and insignificant factors. Focus on the most dominant term that represents the growth rate of the algorithm.
Determine the time complexity notation: Use Big O notation to express the condensed expression, where Big O indicates the time complexity's upper bound. O(1) stands for constant time, O(n) for linear time, O(n^2) for quadratic time, and so forth are common notations.

### What is Data Structure?

The data structure name indicates itself that organizing the data in memory.

### Types of Data Structures

There are two types of data structures:

- Primitive data structure
- Non-primitive data structure

**Primitive Data structure**

The primitive data structures are primitive data types. The int, char, float, double, and pointer are the primitive data structures that can hold a single value.

**Non-Primitive Data structure**

The non-primitive data structure is divided into two types:

- Linear data structure
- Non-linear data structure

**Linear Data Structure**

The arrangement of data in a sequential manner is known as a linear data structure. The data structures used for this purpose are Arrays, Linked list, Stacks, and Queues. In these data structures, one element is connected to only one another element in a linear form.





### 1. [Array](https://www.geeksforgeeks.org/array-data-structure/)

The most basic yet important data structure is the array. It is a linear data structure. An array is a collection of homogeneous data types where the elements are allocated contiguous memory. Because of the contiguous allocation of memory, any element of an array can be accessed in constant time. Each array element has a corresponding index number. 

[![Array Data Structure](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20230726162247/Array-data-structure.png)](https://www.geeksforgeeks.org/array-data-structure/?ref=lbp)

Array Data Structure

To learn more about arrays, refer to the article “[****Introduction to Arrays****](https://www.geeksforgeeks.org/introduction-to-arrays/)“.

Here are some topics about array which you must learn:

- [Reverse Array](https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/) – Reverse an array means shifting the elements of an array in a reverse manner i.e., the last element becomes the first element, second last element becomes the second element, and so on. 
- [Rotation of Array](https://www.geeksforgeeks.org/c-program-cyclically-rotate-array-one/) – Rotation of array means shifting the elements of an array in a circular manner i.e., in the case of right circular shift the last element becomes the first element, and all other element moves one point to the right. 
- [Rearranging an array](https://www.geeksforgeeks.org/array-data-structure/array-rearrangement/) – Rearrangement of array elements suggests the changing of an initial order of elements following some conditions or operations.
- [Range queries in the array](https://www.geeksforgeeks.org/array-data-structure/array-range-queries/) – Often you need to perform operations on a range of elements. These functions are known as range queries.
- [Multidimensional array](https://www.geeksforgeeks.org/matrix/) – These are arrays having more than one dimension. The most used one is the 2-dimensional array, commonly known as a matrix.
- [Kadane’s algorithm](https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/)
- [Dutch national flag algorithm](https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/)

****Related posts:****

- [Introduction to Arrays](https://www.geeksforgeeks.org/introduction-to-arrays-data-structure-and-algorithm-tutorials/)
- [Practice Problems on Array](https://www.geeksforgeeks.org/array-data-structure/#standard)

### [2. String Data Structure](https://www.geeksforgeeks.org/string-data-structure/)

A string is also a type of array. It can be interpreted as an array of characters. But it has some special characteristics like the last character of a string is a null character to denote the end of the string. Also, there are some unique operations, like concatenation which concatenates two strings into one.

[![String Data Structure](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20230726162404/String-Data-Structure.png)](https://media.geeksforgeeks.org/wp-content/uploads/20220820132424/Strings.png)

String Data Structure

Here we are providing you with some must-know concepts of string:

- [Subsequence and substring](https://www.geeksforgeeks.org/data-structures/string-subsequence-substring/) – A subsequence is a sequence that can be derived from a string deleting one or more elements. A substring is a contiguous segment of the string.
- [Reverse and rotation in a string](https://www.geeksforgeeks.org/left-rotation-right-rotation-string-2/) – Reverse operation is interchanging the position of characters of a string such that the first becomes the last, the second becomes the second last, and so on.
- [Binary String](https://www.geeksforgeeks.org/what-is-binary-string/) – A binary string is a string made up of only two types of characters.
- [Palindrome](https://www.geeksforgeeks.org/palindrome-string/) – A palindrome string is a string in which the elements at the same distance from the center of the string are the same.
- [Lexicographic pattern](https://www.geeksforgeeks.org/lexicographic-rank-of-a-string/) – Lexicographical pattern is the pattern based on the ASCII value or can be said in dictionary order.
- [Pattern searching](https://www.geeksforgeeks.org/string-data-structure/#pattern) – Pattern searching is searching a given pattern in the string. It is an advanced topic of string.

****Related posts:****

- [Introduction to String](https://www.geeksforgeeks.org/introduction-to-strings-data-structure-and-algorithm-tutorials/)
- [Practice Problems on String](https://www.geeksforgeeks.org/string-data-structure/#standard)

### 3. [Linked Lists](https://www.geeksforgeeks.org/data-structures/linked-list/)

As the above data structures, the linked list is also a linear data structure. But [Linked List is different from Array](https://www.geeksforgeeks.org/linked-list-vs-array/) in its configuration. It is not allocated to contiguous memory locations. Instead, each node of the linked list is allocated to some random memory space and the previous node maintains a pointer that points to this node. So no direct memory access of any node is possible and it is also dynamic i.e., the size of the linked list can be adjusted at any time. To learn more about linked lists refer to the article “[****Introduction to Linked List****](https://www.geeksforgeeks.org/linked-list-set-1-introduction/)“.

[![Linked List Data Structure](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20230726162542/Linked-List-Data-Structure.png)](https://www.geeksforgeeks.org/data-structures/linked-list/?ref=lbp)

Linked List Data Structure

The topics which you must want to cover are:

- [Singly Linked List](https://www.geeksforgeeks.org/data-structures/linked-list/singly-linked-list/) – In this, each node of the linked list points only to its next node.
- [Circular Linked List](https://www.geeksforgeeks.org/circular-linked-list/) – This is the type of linked list where the last node points back to the head of the linked list.
- [Doubly Linked List](https://www.geeksforgeeks.org/introduction-and-insertion-in-a-doubly-linked-list/) – In this case, each node of the linked list holds two pointers, one point to the next node and the other points to the previous node.

****Related posts:****

- [Introduction to Linked Lists](https://www.geeksforgeeks.org/introduction-to-linked-list-data-structure-and-algorithm-tutorial/)
- [Practice Problems on Linked Lists](https://www.geeksforgeeks.org/data-structures/linked-list/#standardp)

### [4. Matrix/Grid](https://www.geeksforgeeks.org/introduction-to-matrix-or-grid-data-structure-and-algorithms-tutorial/)

A matrix represents a collection of numbers arranged in an order of rows and columns. It is necessary to enclose the elements of a matrix in parentheses or brackets.****For example:****A matrix with 9 elements is shown below.![](https://media.geeksforgeeks.org/wp-content/uploads/matrix-9.png)This Matrix ****M**** has 3 rows and 3 columns. Each element of matrix ****M**** can be referred to by its row and column number. For example, ****M[2][3]**** = 6.

****Related posts:****

- [Introduction to Matrix/Grid](https://www.geeksforgeeks.org/matrix/)
- [Practice Problems on Matrix/Grid](https://www.geeksforgeeks.org/matrix/#standard)

### 5. [Stack](https://www.geeksforgeeks.org/introduction-to-stack-data-structure-and-algorithm-tutorials/)

Now you should move to some more complex data structures, such as Stack and Queue. 

> [****Stack****](https://www.geeksforgeeks.org/stack-data-structure/) is a linear data structure which follows a particular order in which the operations are performed. The order may be [LIFO(Last In First Out) or FILO(First In Last Out)](https://www.geeksforgeeks.org/lifo-last-in-first-out-approach-in-programming/).

![Stack Data Structure](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20230726165552/Stack-Data-Structure.png)

Stack Data Structure

The reason why Stack is considered a complex data structure is that it uses other data structures for implementation, such as Arrays, Linked lists, etc. based on the characteristics and features of Stack data structure.

****Related posts:****

- [Introduction to Stack](https://www.geeksforgeeks.org/introduction-to-stack-data-structure-and-algorithm-tutorials/)
- [Practice Problems on Stack](https://www.geeksforgeeks.org/stack-data-structure/#standard)

### 6. [Queue](https://www.geeksforgeeks.org/introduction-to-queue-data-structure-and-algorithm-tutorials/)

Another data structure that is similar to Stack, yet different in its characteristics, is Queue.

> A [****Queue****](https://www.geeksforgeeks.org/queue-data-structure/) is a linear structure which follows [First In First Out (FIFO)](https://www.geeksforgeeks.org/fifo-first-in-first-out-approach-in-programming/) approach in its individual operations.

![Queue Data Structure](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20230726165642/Queue-Data-structure1.png)

Queue Data Structure

A queue can be of different types like 

- [Circular queue](https://www.geeksforgeeks.org/circular-queue-set-1-introduction-array-implementation/) – In a circular queue the last element is connected to the first element of the queue
- [Double-ended queue (or known as deque)](https://www.geeksforgeeks.org/deque-set-1-introduction-applications/) – A double-ended queue is a special type of queue where one can perform the operations from both ends of the queue.
- [Priority queue](https://www.geeksforgeeks.org/priority-queue-set-1-introduction/) – It is a special type of queue where the elements are arranged as per their priority. A low priority element is dequeued after a high priority element.

****Related posts:****

- [Introduction to Queue](https://www.geeksforgeeks.org/introduction-to-queue-data-structure-and-algorithm-tutorials/)
- [Practice Problems on Queue](https://www.geeksforgeeks.org/queue-data-structure/#standard)

### 7. [Heap](https://www.geeksforgeeks.org/heap-data-structure/)

> A Heap is a special ****Tree-based Data Structure**** in which the tree is a [complete binary tree](https://www.geeksforgeeks.org/complete-binary-tree/).

****Types of heaps:****

Generally, heaps are of two types.

- [****Max-Heap****](https://www.geeksforgeeks.org/introduction-to-max-heap-data-structure/)****:**** In this heap, the value of the root node must be the greatest among all its child nodes and the same thing must be done for its left and right sub-tree also.
- [****Min-Heap****](https://www.geeksforgeeks.org/introduction-to-min-heap-data-structure/)****:**** In this heap, the value of the root node must be the smallest among all its child nodes and the same thing must be done for its left ans right sub-tree also.

![Types of Heap Data Structure](https://www.geeksforgeeks.org/wp-content/uploads/MinHeapAndMaxHeap.png)

Types of Heap Data Structure

****Related posts:****

- [Introduction to Heap](https://www.geeksforgeeks.org/introduction-to-heap-data-structure-and-algorithm-tutorials/)
- [Practice Problems on Heap](https://www.geeksforgeeks.org/heap-data-structure/#standard)

### 8. [Hash](https://www.geeksforgeeks.org/introduction-to-hashing-data-structure-and-algorithm-tutorials/)

> ****Hashing**** refers to the process of generating a fixed-size output from an input of variable size using the mathematical formulas known as hash functions. This technique determines an index or location for the storage of an item in a data structure.

[![Hashing, A Complete Tutorial](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20220701174812/Hashing.jpg)](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20220701174812/Hashing.jpg)

What is Hashing

****Related posts:****

- [Introduction to Hash](https://www.geeksforgeeks.org/introduction-to-hashing-data-structure-and-algorithm-tutorials/)
- [Practice Problems on Hash](https://www.geeksforgeeks.org/hashing-data-structure/#standard)

### 9. [Tree Data Structures](https://www.geeksforgeeks.org/introduction-to-tree-data-structure-and-algorithm-tutorials/)

After having the basics covered about the [linear data structure](https://www.geeksforgeeks.org/difference-between-linear-and-non-linear-data-structures/), now it is time to take a step forward to learn about the non-linear data structures. The first non-linear data structure you should learn is the tree. 

> [Tree data structure](https://www.geeksforgeeks.org/introduction-to-tree-data-structure/) is similar to a tree we see in nature but it is upside down. It also has a root and leaves. The root is the first node of the tree and the leaves are the ones at the bottom-most level. The special characteristic of a tree is that there is only one path to go from any of its nodes to any other node.

![Tree Data Structure](https://media.geeksforgeeks.org/wp-content/uploads/20221124153129/Treedatastructure.png)

Tree Data Structure

Based on the maximum number of children of a node of the tree it can be – 

- [Binary tree](https://www.geeksforgeeks.org/binary-tree-data-structure/) – This is a special type of tree where each node can have a maximum of 2 children.
- [Ternary tree](https://www.geeksforgeeks.org/ternary-tree/) – This is a special type of tree where each node can have a maximum of 3 children.
- [N-ary tree](https://www.geeksforgeeks.org/generic-treesn-array-trees/) – In this type of tree, a node can have at most N children.

Based on the configuration of nodes there are also several classifications. Some of them are:

- [Complete Binary Tree](https://www.geeksforgeeks.org/complete-binary-tree/) – In this type of binary tree all the levels are filled except maybe for the last level. But the last level elements are filled as left as possible.
- [Perfect Binary Tree](https://www.geeksforgeeks.org/perfect-binary-tree/) – A perfect binary tree has all the levels filled
- [Binary Search Tree](http://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/) – A binary search tree is a special type of binary tree where the smaller node is put to the left of a node and a higher value node is put to the right of a node
- [Ternary Search Tree](http://www.geeksforgeeks.org/ternary-search-tree/) – It is similar to a binary search tree, except for the fact that here one element can have at most 3 children.

****Related posts:****

- [Introduction to Tree](https://www.geeksforgeeks.org/introduction-to-tree-data-structure-and-algorithm-tutorials/)
- [Practice Problems on Tree](https://www.geeksforgeeks.org/binary-tree-data-structure/#standard)

### [10. Graph Data Structure](https://www.geeksforgeeks.org/introduction-to-graphs-data-structure-and-algorithm-tutorials/)

Another important non-linear data structure is the graph. It is similar to the Tree data structure, with the difference that there is no particular root or leaf node, and it can be traversed in any order.

> A [****Graph****](https://www.geeksforgeeks.org/graph-data-structure-and-algorithms/) is a non-linear data structure consisting of a finite set of vertices(or nodes) and a set of edges that connect a pair of nodes. 

![Graph Data Structure](https://media.geeksforgeeks.org/wp-content/uploads/20200630111809/graph18.jpg)

Graph Data Structure

Each edge shows a connection between a pair of nodes. This data structure helps solve many real-life problems. Based on the orientation of the edges and the nodes there are various types of graphs. 

Here are some must to know concepts of graphs:

- [Types of graphs](https://www.geeksforgeeks.org/graph-types-and-applications/) – There are different types of graphs based on connectivity or weights of nodes.
- [Introduction to BFS and DFS](https://www.geeksforgeeks.org/graph-data-structure-and-algorithms/#bfsndfs) – These are the algorithms for traversing through a graph
- [Cycles in a graph](https://www.geeksforgeeks.org/graph-data-structure-and-algorithms/#cycle) – Cycles are a series of connections following which we will be moving in a loop.
- [Topological sorting in the graph](https://www.geeksforgeeks.org/graph-data-structure-and-algorithms/#topo)
- [Minimum Spanning tree in graph](https://www.geeksforgeeks.org/graph-data-structure-and-algorithms/#MST)

****Related posts:****

- [Introduction to Graph](https://www.geeksforgeeks.org/introduction-to-graphs-data-structure-and-algorithm-tutorials/)
- [Practice Problems on Graph](https://www.geeksforgeeks.org/graph-data-structure-and-algorithms/#mustdo)

## [3. Learn Algorithms](https://www.geeksforgeeks.org/introduction-to-algorithms/)

Once you have cleared the concepts of Data Structures, now its time to start your journey through the Algorithms. Based on the type of nature and usage, the Algorithms are grouped together into several categories, as shown below:

### [1. Searching Algorithm](https://www.geeksforgeeks.org/searching-algorithms/)

Now we have learned about some linear data structures and is time to learn about some basic and most used algorithms which are hugely used in these types of data structures. One such algorithm is the searching algorithm. 

> [****Searching algorithms****](https://www.geeksforgeeks.org/searching-algorithms/) are used to find a specific element in an array, string, linked list, or some other data structure. 

The most common searching algorithms are:

- [Linear Search](https://www.geeksforgeeks.org/linear-search/) – In this searching algorithm, we check for the element iteratively from one end to the other.
- [Binary Search](https://www.geeksforgeeks.org/binary-search/) – In this type of searching algorithm, we break the data structure into two equal parts and try to decide in which half we need to find for the element. 
- [Ternary Search](https://www.geeksforgeeks.org/ternary-search/) – In this case, the array is divided into three parts, and based on the values at partitioning positions we decide the segment where we need to find the required element.

Besides these, there are other searching algorithms also like 

- [Jump Search](https://www.geeksforgeeks.org/jump-search/)
- [Interpolation Search](https://www.geeksforgeeks.org/interpolation-search/) 
- [Exponential Search](https://www.geeksforgeeks.org/exponential-search/) 

### [2. Sorting Algorithm](https://www.geeksforgeeks.org/sorting-algorithms/)

Here is one other most used algorithm. Often we need to arrange or sort data as per a specific condition. The sorting algorithm is the one that is used in these cases. Based on conditions we can sort a set of homogeneous data in order like sorting an array in increasing or decreasing order. 

> ****Sorting Algorithm**** is used to rearrange a given array or list elements according to a comparison operator on the elements. The comparison operator is used to decide the new order of element in the respective data structure.

![An example to show Sorting](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20230726172607/Sorting-Algorithms.png)

An example to show Sorting

There are a lot of different types of sorting algorithms. Some widely used algorithms are:

- [Bubble Sort](http://www.geeksforgeeks.org/bubble-sort/)
- [Selection Sort](http://www.geeksforgeeks.org/selection-sort/)
- [Insertion Sort](http://www.geeksforgeeks.org/insertion-sort/)
- [Quick Sort](http://www.geeksforgeeks.org/quick-sort/)
- [Merge Sort](http://www.geeksforgeeks.org/merge-sort/)

There are several other sorting algorithms also and they are beneficial in different cases. You can learn about them and more in our dedicated article on [Sorting algorithms](https://www.geeksforgeeks.org/sorting-algorithms/).

### [3. Divide and Conquer Algorithm](https://www.geeksforgeeks.org/introduction-to-divide-and-conquer-algorithm-data-structure-and-algorithm-tutorials/)

This is one interesting and important algorithm to be learned in your path of programming. As the name suggests, it breaks the problem into parts, then solves each part and after that again merges the solved subtasks to get the actual problem solved. 

> ****Divide and Conquer**** is an algorithmic paradigm. A typical Divide and Conquer algorithm solves a problem using following three steps.
> 
> 1. ****Divide:**** Break the given problem into subproblems of same type.
> 2. ****Conquer:**** Recursively solve these subproblems
> 3. ****Combine:**** Appropriately combine the answers

This is the primary technique mentioned in the two sorting algorithms __Merge Sort__ and __Quick Sort__ which are mentioned earlier. To learn more about the technique, the cases where it is used, and its implementation and solve some interesting problems, please refer to the dedicated article [Divide and Conquer Algorithm](https://www.geeksforgeeks.org/divide-and-conquer-algorithm-introduction/).

### [4. Greedy Algorithms](https://www.geeksforgeeks.org/introduction-to-greedy-algorithm-data-structures-and-algorithm-tutorials/)

As the name suggests, this algorithm builds up the solution one piece at a time and chooses the next piece which gives the most obvious and immediate benefit i.e., which is the most optimal choice at that moment. So the problems where choosing locally optimal also leads to the global solutions are best fit for Greedy.

For example, consider the [Fractional Knapsack Problem](https://www.geeksforgeeks.org/fractional-knapsack-problem/). The local optimal strategy is to choose the item that has maximum value vs weight ratio. This strategy also leads to a globally optimal solution because we are allowed to take fractions of an item.

![Fractional Knapsack Problem](https://www.geeksforgeeks.org/wp-content/uploads/Fractional-Knapsackexample-min-768x384.png)

Fractional Knapsack Problem

Here is how you can get started with the Greedy algorithm with the help of relevant sub-topics:

- [Standard greedy algorithms](https://www.geeksforgeeks.org/greedy-algorithms/#standardgreedy)
- [Greedy algorithms in graphs](https://www.geeksforgeeks.org/greedy-algorithms/#greedygraph)
- [Greedy Algorithms in Operating Systems](https://www.geeksforgeeks.org/greedy-algorithms/#greedyos)
- [Greedy algorithms in array](https://www.geeksforgeeks.org/greedy-algorithms/#greedyarray)
- [Approximate greedy algorithms for NP-complete problems](https://www.geeksforgeeks.org/greedy-algorithms/#approximate)

### [5. Recursion](https://www.geeksforgeeks.org/introduction-to-recursion-data-structure-and-algorithm-tutorials/)

Recursion is one of the most important algorithms which uses the concept of code reusability and repeated usage of the same piece of code. 

![Recursion](https://media.geeksforgeeks.org/wp-content/cdn-uploads/Recursive-Functions-in-c.png)

Recursion

The point which makes Recursion one of the most used algorithms is that it forms the base for many other algorithms such as:

- [Tree traversals](https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/)
- [Graph traversals](https://www.geeksforgeeks.org/algorithms-gq/graph-traversals-gq/)
- [Divide and Conquers Algorithms](https://www.geeksforgeeks.org/divide-and-conquer-algorithm-introduction/)
- [Backtracking algorithms](https://www.geeksforgeeks.org/backtracking-algorithms/) 

In Recursion, you can follow the below articles/links to get the most out of it: 

- [Recursion](https://www.geeksforgeeks.org/recursion/)
- [Recursive Functions](https://www.geeksforgeeks.org/recursive-functions/)
- [Tail Recursion](https://www.geeksforgeeks.org/tail-recursion/)
- [Towers of Hanoi (TOH)](https://www.geeksforgeeks.org/c-program-for-tower-of-hanoi/)

### 6. [Backtracking Algorithm](https://www.geeksforgeeks.org/introduction-to-backtracking-data-structure-and-algorithm-tutorials/)

As mentioned earlier, the Backtracking algorithm is derived from the Recursion algorithm, with the option to revert if a recursive solution fails, i.e. in case a solution fails, the program traces back to the moment where it failed and builds on another solution. So basically it tries out all the possible solutions and finds the correct one.

> [****Backtracking****](http://www.geeksforgeeks.org/backtracking-algorithms/) is an algorithmic technique for solving problems recursively by trying to build a solution incrementally, one piece at a time, removing those solutions that fail to satisfy the constraints of the problem at any point of time 

Some important and most common problems of backtracking algorithms, that you must solve before moving ahead, are:

- [Knight’s tour problem](https://www.geeksforgeeks.org/the-knights-tour-problem-backtracking-1/)
- [Rat in a maze](https://www.geeksforgeeks.org/rat-in-a-maze-backtracking-2/)
- [N-Queen problem](https://www.geeksforgeeks.org/n-queen-problem-backtracking-3/)
- [Subset sum problem](https://www.geeksforgeeks.org/subset-sum-backtracking-4/)
- [m-coloring problem](https://www.geeksforgeeks.org/m-coloring-problem-backtracking-5/)
- [Hamiltonian cycle](https://www.geeksforgeeks.org/hamiltonian-cycle-backtracking-6/)
- [Sudoku](https://www.geeksforgeeks.org/sudoku-backtracking-7/)

### 7. [Dynamic Programming](https://www.geeksforgeeks.org/introduction-to-dynamic-programming-data-structures-and-algorithm-tutorials/)

Another crucial algorithm is dynamic programming. Dynamic Programming is mainly an optimization over plain recursion. Wherever we see a recursive solution that has repeated calls for the same inputs, we can optimize it using Dynamic Programming. 

> The main concept of the [Dynamic Programming algorithm](https://www.geeksforgeeks.org/dynamic-programming/) is to use the previously calculated result to avoid repeated calculations of the same subtask which helps in reducing the time complexity. 
