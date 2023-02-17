//package main.java.java_2_Git;
//
//import java.util.*;
//
//public class Test {
//public static void main(String[] args) {
//
////	System.out.println("\n" + mergeKLists(new ListNode[]
////			{
////			new ListNode(1,new ListNode(4,new ListNode(5))),
////			new ListNode(1,new ListNode(3,new ListNode(4))),
////			new ListNode(2,new ListNode(6))
////			}
////	));
//	System.out.println("\n" + mergeKLists(new ListNode[]
//			{
//					new ListNode(1,new ListNode(4,new ListNode(5))),
//					new ListNode(1,new ListNode(3,new ListNode(4))),
//					new ListNode(2,new ListNode(6))
//			}
//	));
//
//
//}
//
//public static ListNode mergeKLists(ListNode[] lists) {
//
//	ListNode listNode = null;
//	ListNode listStart = null;
//	while (true){
//		if(lists.length == 0)return new ListNode();
//		for (int i = 0; i < lists.length; i++) {
//			if(lists[i] != null)break;
//			else if(i == lists.length -1){
//				return null;
//			}
//		}
//		else if(listNode == null){
//			listNode = new ListNode();
//			listStart = listNode;
//		}else {
//			listNode.next = new ListNode();
//			listNode = listNode.next;
//		}
//
//		Integer number = null;
//		int index = 0;
//		for (int i = 0; i < lists.length; i++) {
//			if(number == null){
//				if(lists[i] != null){
//					number = lists[i].val;
//					index = i;
//				}
//			}else if(lists[i] != null && lists[i].val < number){
//				number = lists[i].val;
//				index = i;
//			}
//			if(number != null && i == lists.length - 1){
//				listNode.val = number;
//
//				lists[index] = lists[index].next;
//
//			}
//		}
//		boolean bol  = false;
//		for (ListNode list : lists) {
//			if (list != null) {
//				bol = true;
//				break;
//			}
//		}
//		if(bol)continue;
//		break;
//	}
//	return listStart;
//}
//
//
//
//
//}
//
