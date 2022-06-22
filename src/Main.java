import java.io.*;

public class Main {
    public static void main(String[] args) {

        File dir = new File("D://Games", "Games");
        if (dir.mkdir()) {
            System.out.println(dir.getName() + " Создалось");
        } else {
            System.out.println("Не создалось");
        }
        File src = new File(dir, "src");
        if (src.mkdir()) {
            System.out.println(src.getName() + " Создалось");
        } else {
            System.out.println("Не создалось");
        }
        File res = new File(dir, " res");
        if (res.mkdir()) {
            System.out.println(res.getName() + " Создалось");
        } else {
            System.out.println("Не создалось");
        }
        File savegames = new File(dir, "savegames");
        if (savegames.mkdir()) {
            System.out.println(savegames.getName() + " Создалось");
        } else {
            System.out.println("Не создалось");
        }
        File temp = new File(dir, "temp");
        if (temp.mkdir()) {
            System.out.println(temp.getName() + " Создалось");
        } else {
            System.out.println("Не создалось");
        }
        File main = new File(src, "main");
        if (main.mkdir()) {
            System.out.println(main.getName() + " Создалось");
        } else {
            System.out.println("Не создалось");
        }
        File test = new File(src, "test");
        if (test.mkdir()) {
            System.out.println(test.getName() + " Создалось");
        } else {
            System.out.println("Не создалось");
        }
        File Main = new File(main, "Main.java");
        try {
            if (Main.createNewFile())
                System.out.println("Файл был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File Utils = new File(main, "Utils.java");
        try {
            if (Utils.createNewFile())
                System.out.println("Файл был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File drawables = new File(res, "drawables");
        if (drawables.mkdir()) {
            System.out.println(drawables.getName() + " Создалось");
        } else {
            System.out.println("Не создалось");
        }
        File vectors = new File(res, "vectors");
        if (vectors.mkdir()) {
            System.out.println(vectors.getName() + " Создалось");
        } else {
            System.out.println("Не создалось");
        }
        File icons = new File(res, "icons");
        if (icons.mkdir()) {
            System.out.println(icons.getName() + " Создалось");
        } else {
            System.out.println("Не создалось");
        }
        File Temp = new File(temp, "temp.txt");
        try {
            if (Temp.createNewFile())
                System.out.println("Файл был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


        StringBuilder stringBuilder = new StringBuilder();

        try (FileWriter writer = new FileWriter("temp.txt")) {
            writer.write(stringBuilder.toString());
            writer.append(stringBuilder);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
