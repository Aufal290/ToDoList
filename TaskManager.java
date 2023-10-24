public class TaskManager {
    public void addTdl(String[] data, String tdl) {
        boolean full = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                full = false;
                break;
            }
        }
        if (full) {
            String[] temp = data;
            data = new String[data.length * 2];
            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = tdl;
                break;
            }
        }
    }
    public boolean removeTdl(String[] data, int number) {
        if (number < 1 || number > data.length) {
            return false;
        } else if (data[number - 1] == null) {
            return false;
        } else {
            for (int i = number - 1; i < data.length; i++) {
                if (i == data.length - 1) {
                    data[i] = null;
                } else {
                    data[i] = data[i + 1];
                }
            }
            return true;
        }
    }
}
