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
