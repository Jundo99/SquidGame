import java.util.Random;
import java.util.Scanner;


public class Holjak {
    public static void main(String[] args) {
        System.out.println("오징어 게임에 오신것을 환영합니다");
        System.out.println("이번 게임은 구슬 게임입니다.");
        System.out.println("당신과 나는 각각 10개의 구슬을 가지고 있습니다.");
        System.out.println("10개의 구슬 다 잃으면 죽습니다");
        System.out.println("시작합니다.");
        System.out.println("배팅 하세요");
        String name = "이름";
        int comgu = 10;

        // 유저가 가진 구슬 갯수
        int userGu = 10;  // 초기값은 10개
        // 배팅 숫자를 입력 받기
        Scanner sc = new Scanner(System.in);   // 입력 받기 위한 준비
        // 여기서 부터 반복 배팅 조건이 안맞으면 계속 반복
        do {
            int bet = 0;   // 유저가 배팅하는 변수
            while (true) {
                System.out.print("입력: ");
                bet = sc.nextInt();  // 숫자를 입력 받아서 bet 변수에 저장
                System.out.println("당신은 " + bet + "개의 구슬을 배팅했습니다");
                // 만약에 내가 가진 갯수 보다 많이 배팅을 하면
                // 안된다 다시 배팅해라
                if (bet > userGu) {
                    System.out.println("안된다 다시 배팅해라");
                } else {
                    break;   // 무한 반복 종료
                }
            }
            System.out.println("================================");
            int combet =0;
            combet = (int)(Math.random()*comgu)+1;
            // 내가 가진 갯수 보다 적게 배팅하면 홀짝 게임 진행
            System.out.println("맞춰봐~");
            // 컴퓨터가 구슬 10개의 구슬중에 랜덤으로 문제를 낸다
            Random random = new Random();   // 랜덤을 사용하기 위한 준비
            int rNum = random.nextInt(10) + 1;   // 1~10까지 숫자가 랜덤으로 나오게

            String dab = "짝";   // 컴퓨터의 답
            if (rNum % 2 == 1) {
                dab = "홀";

            } else {

            }
            // 유저가 이제 답을 맞춰야 된다.
            // 답을 입력 하고 (홀, 짝)
            System.out.println("================================");
            System.out.print("답을 입력하세요> ");
            String uDab = sc.next();   //  문자열 입력받기
            System.out.println("================================");
            if (uDab.equalsIgnoreCase(dab)) {
                userGu += combet;
                comgu -= combet;
                System.out.println("맞추셨습니다. 구슬을 획득하셨습니다.\n"+ "현재 나의 구슬갯수: " + userGu
                 + "\n컴퓨터의 구슬갯수: " + comgu);
            } else {
                userGu -=bet;
                comgu += bet;
                System.out.println("틀리셨습니다. 구슬을 잃었습니다.\n"+ "현재 나의 구슬갯수: " + userGu +
                        "\n컴퓨터의 구슬갯수: " + comgu);

            }System.out.println("================================");
        }while(comgu > 0 && userGu >0);
        if(userGu <=0){
            System.out.println("남은 구슬이 없습니다.");

        } else if (comgu<=0) {
            System.out.println("상대방의 남은 구슬이 없습니다. 축하드립니다.");
        }

    }
}
