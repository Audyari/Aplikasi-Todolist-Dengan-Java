public class AplikasiTodolist {
    private static final int INITIAL_CAPACITY = 10;
    private static String[] model = new String[INITIAL_CAPACITY];

    public static void main(String[] args) {
        testAddTodoList();
    }

    private  static void testAddTodoList(){
        for (int i = 0; i < 12; i++) {
            addTodoList("Contoh Todo Ke." + i);
        }

        showTodoList();
    }


    private static void testShowTodoList() {
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi Kasus Java Dasar : Aplikasi Todolist";
        showTodoList();
    }

    /**
     * Menampilkan todo list
     */
    private static void showTodoList() {
        System.out.println("TODOLIST");
        for (int i = 0; i < model.length; i++) {
            String todo = model[i];
            if (todo != null) {
                System.out.println((i + 1) + ". " + todo);
            }
        }
    }

    /**
     * Menambah todo ke list
     */
    public static void addTodoList(String todo) {
        // Cek apakah model penuh
        if (isFull()) {
            resizeModel();
        }

        // Tambahkan todo ke posisi yang kosong
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    private static boolean isFull() {
        for (String item : model) {
            if (item == null) {
                return false;
            }
        }
        return true;
    }

    private static void resizeModel() {
        String[] temp = model;
        model = new String[temp.length * 2];
        for (int i = 0; i < temp.length; i++) {
            model[i] = temp[i];
        }
    }
}

//
//        /**
//         * Mehapus todo dari list
//         */
//        public static boolean removeTodoList () {
//
//        }
//
////
//
//
//        /**
//         * Menampilkan view todo list
//         */
//        public static void viewShowTodoList () {
//
//        }
//
//        /**
//         * Menampilkan view menambahkan todo list
//         */
//        public static void viewAddTodoList () {
//
//        }
//
//        /**
//         * Menampilkan view menghapus todo list
//         */
//        public static void viewRemoveTodoList() {
//
//        }
//
//
//    }

