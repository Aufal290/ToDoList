public class TaskList {
    public void showTdl(String[] data) {
        for (int i = 0; i < data.length; i++) {
            String tdl = data[i];
            int no = i + 1;
            if (tdl != null) {
                System.out.println(no + ". " + tdl);
            }
        }
    }
}
