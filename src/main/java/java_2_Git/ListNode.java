package main.java.java_2_Git;

public class ListNode {
int val;
ListNode next;

public ListNode() {
}

@Override
public String toString() {
	return "" +
			"" + val +
			"," + next;
}

public ListNode(int val) {
	this.val = val;
}

public ListNode(int val, ListNode next) {
	this.val = val;
	this.next = next;
}
}
