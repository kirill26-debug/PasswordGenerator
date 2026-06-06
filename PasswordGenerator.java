import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public static String generatedPassword(int lenPassword){
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "abcdefghijklmnopqrstuvwxyz" +
                "0123456789" + "!@#$%^&*()";

        while(password.length() != lenPassword){
            int index = random.nextInt(chars.length());
            char randomChar = chars.charAt(index);
            password.append(randomChar);
        }
        return password.toString();
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){

            System.out.print("Введите длину пароля: ");
            int lenPassword = scanner.nextInt();
            String pass;

            if(lenPassword <= 0){
                System.out.println("Длина пароля должна быть больше 0");
                return;
            } else{
                pass = generatedPassword(lenPassword);
            }

            System.out.println("\nВаш пароль: " + pass);
        } catch (Exception er) {
            System.out.println(er.getMessage());
        } finally {
            System.out.println("\nEnd...");
        }
    }
}