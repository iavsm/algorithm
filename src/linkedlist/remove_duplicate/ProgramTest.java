package linkedlist.remove_duplicate;// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import org.junit.Test;

import java.util.*;

class ProgramTest {
  public Program.LinkedList addMany(Program.LinkedList ll, List<Integer> values) {
    Program.LinkedList current = ll;
    while (current.next != null) {
      current = current.next;
    }
    for (int value : values) {
      current.next = new Program.LinkedList(value);
      current = current.next;
    }
    return ll;
  }

  public List<Integer> getNodesInArray(Program.LinkedList ll) {
    List<Integer> nodes = new ArrayList<Integer>();
    Program.LinkedList current = ll;
    while (current != null) {
      nodes.add(current.value);
      current = current.next;
    }
    return nodes;
  }

  @org.junit.jupiter.api.Test
  public void TestCase1() {
    Program.LinkedList input = new Program.LinkedList(1);
    addMany(input, new ArrayList<Integer>(Arrays.asList(1, 3, 4, 4, 4, 5, 6, 6)));
    List<Integer> expectedNodes = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5, 6));
    Program.LinkedList output = new Program().removeDuplicatesFromLinkedList(input);
    assert(getNodesInArray(output).equals(expectedNodes));
  }
}
