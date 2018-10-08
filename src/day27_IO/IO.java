package day27_IO;

import org.junit.Test;

import java.io.*;

/*
 * 按流向分：
 *      输入流:从外部设备读取数据
 *      输出流:把数据写到外部设备
 * 字节流、字符流
 */

public class IO {
    // 输入流，把东西从文件中读取出来
    @Test
    public void test() throws Exception {
        InputStream in = new FileInputStream("file_test\\test2.txt");

        int b = 0;
        while ((b = in.read()) != -1) {
            System.out.print((char) b);
        }

        in.close();
    }

    // 输出流，可以把东西(byte[])写到里面
    @Test
    public void test2() throws Exception {
        OutputStream out = new FileOutputStream("file_test\\test2.txt", true);

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= i; j++) {
                out.write("*".getBytes());
            }
            // 换行
            out.write("\r\n".getBytes());
        }

        out.close();
    }

    @Test
    public void myCopy() throws IOException {
        OutputStream out = new FileOutputStream("file_test\\out.txt");
        InputStream in = new FileInputStream("file_test\\test2.txt");

        int b = 0;
        while ((b = in.read()) != -1) {
            out.write(b);
        }

        in.close();
        out.close();
    }
}
