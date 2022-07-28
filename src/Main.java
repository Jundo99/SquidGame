import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int myball = 10;
        int yourball = 10;
        int bet = 0;
        int yourbet = 0;


        System.out.println("오징어 게임에 오신것을 환영합니다.");
        System.out.println("이번 게임은 구슬 게임입니다.");
        System.out.println("당신과 저는 가각 10개의 구슬을 가지고 시작합니다.");
        System.out.println("10개의 구슬을 모두 잃으면 죽습니다.");
        System.out.println("시작합니다.");
        System.out.println("배팅을 시작하세요.");
        System.out.println("=====================================");

       do {
           Scanner sc = new Scanner(System.in);
           System.out.print("입력> ");
           bet = sc.nextInt();

           do {
               if (myball < bet) {
                   System.out.println("보유하신 구슬개수보다 많이 베팅하셨습니다.\n 다시 베팅하십시요");
                   System.out.print("입력> ");
                   bet = sc.nextInt();
               }
           } while (myball < bet);

           System.out.println("============================");

           System.out.println("게임을 시작합니다.");
           System.out.println("============================");
           yourbet = (int) (Math.random() * 10) + 1;
           System.out.println("내가 베팅한 구슬 갯수> " + bet + "\n 상대가 배팅한 구슬갯수> " + yourbet);
           System.out.println("============================");
           if (bet > yourbet) {
               myball += yourbet;
               yourball -= yourbet;
               System.out.println("게임에서 승리하셨습니다.\n" + "내가 보유한 구슬> " + myball + "\n 상대가 보유한 구슬> " + yourball);
           } else if(bet < yourbet){
               myball -= bet;
               yourball += bet;
               System.out.println("게임에서 패배하셨습니다.\n" + "내가 보유한 구슬> " + myball + "\n 상대가 보유한 구슬> " + yourball);
           }else{
               System.out.println("게임에서 비겼습니다.\n" + "내가 보유한 구슬> " + myball + "\n 상대가 보유한 구슬> " + yourball);
           }
//           if(myball <=0){
//               System.out.println("남은 구슬이 없습니다.");
//
//           } else if (yourball<=0) {
//               System.out.println("상대방의 남은 구슬이 없습니다. 축하드립니다.");
//           }
       }while(yourball > 0 && myball >0);
        if(myball <=0){
               System.out.println("남은 구슬이 없습니다.");

           } else if (yourball<=0) {
               System.out.println("상대방의 남은 구슬이 없습니다. 축하드립니다.");
           }


    }
}