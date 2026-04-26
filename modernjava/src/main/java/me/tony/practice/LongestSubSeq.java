package me.tony.practice;

import java.util.List;

public class LongestSubSeq {

    public int longestSubSeqSize(List<Integer> list) {
        int max = 0;

        int minIdx = 0;
        int maxIdx = 0;
        for (int i = 0; i <list.size(); i++) {
            if (list.get(i) < list.get(minIdx)) {
                minIdx = i;
            }
        }
        return 0;
    }
}
