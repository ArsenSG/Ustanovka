import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        StringBuilder log = new StringBuilder();

        File src = new File("D://Games", "src");
        if (src.mkdir()) {
            log.append("Директория " + src.getName() + " создана");
            log.append("\n");
        }

        File res = new File("D://Games", "res");
        if (res.mkdir()) {
            log.append("Директория " + res.getName() + " создана");
            log.append("\n");
        }

        File savegames = new File("D://Games", "savegames");
        if (savegames.mkdir()) {
            log.append("Директория " + savegames.getName() + " создана");
            log.append("\n");
        }

        File temp = new File("D://Games", "temp");
        if (temp.mkdir()) {
            log.append("Директория " + temp.getName() + " создана");
            log.append("\n");
        }

        File main = new File(src, "main");
        if (main.mkdir()) {
            log.append("Директория " + main.getName() + " создана");
            log.append("\n");
        }

        File test = new File(src, "test");
        if (test.mkdir()) {
            log.append("Директория " + test.getName() + " создана");
            log.append("\n");
        }

        File mainJava = new File(main, "Main.java");
        try {
            if (mainJava.createNewFile()) {
                log.append("Файл" + mainJava.getName() + " создан");
                log.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File utilsJava = new File(main, "Utils.java");
        try {
            if (utilsJava.createNewFile()) {
                log.append("Файл" + utilsJava.getName() + " создан");
                log.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File drawables = new File(res, "drawables");
        if (drawables.mkdir()) {
            log.append("Директория " + drawables.getName() + " создана");
            log.append("\n");
        }

        File vectors = new File(res, "vectors");
        if (vectors.mkdir()) {
            log.append("Директория " + vectors.getName() + " создана");
            log.append("\n");
        }

        File icons = new File(res, "icons");
        if (icons.mkdir()) {
            log.append("Директория " + icons.getName() + " создана");
            log.append("\n");
        }

        File tempFile = new File(temp, "temp.txt");
        try {
            if (tempFile.createNewFile()) {
                log.append("Файл" + tempFile.getName() + " создан");
                log.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write(log.toString());
        }
    }
}