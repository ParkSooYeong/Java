import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class TextAreaEx extends JFrame
{
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(7,20);
	
	TextAreaEx()
	{
		setTitle("텍스트영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("입력 후 <Enter> 키를 입력하세요"));
		c.add(tf); c.add(ta);
		c.add(new JScrollPane(ta));
		
		tf.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText() + "\n");
				t.setText("");
			}
		});
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String [] args)
	{
		new TextAreaEx();
	}
}