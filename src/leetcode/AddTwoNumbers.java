package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class AddTwoNumbers {
//
//     public static class ListNode {
//        int val;
//        ListNode next;
//        ListNode() {}
//        ListNode(int val) { this.val = val; }
//        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//    }
//
//
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode result = new ListNode(0);
//         ListNode current = result;
//         int carry = 0;
//
//         while (l1 != null || l2 != null || carry > 0) {
//             int sum = carry;
//             if (l1 != null) {
//                 sum += l1.val;
//                 l1 = l1.next;
//             }
//
//             if (l2 != null) {
//                 sum += l2.val;
//                 l2 = l2.next;
//             }
//
//             carry = sum / 10;
//             current = new ListNode(sum % 10);
//             current = current.next;
//
//         }
//        return result.next;
//    }
//

//    public static void main(String[] args) {
//
//        List<Integer> l1 = new LinkedList<>(Arrays.asList(2, 4, 3));
//        List<Integer> l2 = new LinkedList<>(Arrays.asList(5, 6, 4));
//
//        addTwoNumbers(new LinkedList<>(Arrays.asList(2, 4, 3)), new LinkedList<>(Arrays.asList(5, 6, 4)));
//    }

//    public static void main(String[] args) {
//        List<Integer> l1 = new LinkedList<>(Arrays.asList(9,9,9,9,9,9,9));
//        List<Integer> l2 = new LinkedList<>(Arrays.asList(9,9,9,9));
//        StringBuilder sb = new StringBuilder();
//        StringBuilder sb1 = new StringBuilder();
//        List<Integer> result = new LinkedList<>();
//        int sum = 0;
//
//
//        for (int el : l1) {
//            sb.append(el);
//        }
//
//        for (int el2 : l2) {
//            sb1.append(el2);
//        }
//
//        sum = Integer.parseInt(String.valueOf(sb1)) + Integer.parseInt(String.valueOf(sb));
//
//        while (sum > 0) {
//            result.add(sum % 10);
//            sum /= 10;
//        }
////        result.add((Integer.parseInt(String.valueOf(sb1)) + Integer.parseInt(String.valueOf(sb))));
//
//
//        System.out.println(result);
//
//
//    }

//    public static void main(String[] args) {
//         ListNode l1 = new ListNode(9999999);
//         ListNode l2 = new ListNode(9999);
//        AddTwoNumbers obj = new AddTwoNumbers();
//        obj.addTwoNumbers(l1, l2);
//
//    }
}
