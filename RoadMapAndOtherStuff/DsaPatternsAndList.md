🔑 Common DSA Patterns
1. Sliding Window
[text](https://www.youtube.com/watch?v=EHCGAZBbB88&list=PL_z_8CaSLPWeM8BDJmIYDaoQ5zuwyxnfj&index=1)
Used for subarrays/substrings, when you need to maintain a "window" over data.

Problems:

Longest Substring Without Repeating Characters

Maximum Sum Subarray of Size K

Minimum Window Substring

2. Two Pointers
Refs : 
[text](https://www.youtube.com/watch?v=pqzvpK8zTHU&list=PLpIkg8OmuX-LtRw7om1-EV6aJMRKjbSSR)
One pointer at start, one at end (or slow/fast pointer).

Problems:

Two Sum (sorted array)

3Sum / 4Sum

Remove Duplicates from Sorted Array

Linked list cycle detection
------------------------------------------------------------------------------
3. Fast & Slow Pointers (Tortoise and Hare)

Special case of two pointers, often in linked lists.

Problems:

Detect Cycle in Linked List

Find Middle Node of Linked List

4. Prefix Sum / Difference Array

Precompute sums to answer range queries quickly.

Problems:

Subarray Sum Equals K

Range Sum Query (Immutable/Mutable)

5. Hashing / Frequency Map

Use HashMap/HashSet to count, check duplicates, store indexes.

Problems:

Two Sum (unsorted)

Group Anagrams

Longest Consecutive Sequence

6. Binary Search

Search in sorted arrays, or on the answer space.

Problems:

Binary Search in Rotated Sorted Array

Search Insert Position

Find Minimum in Rotated Array

Aggressive Cows / Allocate Books (binary search on answer)

7. Sorting + Greedy

Sort the input, then make greedy choices.

Problems:

Activity Selection Problem

Minimum Number of Arrows to Burst Balloons

Interval Scheduling / Merge Intervals

8. Backtracking

Try all possibilities (DFS style), undo (backtrack).

Problems:

N-Queens

Sudoku Solver

Generate Parentheses

Subsets / Permutations

9. Dynamic Programming (DP)

Break problem into subproblems + store results.

Categories:

1D DP → Fibonacci, Climbing Stairs

2D DP → Longest Common Subsequence, Edit Distance

Knapsack DP → Subset Sum, Coin Change

DP on Strings → Palindrome Partitioning

10. Graph Traversal

BFS, DFS, Dijkstra, Union-Find.

Problems:

Number of Islands

Shortest Path in Graph

Detect Cycle in Graph

Minimum Spanning Tree (Kruskal/Prim)

11. Heap / Priority Queue

Get min/max efficiently.

Problems:

Kth Largest Element

Merge K Sorted Lists

Top K Frequent Elements

12. Monotonic Stack / Queue

Stack or queue that maintains monotonic property.

Problems:

Next Greater Element

Largest Rectangle in Histogram

Trapping Rain Water

13. Union-Find (Disjoint Set)

Group elements efficiently.

Problems:

Connected Components

Kruskal’s MST

Accounts Merge

14. Bit Manipulation

Use XOR, AND, OR to solve problems.

Problems:

Single Number (XOR trick)

Subsets using bits

Count set bits

15. Matrix Traversal

BFS/DFS on 2D grid.

Problems:

Rotting Oranges

Word Search

Spiral Matrix












////////
Don’t study in a straight line — instead use a spiral / layered approach.

🔑 A Better Approach to Learn DSA Patterns
1. First Pass – Breadth (Shallow)

Read all patterns at a high level (just understand the “theme”).

Don’t deep dive yet.

Example: “Sliding Window is for subarrays/substrings with continuous property.”

2. Second Pass – Depth (Practice Core Problems)

Pick 1–2 classic problems per pattern and solve them.

Don’t try to master the entire pattern at once.

Example:

Sliding Window → "Longest Substring Without Repeating Characters"

Two Pointers → "Two Sum (sorted array)"

3. Spaced Repetition (Revision Loop)

After finishing 2–3 patterns, go back and re-solve 1 problem from earlier patterns.

This way, older concepts stay fresh while you’re learning new ones.

4. Pattern Notebook / Cheatsheet

Maintain your own pattern summary notes:

Pattern Name

When to apply

One template code

2–3 example problems

This will act as your personal reference book.

5. Mix Easy, Medium, Hard

Don’t grind only easy problems → mix.

Example: 1 easy + 1 medium from Sliding Window → move on.

When you return to Sliding Window later, try 1 hard problem.

6. Weekly Revision

Every weekend, quickly revisit your solved problems:

Can I solve it again without looking at code?

Do I remember the pattern?

7. Mock Interview Practice

Once you’ve done most patterns once, start doing mixed sets of problems (random LeetCode practice).

This simulates the interview — you won’t be told “this is a sliding window problem”.