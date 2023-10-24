import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User user = new User(input);
        TaskManager taskManager = new TaskManager();
        TaskList taskList = new TaskList();

        String username = user.login();
        if (username != null) {
            System.out.println("Haloooooo " + username);
            viewTdl(input, taskManager, taskList);
        } else {
            System.out.println("Kamu siapa?.");
        }
    }
    public static void viewTdl(Scanner input, TaskManager taskManager, TaskList taskList) {
        String[] data = new String[5];

        while (true) {
            taskList.showTdl(data);
            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Keluar");
            String choice = masuk(input, "Pilih");
            if (choice.equals("1")) {
                String tdl = masuk(input, "Masukkan tugas");
                taskManager.addTdl(data, tdl);
            } else if (choice.equals("2")) {
                int number = Integer.parseInt(masuk(input, "Masukkan nomor tugas yang ingin anda hapus"));
                boolean removed = taskManager.removeTdl(data, number);
                if (removed) {
                    System.out.println("Tugas berhasil dihapus.");
                } else {
                    System.out.println("Nomor tugas tidak ada.");
                }
            } else if (choice.equals("3")) {
                System.out.println("dadahhh");
                break;
            } else {
                System.out.println("Pilihan tidak ada");
            }
        }
    }
    public static String masuk(Scanner input, String info) {
        System.out.println(info + " : ");
        return input.nextLine();
    }
}
