package baitap13_3;
import java.io.*;

public class FullProgram {
    public static void main(String[] args) {
        System.out.println("Bắt đầu chương trình...");

        // 1. Đọc và hiển thị nội dung của file input.txt
        System.out.println("\n1. Đọc và hiển thị nội dung của input.txt:");
        displayFileContent();

        // 2. Nhập nội dung từ bàn phím và lưu vào file keyboardOutput.txt
        System.out.println("\n2. Nhập nội dung từ bàn phím và lưu vào keyboardOutput.txt:");
        keyboardToFile();

        // 3. Sao chép nội dung từ input.txt sang output.txt
        System.out.println("\n3. Sao chép nội dung từ input.txt sang output.txt:");
        copyFileContent();

        // 4. Đếm số dòng trong file input.txt
        System.out.println("\n4. Đếm số dòng trong file input.txt:");
        countLinesInFile();

        // 5. Ghi và đọc danh sách số nguyên từ file integers.bin
        System.out.println("\n5. Ghi và đọc danh sách số nguyên từ integers.bin:");
        handleIntegersInFile();

        // 6. Liệt kê tất cả các file trong thư mục hiện tại
        System.out.println("\n6. Liệt kê tất cả các file trong thư mục hiện tại:");
        listFilesInDirectory();

        System.out.println("\nChương trình hoàn tất!");
    }

    // Hàm 1: Đọc và hiển thị nội dung của tệp input.txt
    private static void displayFileContent() {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            System.out.println("  - Nội dung của input.txt:");
            while ((line = reader.readLine()) != null) {
                System.out.println("    " + line);
            }
        } catch (IOException e) {
            System.out.println("  - Lỗi: Không tìm thấy tệp input.txt.");
        }
    }

    // Hàm 2: Nhập nội dung từ bàn phím và lưu vào file keyboardOutput.txt
    private static void keyboardToFile() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("keyboardOutput.txt")) {

            System.out.println("  - Nhập nội dung (gõ 'exit' để dừng):");
            String line;
            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                writer.write(line + System.lineSeparator());
            }
            System.out.println("  - Nội dung đã được lưu vào file keyboardOutput.txt.");
        } catch (IOException e) {
            System.out.println("  - Lỗi: Không thể ghi vào file.");
        }
    }

    // Hàm 3: Sao chép nội dung từ input.txt sang output.txt
    private static void copyFileContent() {
        try (FileInputStream fis = new FileInputStream("input.txt");
             FileOutputStream fos = new FileOutputStream("output.txt")) {

            int byteContent;
            while ((byteContent = fis.read()) != -1) {
                fos.write(byteContent);
            }
            System.out.println("  - Nội dung đã được sao chép từ input.txt sang output.txt.");
        } catch (IOException e) {
            System.out.println("  - Lỗi: Không thể sao chép nội dung.");
        }
    }

    // Hàm 4: Đếm số dòng trong file input.txt
    private static void countLinesInFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            int lineCount = 0;
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println("  - Số dòng trong input.txt: " + lineCount);
        } catch (IOException e) {
            System.out.println("  - Lỗi: Không thể đọc file input.txt.");
        }
    }

    // Hàm 5: Ghi và đọc danh sách số nguyên từ file integers.bin
    private static void handleIntegersInFile() {
        String fileName = "integers.bin";
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(10);
            dos.writeInt(20);
            dos.writeInt(30);
            System.out.println("  - Danh sách số nguyên đã được ghi vào integers.bin.");
        } catch (IOException e) {
            System.out.println("  - Lỗi khi ghi file integers.bin.");
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("  - Các số nguyên trong integers.bin:");
            while (dis.available() > 0) {
                System.out.println("    " + dis.readInt());
            }
        } catch (IOException e) {
            System.out.println("  - Lỗi khi đọc file integers.bin.");
        }
    }

    // Hàm 6: Liệt kê tất cả các file trong thư mục hiện tại
    private static void listFilesInDirectory() {
        File folder = new File(".");
        File[] files = folder.listFiles();

        if (files != null) {
            System.out.println("  - Danh sách các file trong thư mục hiện tại:");
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println("    " + file.getName());
                }
            }
        } else {
            System.out.println("  - Thư mục trống hoặc không tồn tại.");
        }
    }
}
