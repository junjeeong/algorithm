package ch12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P43_코스일정 {

  public boolean dfs(Map<Integer, List<Integer>> finishToTakeMap, Integer finish,
      List<Integer> takes) {
    if (takes.contains(finish)) {
      return false;
    }

    if (finishToTakeMap.containsKey(finish)) {
      takes.add(finish);
      for (Integer take : finishToTakeMap.get(finish)) {
        if (!dfs(finishToTakeMap, take, takes)) {
          return false;
        }
      }
      takes.remove(finish);
    }

    return true;
  }

  public boolean canFinish(int numCourses, int[][] prerequisites) {
    Map<Integer, List<Integer>> finishToTakeMap = new HashMap<>();

    for (int[] pre : prerequisites) {

      finishToTakeMap.putIfAbsent(pre[0], new ArrayList<>());

      finishToTakeMap.get(pre[0]).add(pre[1]);
    }

    List<Integer> takes = new ArrayList<>();

    for (Integer finish : finishToTakeMap.keySet()) {

      if (!dfs(finishToTakeMap, finish, takes)) {
        return false;
      }
    }

    return true;
  }
}