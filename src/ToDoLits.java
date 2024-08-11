public class ToDoLits {
    public static String[] DataTodoList = new String[5];

    public static void main(String[] args) {

        // testTampilkanDataTodo("Makan", "Minum", "Tidur");
        testtambahDataTodo();

    }

    static void tampilkanDataTodo(String... DataTodoList) {
        // for (int i = 0; i < DataTodoList.length; i++) {

        // var Hasil = DataTodoList[i];
        // var Urutan = i + 1;

        // if (Hasil != null) {
        // System.out.println(Urutan + ". " + Hasil);
        // }

        // }
        var i = 1;
        for (String Hasil : DataTodoList) {
            System.out.println(i + ". " + Hasil);
            i += 1;
        }
    }

    static void testTampilkanDataTodo(String... DataTodoList) {

        tampilkanDataTodo(DataTodoList);
    }

    static void tambahDataTodo(String Nilai) {

        // Cek Data Sudah Penuh Apa Belum
        for (int i = 0; i < DataTodoList.length; i++) {
            if (DataTodoList[i] == null) {
                break;
            } else {
                // System.out.println("Data Penuh Tambahkan");
                var TitipData = DataTodoList;
                DataTodoList = new String[DataTodoList.length * 10];
                for (int j = 0; j < TitipData.length; j++) {
                    DataTodoList[i] = TitipData[i];
                }
            }

        }

        for (int i = 0; i < DataTodoList.length; i++) {
            if (DataTodoList[i] == null) {
                DataTodoList[i] = Nilai;
                System.out.println((i) + ". " + Nilai);
                break;
            }

        }
    }

    static void testtambahDataTodo() {
        tambahDataTodo("ASEP");
        tambahDataTodo("ASEPPPP");
        tambahDataTodo("AUDYARI");
        tambahDataTodo("AUDYARI1");
        tambahDataTodo("AUDYARI11");
    }

    static void hapusDataTodo() {

    }
}
