package com.java.time;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javafx.scene.control.Button;

public class TestMain {
	JFrame jFrame;
	JLabel jLabel;
	
	//boolean IsRun;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new TestMain().initView();
	}
	public void initView()
	{
		jFrame=new JFrame();
		jFrame.setBounds(0, 0, 500, 600);
		jFrame.setLayout(null);
		MyThread myThread=new MyThread();
		
		final JLabel jLabel=new JLabel();
		jLabel.setBounds(50,50,200,100);
		jFrame.add(jLabel);
		//�̣߳��߳�֮�以�����ţ�����״̬
		JButton jButton=new JButton("��ʼ");
		jButton.setBounds(300, 300, 100, 50);
		jFrame.add(jButton);
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				myThread.setL(jLabel);
				myThread.start(); 
			}
		});
		JButton jButton2=new JButton("ֹͣ");
		jButton2.setBounds(300, 400, 100, 50);
		jFrame.add(jButton2);
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				myThread.IsRun=false;
			}
		});
		//��ʱ��ʼ
/*		JButton jButton1=new JButton("��ʱ��ʼ");
		jButton1.setBounds(200, 200, 150, 100);
		jFrame.add(jButton1);
		jButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				/*Thread thread=new Thread(new Runnable() {
					public void run() {
						int i=0;
						while(IsRun)
						{
							try {
								Thread.sleep(1000);
								i++;
								jTextField.setText(""+i);
							}catch(InterruptedException e2) {
								e2.printStackTrace();
							}
							//Thread.sleep(1000);
							
						}
					}
				});
				thread.start();*/
	//		}
	//	});
		
		//��ʱ����
		/*JButton jButton2=new JButton("��ʱ����");
		jButton2.setBounds(350, 200, 150, 100);
		jFrame.add(jButton2);
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Thread thread=new Thread(new Runnable() {
					public void run() {
						int i=0;
						while(true)
						{
							try {
								Thread.sleep(1000);
							}catch(Exception e2) {
								
							}
							//Thread.sleep(1000);
							i++;
							jTextField.setText(""+i);
						}
					}
				});
				thread.stop();
				
			}
		});*/
		
		
		jFrame.setVisible(true);
	}

}

