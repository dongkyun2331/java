import java.util.Scanner;
import java.util.StringTokenizer;
public class Email {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        String Email;
        String[] Information = new String[3];
        System.out.println("<< 이메일 주소를 입력하세요 >>");
        Email = Input.nextLine();
        StringTokenizer st1 = new StringTokenizer(Email,"@");
        Information[0]=st1.nextToken();
        StringTokenizer st2 = new StringTokenizer(st1.nextToken(),".");
        Information[1]=st2.nextToken();
        Information[2]=st2.nextToken();

        System.out.print("첫번째 문자열:");
        System.out.println(Information[0]);
        System.out.print("두번째 문자열:");
        System.out.println(Information[1]);
        System.out.print("세번째 문자열:");
        System.out.println(Information[2]);

    }
}
