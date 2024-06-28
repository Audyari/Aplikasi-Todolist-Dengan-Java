

public class AplikasiTodolist {

    public static String[] model = new String[10];

    public static void main(String[] args) {
        testShowTodoList();
    }

    public static void testShowTodoList() {
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi Kasus Java Dasar : Aplikasi Todolist";
        showTodoList();
    }

    /**
     * Menampilkan todo list
     */
    public static void showTodoList() {
        System.out.println("TODOLIST");

        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

}

//        /**
//         * Menambah todo ke list
//         */
//        public static void addTodoList () {
//
//        }
//
//        /**
//         * Mehapus todo dari list
//         */
//        public static boolean removeTodoList () {
//
//        }
//
//
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

