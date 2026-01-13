class Solution {
  public int solution(int a, int b, int n) {
    int totalCoke = 0;
    int currentEmptyBottles = n;

    while (currentEmptyBottles >= a) {

      int newCoke = (currentEmptyBottles / a) * b;

      int remainBottles = currentEmptyBottles % a;

      totalCoke += newCoke;

      currentEmptyBottles = newCoke + remainBottles;
    }

    return totalCoke;
  }
}