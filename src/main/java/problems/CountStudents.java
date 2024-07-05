package problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class CountStudents {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentQueue = new LinkedList<>();
        Stack<Integer> sandwichesStack = new Stack<>();
        int unsatisfiedStudents = 0;
        
        for (int student : students) {
            studentQueue.add(student);
        }
        
        for (int sndwch : sandwiches) {
            sandwichesStack.push(sndwch);
        }
        
        while (!studentQueue.isEmpty() && studentQueue.size() > unsatisfiedStudents) {
            if (studentQueue.peek() == sandwichesStack.peek()) {
                studentQueue.poll();
                sandwichesStack.pop();
                unsatisfiedStudents = 0;
            } else {
                studentQueue.add(studentQueue.peek());
                studentQueue.poll();
                unsatisfiedStudents++;
            }
        }
        
        return studentQueue.size();
    }
}
