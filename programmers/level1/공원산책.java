/*
 * [손으로 풀기]
 * 1. 일단 공원 지도(park)랑 명령들(routes)을 받아서 크기를 먼저 파악하자.
 * 2. 시작 지점 'S'가 어디 있는지 찾아야 하니까 이중 for문 돌려서 좌표 (r, c) 뽑기
 * 3. 명령어를 하나씩 꺼내서 (방향, 거리)로 쪼개기.
 * 4. 이동할 때 한 번에 껑충 뛰면 안 되고, 한 칸씩 가보면서 'X'가 있는지나 밖으로 나가는지 체크해야 함.
 * 5. 이 때 임시 변수(nr, nc)를 만들기
 * 6. 만약 중간에 장애물을 만나거나 맵 밖이면 무시해야 됨(flag).
 * 7. 끝까지 무사히 갔을 때만 원래 좌표(r, c)를 갱신해주면 끝
 */

class Solution {
  public int[] solution(String[] park, String[] routes) {
    int h = park.length;
    int w = park[0].length();

    int r = 0;
    int c = 0;

    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if (park[i].charAt(j) == 'S') {
          r = i;
          c = j;
          break;
        }
      }
    }

    for (String route : routes) {
      String[] split = route.split(" ");
      String dir = split[0];
      int dist = Integer.parseInt(split[1]);

      int dr = 0;
      int dc = 0;

      if (dir.equals("N")) {
        dr = -1;
      } else if (dir.equals("S")) {
        dr = 1;
      } else if (dir.equals("W")) {
        dc = -1;
      } else if (dir.equals("E")) {
        dc = 1;
      }

      int nr = r;
      int nc = c;
      boolean canMove = true;

      for (int i = 0; i < dist; i++) {
        nr += dr;
        nc += dc;

        if (nr < 0 || nr >= h || nc < 0 || nc >= w || park[nr].charAt(nc) == 'X') {
          canMove = false;
          break;
        }
      }

      if (canMove) {
        r = nr;
        c = nc;
      }
    }

    return new int[]{r, c};
  }
}