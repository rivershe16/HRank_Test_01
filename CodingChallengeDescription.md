Streamlinity Coding Test: Data Structures - BinarySearchTree

1. You are given an array of numbers.  It can have duplicate values and it could be so big that you
   should not be pre-sorting it using any Array utilities.
2. You need to build a Binary Search Tree for all the values in the array so you can search for a value
   and return its index(es) in the original array.  Your BinarySearchTree code should be able to handle
   duplicate values in array. Search should return ALL index values where the search element is found
   in original array
3. Your BinarySearchTree Class should implement all methods in the BstOpsInterface - init, search,
   getBstValues and getBstValuesInOrder (please see interface definition in the project)
4. There is no requirement that your binary search tree be balanced.
5. You should not use any auxiliary structures like hashmaps etc.   This problem should be
   solved by just constructing a tree.
6. In the Binary Search tree,   you should maintain the properties below at every node (during construction
   of the tree & subsequent inserts of new values into the tree)
        Parent.value > left_child.value
        Parent.value < right_child.value
   Please note that this essentially means that the binary search tree cannot have multiple nodes with the same value.


Expected Output


* In an array like {0, 13, 11, 5, 24, 33, 44, 22}
   * search(24) should return index value 4
   * Search(235) should return a null index value (since value is not found)

* If array has duplicates e.g. { 23 36 98  333 24 12 15 16 39 45 23 98}
   * Search(23) should return 0, 10
   * Search(24) should return 4
   * Search(235) should return a null index value (since value is not found)