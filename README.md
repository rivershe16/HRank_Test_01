
## Streamlinity Coding Test: Binary Search Tree
### Technical instructions

Welcome to the Streamlinity Coding Test (time limit: 70 minutes). We
hope you find it interesting. Good luck!

Your task is to build a Binary Search Tree class that passes the test
suite contained in this project. Here are some pointers for what you
need to do and how this project is structured.

### What you need to do 

<ul>
<li>Expand the Bst class to implement all the required code and logic.
The Bst class is in src/main/java/com/streamlinity/ct/bst/solution.
</li>
<li>The Bst class implements an interface BstOpsInterface in the api
package. Please review this API and comments in this immutable API.
</li>
<li>As you develop your BST logic,  you can use the unit tests to test 
and validate your code.  These tests are in the 
src/test/java/com/streamlinity/ct/bst/ directory
</li>
</ul>  

### Correctness checking after you submit.

The included unit tests will be run when you submit and your results
will determine the Coding Test outcome. You will be contacted after the
test with the outcome of the Coding Test.

### Working with the Spring project

While this starter project is set up as a Spring Project for easier
management, you do not really need to do anything to make it work in the
Spring environment. It is already all set up for you to work in the
Spring Way. A couple of caveats and pointers:

<ul>
<li>The Bst class you develop will be instantiated as a Bean by the pre-existing 
BstConfig class src/main/java/com/streamlinity/ct/bst/springConfiguration.  
This will already take care of the Spring Bean instantiation and injection of your Bst class as a Bean.  
<strong>You do not need to do anything further for this.</strong>.
</li>
<li>Before running the tests,  do not define any active Profiles.   
Your Bst Bean gets instantiated already in the Default profile - defining another active profile will inhibit its instantiation.
</li>
</ul> 

### Working offline vs. working in the HackerRank IDE

This is entirely your choice. The Hacker Rank IDE is reasonable but is
not as full function as your offline IDEA or Eclipse IDE. If you are
going to use the HackerRank IDE, please make sure you want the Tutorial
video ahead of time.

The offline IDE usage model works quite well in our opinion. And of
course, you get to use the IDE you are most familiar with.

Please note that the time limit is the same no matter which IDE you use.
   
   


