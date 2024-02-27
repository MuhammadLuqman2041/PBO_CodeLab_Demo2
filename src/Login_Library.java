import java.util.Scanner;

public class Login_Library
{

    public static void main(String[] args)
    {
        System.out.println("===== Library System =====");
        System.out.println("1. Login as Student");
        System.out.println("2. Login as Admin");
        System.out.println("3. Exit");

        Scanner masukkanPilihan = new Scanner(System.in);
        System.out.print("Masukkan pilihanmu (1-3): ");
        int pilihan = Integer.parseInt(String.valueOf(masukkanPilihan.nextInt()));

        if (pilihan == 1)
        {
            Scanner masukkanNimStudent = new Scanner(System.in);
            System.out.print("Enter Your NIM: ");
            String NIM = masukkanNimStudent.next();

            if (NIM.equals("202310370311014"))
            {
                System.out.println("Login Berhasil!");
            }

            else
            {
                System.out.println("NIM Salah!");
            }

        } else if (pilihan == 2)
        {
            Scanner masukkanUsernameAdmin = new Scanner(System.in);
            System.out.print("\nEnter Your Username (admin): ");
            String Username = masukkanUsernameAdmin.next();
            Scanner masukkanPasswordAdmin = new Scanner(System.in);
            System.out.print("Enter Your Password (admin): ");
            String Password = masukkanPasswordAdmin.next();

            if (Username.equals("admin") && Password.equals("admin"))
            {
                System.out.println("Login Berhasil!");
            }

            else
            {
                System.out.println("Username atau Password Salah!");
            }
        } else
        {
            System.out.println("Thanks!");
        }
    }

}
