package linkedlist.remove_duplicate;


//          You're given the head of a Singly Linked List whose nodes are in sorted order
//          with respect to their values. Write a function that returns a modified version
//          of the Linked List that doesn't contain any nodes with duplicate values. The
//          Linked List should be modified in place (i.e., you shouldn't create a brand
//          new list), and the modified Linked List should still have its nodes sorted
//          with respect to their values.

class Program {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        // Write your code here.
        LinkedList currentNode = linkedList;
        while(currentNode != null) {
            LinkedList nextNode = linkedList.next;
            while(nextNode != null && currentNode.value == nextNode.value) {
                nextNode = nextNode.next;
            }
            currentNode.next = nextNode;
            currentNode = nextNode;
        }
        return linkedList;
    }
}