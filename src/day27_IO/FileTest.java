package day27_IO;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {
    @Test
    public void test1() throws IOException {
        // 创建文件夹
        File file = new File("d:\\files");
        System.out.println(file.mkdir());

        // 创建文件
        File file2 = new File("d:\\files\\test.txt");
        System.out.println(file2.createNewFile());

        // 创建多级文件夹
        File file4 = new File("d:\\test\\test1\\aaa");
        System.out.println(file4.mkdirs());


        // 没有路径默认当前项目根路径
        File file5 = new File("file_test");
        System.out.println(file5.mkdir());

        File file3 = new File("file_test\\test.txt");
        System.out.println(file3.createNewFile());
    }

    @Test
    public void test2() throws IOException {
        // 不可以直接多级删除，要删除的文件夹内不能包含文件或者文件夹
        File file = new File("file_test");
        System.out.println(file.delete());

        // 修改文件名字--可以同时进行剪切操作
        File file2 = new File("file_test\\test.txt");
        File file3 = new File("file_test\\test2.txt");
        System.out.println(file2.renameTo(file3));

        System.out.println(file3.getAbsolutePath());
        System.out.println(file3.getPath());

        // 获取上次修改时间
        Date d = new Date(file3.lastModified());
        SimpleDateFormat smf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(smf.format(d));

        System.out.println(file3.length());
    }
}
