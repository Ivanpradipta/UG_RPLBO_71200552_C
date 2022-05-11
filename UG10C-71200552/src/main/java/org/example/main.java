import java.util.Scanner;
import java.util.Vector;

public class Main {
        Scanner scanner = new Scanner(System.in);
        Vector <User> listUser = new Vector<>();

        public void Welcome() {
                System.out.println("Selamat datang di Toko Ivan");
                System.out.println("Silahkan daftarkan diri kamu untuk dapat mengakses menu di Toko Ivan");
        }

        public boolean userLength(String username) {
                if(username.length() > 6 ) {
                        return true;
                }
                return false;
        }



        public User addUser() throws Exception {
                String username = "";
                String email = "";
                String password = "";

                do {
                        System.out.println("Username: ");
                        username = scanner.nextLine();
                        throw new UsernameException(1);
                } while (!userLength(username) || !username.isEmpty());
                do {
                        System.out.println("Email: ");
                        email = scanner.nextLine();
                }while(!email.isEmpty());
                do {
                        System.out.println("Password: ");
                        password = scanner.nextLine();
                } while (!password.isEmpty() );

        }

        public Main() {
                // TODO Auto-generated constructor stub
                Welcome();
                addUser();
        }

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                new Main();
        }

}
