package org.example.sort;

import java.util.List;

public class BubbleSort {

    public static List<Integer> sort(List<Integer> data) {

        if(data == null)
            throw new IllegalArgumentException("Sort data cannot be null");

        if(data.size() <= 1)
            return data;

        while (true) {

            boolean isSorted = true;

            for (int i = 0; i < data.size() - 1; i++) {

                int index = data.get(i);
                if (index > data.get(i + 1)) {
                    data.set(i, data.get(i + 1));
                    data.set(i + 1, index);
                    isSorted = false;
                }

            }

            if (isSorted)
                break;
        }

        return data;
    }
}
