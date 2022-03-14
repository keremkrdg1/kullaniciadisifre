import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String username,password,np;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        username = inp.nextLine();
        System.out.print("Şifreniz: ");
        password = inp.nextLine();

        if (username.equals("Patika"))
        {
            if (password.equals("Java123"))
            {
                System.out.println("Kullanıcı Adı Ve Şifreniz Doğru");
            }
            else
            {
                System.out.println("Şifreniz Yanlış");
                System.out.println("Yeni Şifre Oluşturmak İstermisiniz");
                System.out.println("1-Evet\n2-Hayır");
                int select = inp.nextInt();

                switch (select)
                {
                    case 1:
                    System.out.print("Yeni Şifrenizi Giriniz : ");
                    np = inp.next();
                    if (np.equals("Java123"))
                    {
                        System.out.println("Şifreniz oluşturulamadı lütfen başka şifre giriniz");
                    }
                    else
                    {
                        System.out.println("Şifreniz başarıyla oluşturuldu.");
                    }
                    break;
                    case 2:
                        System.out.println("Sayfayı yenileyip şifrenizi tekrar deneyiniz!");
                        break;
                    default:
                        System.out.println("Lütfen geçerli bir değer giriniz!!");
                }
            }

        }
        else
        {
            System.out.println("Kullanıcı Adı Yanlış");
        }
    }
}





