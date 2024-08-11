
public class ToDoLits {
    public static String[] DataTodoList = new String[5];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        testtampilkanHapusData();

    }

    static void tampilkanDataTodo() {

        for (int i = 0; i < DataTodoList.length; i++) {
            var ListData = DataTodoList[i];
            var No = i + 1;

            if (ListData != null) {
                System.out.println(No + ". " + ListData);
            }
        }

    }

    static void testTampilkanDataTodo() {

        DataTodoList[0] = "Belajar Java Dasar";
        DataTodoList[1] = "Studi Kasus Java Dasar : Aplikasi Todolist";
        tampilkanDataTodo();
    }

    static void tambahDataTodo(String Nilai) {

        var DataPenuh = true;
        for (int i = 0; i < DataTodoList.length; i++) {
            if (DataTodoList[i] == null) {
                DataPenuh = false;
                break;
            }
        }

        if (DataPenuh) {

            var TitipData = DataTodoList;

            DataTodoList = new String[DataTodoList.length * 2];

            for (int i = 0; i < TitipData.length; i++) {
                DataTodoList[i] = TitipData[i];
            }

        }

        for (int i = 0; i < DataTodoList.length; i++) {
            if (DataTodoList[i] == null) {
                DataTodoList[i] = Nilai;
                break;
            }

        }
    }

    static void testtambahDataTodo() {
        for (int i = 0; i < 5; i++) {
            tambahDataTodo("Data Ke = " + i);

        }

        tampilkanDataTodo();
    }

    static boolean hapusDataTodo(int Urutan) {

        if (Urutan >= DataTodoList.length) {
            return false;
        }

        if (Urutan == 0) {
            return false;
        }

        if (DataTodoList[Urutan] == null) {
            return false;
        } else {
            // Misalkan Urutan = 3
            int indexToRemove = Urutan - 1; // indeks yang ingin dihapus

            // Pindahkan elemen setelah indeks yang dihapus ke kiri
            for (int i = indexToRemove; i < DataTodoList.length - 1; i++) {
                DataTodoList[i] = DataTodoList[i + 1];
            }

            // Hapus elemen terakhir
            DataTodoList[DataTodoList.length - 1] = null;

            return true;
        }

    }

    static void testDataTodoList() {
        tambahDataTodo("Satu");
        tambahDataTodo("Dua");
        tambahDataTodo("Tiga");
        tambahDataTodo("Empat");
        tambahDataTodo("Lima");

        var result = hapusDataTodo(20);
        System.out.println(result);

        result = hapusDataTodo(7);
        System.out.println(result);

        result = hapusDataTodo(1);
        System.out.println(result);

        tampilkanDataTodo();

    }

    static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    static void testInput() {
        var name = input("Masukkan Data");
        System.out.println("Data yg Kamu Masukkan  " + name);
    }

    static void tampilanTodoList() {
        while (true) {
            System.out.println("APLIKASI TODOLIST BUTOCAKIL");
            tampilkanDataTodo();
            System.out.println("Aplikasi Todo List");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Keluar");

            var Pilihan = input("Pilih");

            if (Pilihan.equals("1")) {
                tampilkanlTambahData();
            } else if (Pilihan.equals("2")) {
                tampilkanHapusData();
            } else if (Pilihan.equals("3")) {
                break;
            } else {
                System.out.println("Pilihan Tidak Ada ");
            }
        }

    }

    static void testTampilanTodoList() {
        tambahDataTodo("Satu");
        tambahDataTodo("Dua");
        tambahDataTodo("Tiga");
        tambahDataTodo("Empat");
        tambahDataTodo("Lima");
        tampilanTodoList();
    }

    static void tampilkanlTambahData() {
        System.out.println("Masukkan TODOLIST");

        var todo = input("Masukkan Data : (x Jika Batal)");

        if (todo.equals("x")) {
            System.out.println("BATALL");
        } else {
            tambahDataTodo(todo);
        }
    }

    static void testtampilkanlTambahData() {
        tambahDataTodo("Satu");
        tambahDataTodo("Dua");

        tampilanTodoList();

        tampilkanDataTodo();
    }

    static void tampilkanHapusData() {
        System.out.println("MENGHAPUS TODOLIST");

        var number = input("Nomor yang Dihapus (x Jika Batal)");

        if (number.equals("x")) {
            System.out.println("Batal Lagi");
        } else {

            boolean success = hapusDataTodo(Integer.valueOf(number));
            if (!success) {
                System.out.println("Gagal menghapus todolist : " + number);
            }
        }
    }

    static void testtampilkanHapusData() {
        tambahDataTodo("Satu");
        tambahDataTodo("Dua");
        tambahDataTodo("Tiga");

        tampilanTodoList();

        tampilkanHapusData();

    }

}
