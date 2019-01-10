import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum[] = new int[6];
        int lotto[] = new int[6];
        int rules;
        int count = 0;
        boolean flag = true;
        while (flag) {
            showManu();
            rules = scn.nextInt();
            switch (rules) {
                case 1:
                    System.out.println("Play rules");
                    System.out.println("大樂透是一種樂透型遊戲。您必須從1～49中任選6個號碼進行投注。");
                    System.out.println("6個選號中，如果有3個以上(含3個號碼)對中當期開出之6個號碼，即為中獎，並可以規定兌領獎金。");
                    System.out.println("頭獎對中6個數字，貳獎對中5個數字，参獎對中4個數字，肆獎對中3個數字");
                    System.out.println("頭獎：50000$，貳獎：20000$，参獎：10000$，肆獎：5000$");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("請輸入您的號碼：");
                    for (int i = 0; i < 6; i++) {
                        sum[i] = scn.nextInt();
                    }
                    System.out.println("樂透開獎號碼為：");

                    lotto[0] = (int) (Math.random() * 49 + 1);
                    lotto[1] = (int) (Math.random() * 49 + 1);
                    lotto[2] = (int) (Math.random() * 49 + 1);
                    lotto[3] = (int) (Math.random() * 49 + 1);
                    lotto[4] = (int) (Math.random() * 49 + 1);
                    lotto[5] = (int) (Math.random() * 49 + 1);

                    System.out.print(lotto[0] + " ");
                    System.out.print(lotto[1] + " ");
                    System.out.print(lotto[2] + " ");
                    System.out.print(lotto[3] + " ");
                    System.out.print(lotto[4] + " ");
                    System.out.print(lotto[5] + " ");
                    System.out.println();

                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            if (sum[i] == lotto[j]) {
                                count++;
                            }
                        }
                    }
                    if (count == 6) {
                        System.out.println("恭喜您中了頭獎，獎金50000$！");
                        System.out.println();
                    } else if (count == 5) {
                        System.out.println("恭喜您中了貳獎，獎金20000$！");
                        System.out.println();
                    } else if (count == 4) {
                        System.out.println("恭喜您中了參獎，獎金10000$！");
                        System.out.println();
                    } else if (count == 3) {
                        System.out.println("恭喜您中了肆獎，獎金5000$！");
                        System.out.println();
                    } else {
                        System.out.println("很抱歉沒有中，至少要3個喔！");
                        System.out.println();
                    }

                    break;
                case 3:
                    System.out.println("Bye bye");
                    flag = false;
                    break;
            }
        }
    }

    public static void showManu() {
        System.out.println("歡迎來到樂透猜猜看～");
        System.out.println("1：觀看規則");
        System.out.println("2：開始遊戲");
        System.out.println("3：離開遊戲");
    }
}
