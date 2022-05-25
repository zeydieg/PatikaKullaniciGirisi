import java.util.Scanner;

public class logIn {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password, newPassword;
        int select;

        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = inp.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java101")) {
            System.out.print("Başarıyla giriş yaptınız.");
        }else{
            System.out.println("Hatalı giriş yaptınız. Şifrenizi sıfırlamak ister misiniz?\n1-Evet\n2-Hayır");
            System.out.print("Seçiminiz : ");
            select = inp.nextInt();
            inp.nextLine();

            switch (select) {
                case 1:
                    System.out.print("Yeni şifre giriniz:");
                    newPassword = inp.nextLine();
                    if (newPassword.equals("java101")) {
                        System.out.print("Yeni şifreniz önceki şifrenizle aynı olamaz. Başka şifre giriniz.");
                    } else {
                        System.out.print("Yeni şifre oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.print("Tekrar giriş yapınız.");
                    break;
                default:
                    System.out.print("Geçerli bir seçim yapmadınız. Tekrar deneyiniz.");
            }
        }
    }
}
