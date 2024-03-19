package queue;

import java.util.*;
import java.util.stream.Collectors;

public class LRUCache {

    public static void main(String[] args) {
        List<Integer> a=Arrays.asList(1 ,2 ,3 ,4 ,2 ,3, 5 ,1, 6 ,7 ,1 ,8);

        System.out.println(solve(a));

    }



    public  static  List<List<Integer>> solve(List<Integer> a){
        Queue<Integer> cache=  new LinkedList<>();
        List<Integer> arr= new ArrayList<>();
        List<List<Integer>> ans= new ArrayList<>();

        for (int i = 0; i <a.size() ; i++) {
            if(cache.size()>2){
                cache.remove();
            }
               cache.add(a.get(i));
                arr = cache.stream().collect(Collectors.toCollection(ArrayList::new));
                ans.add(arr);
                arr = new ArrayList<>();

        }

        return ans;

    }





/*
1 2 3 4 2 3 5 1 6 7 1 8
cache 3

6,4,5--smallest
4,2,3
------------
-->1,2,3-->
4,1,2
2,4,1
3,2,4
------------

1
1 2
1 2 3
2 3 4
2 3 4
2 3 4
2 3 5
3 5 1
5 1 6
1 6 7
1 6 7
1 7 8
[[1], [1, 2], [1, 2, 3], [2, 3, 4], [3, 4, 2], [4, 2, 3], [2, 3, 5], [3, 5, 1], [5, 1, 6], [1, 6, 7], [6, 7, 1], [7, 1, 8]]
* */
}
