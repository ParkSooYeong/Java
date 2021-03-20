import javax.swing.*;
import java.awt.*;
@SuppressWarnings("serial")

public class NullContainerEx extends JFrame
{
	NullContainerEx()
	{
		setTitle("��ġ������ ���� ���� ��ġ�� ��ġ�ϴ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(null); // ����Ʈ���� ��ġ������ ����
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50); // la�� (130,50) ��ġ�� ����
		la.setSize(200, 20); // la�� 200x20 ũ��� ����
		contentPane.add(la); // la�� ����Ʈ�ҿ� ����
		
		// 9���� ��ư ������Ʈ�� �����ϰ� ������ ũ��� �����Ѵ�.
		// ��ġ�� ���� ��ġ�� �����Ѵ�.
		for(int i=1; i<=9; i++)
		{
			JButton b = new JButton(Integer.toString(i)); // ��ư ����
			b.setLocation(i*15, i*15); // ��ư�� ��ġ ����
			b.setSize(50, 20); // ��ư�� ũ��� �����ϰ� 50x20
			contentPane.add(b); // ��ư�� ����Ʈ�ҿ� ����
		}
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new NullContainerEx();
	}
}