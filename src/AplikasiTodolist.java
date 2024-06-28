public class AplikasiTodolist {
    public static String[] model = new String[10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        testInput();

    }

    public static void testInput() {
        var name = input("Nama");
        System.out.println("Hi " + name);

        var channel = input("Channel");
        System.out.println(channel);
    }

    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    private static void testAddTodoList() {
        for (int i = 0; i < 12; i++) {
            addTodoList("Contoh Todo Ke." + i);
        }

        showTodoList();
    }


    private static void testShowTodoList() {

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


    /**
     * Mehapus todo dari list
     */
    public static boolean removeTodoList(Integer number) {
        if ((number - 1) >= model.length) {
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {
            for (int i = (number - 1); i < model.length; i++) {
                if (i == (model.length - 1)) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        var result = removeTodoList(6);
        System.out.println(result);

        result = removeTodoList(7);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();

    }

}
