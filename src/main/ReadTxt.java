import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTxt {

	public static void main(String args[]) {
	}

	/**
	 * ����TXT�ļ�
	 */
	public static void readFile() {
		String pathname = "d://input.txt"; // ����·�������·�������ԣ�д���ļ�ʱ��ʾ���·��,��ȡ����·����input.txt�ļ�
		// ��ֹ�ļ��������ȡʧ�ܣ���catch��׽���󲢴�ӡ��Ҳ����throw;
		// ���ر��ļ��ᵼ����Դ��й¶����д�ļ���ͬ��
		// Java7��try-with-resources�������Źر��ļ����쳣ʱ�Զ��ر��ļ�����ϸ���https://stackoverflow.com/a/12665271
		try (FileReader reader = new FileReader(pathname); BufferedReader br = new BufferedReader(reader) // ����һ�����������ļ�����ת�ɼ�����ܶ���������
		) {
			String line;
			// �����Ƽ����Ӽ���д��
			while ((line = br.readLine()) != null) {
				// һ�ζ���һ������
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
