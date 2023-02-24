package java_3_Essential;


import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PictureSorter {

    private String directory;

    public PictureSorter(String directory) {
        this.directory = directory;
    }

    public void sortPictures() {
        // Get list of files in directory
        File dir = new File(directory);
        File[] files = dir.listFiles();

        // Sort files by name
        List<File> fileList = Arrays.asList(files);





//        Collections.sort(fileList, new Comparator<File>() {
//            @Override
//            public int compare(File f1, File f2) {
//                return f1.getName().compareToIgnoreCase(f2.getName());
//            }
//
//            // Rename files in sorted order
//            for (int i = 0; i < fileList.size(); i++) {
//                File f = fileList.get(i);
//                String newName = String.format("%02d_%s", i, f.getName());
//                f.renameTo(new File(dir, newName));
//            }
//        }

        /*
        Цей код може не працювати, оскільки необхідно правильно реалізувати метод compare() з Comparator інтерфейсу. Крім того, може бути проблема з правами доступу до файлів або відсутністю директорії, де він повинен змінювати імена файлів.
         */


    }
}


