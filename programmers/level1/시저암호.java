/*
 * [손으로 풀기]
 * 1. 일단 문자열 s에서 글자를 하나씩 다 뜯어서 확인.
 * 2. 공백은 그냥 아무것도 안 하고 바로 결과에 붙이고 넘어가기.
 * 3. 소문자랑 대문자는 아스키 코드 숫자가 다르니까 따로 나눠서 생각한다.
 * 4. n만큼 밀 때 'z'나 'Z' 넘어가는 게 젤 까다로운데 이렇게 하면 편함:
 *  - 현재 글자에서 'a'나 'A'를 빼서 일단 0~25 사이 숫자로 만든다.
 *  - 거기다 n을 더한다.
 *  - 이걸 26(알파벳 전체 개수)으로 나눈 나머지를 구하면 자동으로 z 다음에 a로 돌아간다!
 *  - 마지막에 아까 뺐던 'a'나 'A'를 다시 더해주면 글자 완성.
 * 5. 바뀐 글자들 StringBuilder에 모아서 한 번에 내보내기.
 */

class Solution {
  public String solution(String s, int n) {
    StringBuilder answer = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      if (ch == ' ') {
        answer.append(ch);
        continue;
      }

      if (ch >= 'a' && ch <= 'z') {
        char shifted = (char) ((ch - 'a' + n) % 26 + 'a');
        answer.append(shifted);
      }
      else if (ch >= 'A' && ch <= 'Z') {
        char shifted = (char) ((ch - 'A' + n) % 26 + 'A');
        answer.append(shifted);
      }
    }

    return answer.toString();
  }
}