package baitap20_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;

public class MergeAndCleanFiles {
	private static final String INPUT_DIR = "downloads";
	private static final String MERGED_FILE = "merged_output.txt";

	public static void main(String[] args) {
		File outputFile = new File(MERGED_FILE);
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
			File inputDir = new File(INPUT_DIR);
			if (!inputDir.exists() || !inputDir.isDirectory()) {
				System.err.println("Thư mục " + INPUT_DIR + " không tồn tại hoặc không hợp lệ.");
				return;
			}

			File[] files = inputDir.listFiles();
			if (files == null || files.length == 0) {
				System.err.println("Không có file nào trong thư mục " + INPUT_DIR);
				return;
			}

			for (File file : files) {
				if (file.isFile() && file.getName().endsWith(".txt")) { // Chỉ xử lý file .txt
					try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
						StringBuilder content = new StringBuilder();
						String line;
						while ((line = reader.readLine()) != null) {
							content.append(line).append("\n");
						}

						String cleanedContent = isHtml(content.toString()) ? cleanHtml(content.toString())
								: content.toString();
						writer.write(cleanedContent);
						writer.newLine();
					} catch (IOException e) {
						System.err.println("Lỗi khi xử lý file: " + file.getName());
					}
				}
			}
			System.out.println("Hoàn tất gộp file vào " + MERGED_FILE);
		} catch (IOException e) {
			System.err.println("Lỗi ghi file: " + e.getMessage());
		}
	}

	private static boolean isHtml(String content) {
		return content.contains("<html>"); // Kiểm tra nội dung có phải HTML
	}

	private static String cleanHtml(String htmlContent) {
		Document doc = Jsoup.parse(htmlContent);
		return doc.text(); // Lấy văn bản thuần từ HTML
	}
}
