/*
* You are given a number n, representing the number of time-intervals.
* In the next n lines, you are given a pair of space separated numbers.
* The pair of numbers represnt the start time and end time of a meeting (first number is start time and second number is end time)
* You are required to merge the meetings and print the merged meetings output in increasing order of start time.
* */
package DSA_Level_1._8_StackAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class _12_MergeOverlappingIntervals {

    static class Pair implements Comparable<Pair> {
        int st;
        int et;

        Pair(int st, int et){
            this.st = st;
            this.et = et;
        }

        @Override
        public int compareTo(Pair o) {
            if(this.st != o.st) return this.st - o.st;
            return this.et - o.et;
        }

        @Override
        public String toString() {
            return "(" + this.st + ", " + this.et + ")";
        }
    }

    public void main(String[] args){
        int[][]temp = {{22, 28}, {1, 8}, {25, 27}, {14, 19}, {27, 30}, {5, 12}};
        Pair[] meetings = new Pair[6];
        for(int i=0; i<temp.length; i++)
            meetings[i] = new Pair(temp[i][0], temp[i][1]);

        Arrays.sort(meetings);
        System.out.println(Arrays.toString(meetings));

        Stack<Pair> st = new Stack<>();
        st.push(meetings[0]);
        for(int i=1; i<meetings.length; i++){
            Pair mt = st.peek();
            if(mt.et < meetings[i].st) st.push(meetings[i]);
            else mt.et = Math.max(mt.et, meetings[i].et);
        }
        Stack<Pair> rs = new Stack<>();
        while (!st.isEmpty()) rs.push(st.pop());

        while (!rs.isEmpty()) System.out.println(rs.pop());
    }
}
