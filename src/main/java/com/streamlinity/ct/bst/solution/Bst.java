package com.streamlinity.ct.bst.solution;

import com.streamlinity.ct.bst.api.BstOpsInterface;

import java.util.List;

import java.util.*;

/**
 * Class to be filled out by candidates for the Binary Search
 * Tree problem.   See documentation of the interfaces at {@link BstOpsInterface}.
 *
 * Notes:
 * <ul>
 *     <li>This class Name should remain unchanged.  Just fill out the logic. </li>
 *     <li>You can run the tests in the test directory or create your own additional/simpler tests</li>
 *     <li>The springConfiguration package already causes this to get instantiated correctly if you obey the above rule</li>
 * </ul>
 */

public class Bst implements BstOpsInterface {

    class BSTNode {
        int val;
        List<Integer> indices;

        BSTNode left;
        BSTNode right;

        public BSTNode(int val) {
            this.val = val;
            this.indices = new LinkedList<>();
        }
    }

    BSTNode root = null;

    @Override
    public void init(int[] values) {
        for (int i = 0; i < values.length; i++) {
            if (i == 0) {
                root = new BSTNode(values[0]);
                root.indices.add(0);
            } else {
            	List<Integer> indices = search(values[i]);
                if (indices.size() == 0) { // not found
                    addNode(values[i], i);
                } else {
                    indices.add(i);
                }
            }                   
        }
    }

    public void addNode(int value, int index) {
        BSTNode prev = null;
        BSTNode node = root;
        while (node != null) {
            prev = node;
            if (value > node.val) {
                node = node.right;
            } else {
                node = node.left;
            }
        }
        if (value > prev.val) {
            prev.right = new BSTNode(value);
            prev.right.indices.add(index);
        } else {
            prev.left = new BSTNode(value);
            prev.left.indices.add(index);
        }
    }

    @Override
    public void clear() {
        root = null;
    }

    @Override
    public List<Integer> search(int value) {
        BSTNode node = root;
        while (node != null) {
            if (node.val == value) {
                return node.indices;
            }
            if (value > node.val) {
                node = node.right;
            } else {
                node = node.left;
            }
        }
        return new LinkedList<>();
    }

    @Override
    public List<Integer> getBstValues() {
        return getBstValuesInOrder();
    }

    @Override
    public List<Integer> getBstValuesInOrder() {
        List<Integer> inOrder = new LinkedList<>();
        Stack<BSTNode> stack = new Stack<>();
        BSTNode curr = root;
        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            inOrder.add(curr.val);
            curr = curr.right;
        }
        return inOrder;
    }
}
