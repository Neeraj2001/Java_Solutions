import java.util.*;
import java.io.*;
public class read_mulfile {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = null;
		BufferedReader br = null;
		Set<String> lines = new LinkedHashSet<String>();
		File parentDir = new File(
				"E:/java programms/files/sample");
		String[] names = parentDir.list();
		System.out.println(names.length);
		File outputFile = new File(
				"E:/java programms/files/sample1/sample.txt");
		for (String name : names) {
			if (new File("E:/java programms/files/sample"
					+ name).isDirectory()) {
				File path2 = new File(
						"E:/java programms/files/buff_op_stream1.txt"
								+ name);
				File[] listOfFiles = path2.listFiles();
				System.out.println("list " + listOfFiles.length);
				if (!outputFile.exists()) {
					System.out.println("file not exist");
					outputFile.createNewFile();
				}
				String s = new String();
				for (int i = 0; i < listOfFiles.length; i++) {
					File file = listOfFiles[i];
					if (file.isFile() && file.getName().contains("INFO")
							&& file.getName().endsWith(".txt")) {
						br = new BufferedReader(new FileReader(file));
						while ((s = br.readLine()) != null) {
							// System.out.println("file name is :::"+s);
							lines.add(s);
						}
					}
				}
				System.out.println("file Writing is done");
				br.close();
			}
		}
		bw = new BufferedWriter(new FileWriter(outputFile, true));
		if (!lines.isEmpty()) {
			for (String line : lines) {
				bw.write(line+"\n");
			}
		}
		bw.close();

	}

}