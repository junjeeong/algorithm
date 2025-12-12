class Solution {

  public int numJewelsInStones(String jewels, String stones) {
    int count = 0;
    Map<Character, Integer> freqs = new HashMap<>();

    for (char s : stones.toCharArray()) {
      if (freqs.containsKey(s)) {
        freqs.put(s, freqs.get(s) + 1);
      } else {
        freqs.put(s, 1);
      }
    }

    for (char j : jewels.toCharArray()) {
      if (freqs.containsKey(j)) {
        count += freqs.get(j);
      }
    }
    return count;
  }
}