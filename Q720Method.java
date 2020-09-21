import java.util.Scanner;

class Main {
                  [0][1][2]
     //            1  3  4  7  9  11
     //                 [3][4][5]         2       99
  static void aryIns(int[] a, int idx, int x) {
    if (idx >= 0 && idx < a.length) {
      for (int i = a.length-1; i > idx; i--)
        a[i] = a[i-1];
      a[idx] = x;
    }
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("요소 수 : ");
    int num = stdIn.nextInt();
    int[] a = new int[num];

    for (int i = 0 ; i < num ; i++) {
      System.out.print("a[" + i + "] : ");
      a[i] = stdIn.nextInt();
    }

    System.out.print("삭제를 시작할 인덱스 : ");
    int idx = stdIn.nextInt();

    System.out.print("삭제할 요소의 수 : ");
    int n = stdIn.nextInt();

    aryRmvN(a, idx, n);
    for (int i = 0 ; i < num ; i++)
      System.out.println("a[" + i + "] = " + a[i]);
  }
}

