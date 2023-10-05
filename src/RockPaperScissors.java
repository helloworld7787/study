
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int n, winCount = 0, loseCount = 0;

        System.out.print("请输入游戏局数：");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("第 " + (i+1) + " 局比赛开始");
            System.out.print("请输入您的出拳（石头：0，剪刀：1，布：2）：");
            int userChoice = input.nextInt();
            int computerChoice = rand.nextInt(3);
            System.out.println("电脑出拳为：" + computerChoice);

            if (userChoice == computerChoice) {
                System.out.println("平局！");
            } else if ((userChoice == 0 && computerChoice == 1) ||
                    (userChoice == 1 && computerChoice == 2) ||
                    (userChoice == 2 && computerChoice == 0)) {
                System.out.println("您赢了！");
                winCount++;
            } else {
                System.out.println("您输了！");
                loseCount++;
            }

            System.out.println("目前胜利局数：" + winCount + "，失败局数：" + loseCount + "\n");
        }

        if (winCount >= loseCount) {
            System.out.println("恭喜您获得最终胜利！");
        } else {
            System.out.println("很遗憾，您未能获得最终胜利。");
        }
    }
}