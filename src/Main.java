import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        File dir = new File("c://Test","Work_1.txt");
        File dir2 = new File("c://Test", "Work_2.txt");
        boolean result = dir.createNewFile();
        boolean result1 = dir2.createNewFile();
        String str = " ���� ������� ����.";
        String str3 = " ���� ������� ����. - ����� ������ 19.";
        String str4 = " ���� - ������ ����� ����! - ����� ������ 25.";
        FileOutputStream fos = new FileOutputStream("c://Test/Work_1.txt");
        byte[] buffer = str.getBytes();
        int length = str.length();
        System.out.println("����� ������ �� ������� ����� = " + length);
        fos.write(buffer);
        String str1 = "���� - ������ ����� ����!";
        FileOutputStream fos1 = new FileOutputStream("c://Test/Work_2.txt");
        byte[] buffer1 = str1.getBytes();
        fos1.write(buffer1);
        FileOutputStream fos2 = new FileOutputStream("c://Test/Work_2.txt",true);
        buffer = str.getBytes();
        fos1.write(buffer);
        length = str1.length();
        System.out.println("����� ������ �� ������� ����� = " + length);
        buffer = str3.getBytes();
        fos1.write(buffer);
        buffer = str4.getBytes();
        fos1.write(buffer);
    }

}
