package com.java.time;


import javax.swing.JLabel;

public class MyThread extends Thread{
	private JLabel jLabel;//ͨ�ţ���ֵ
	boolean IsRun=true;

	public void setL(JLabel jLabel) {
		this.jLabel=jLabel;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		int i=0,y=0,x=0;
//		while(true) {
//			try {
//				Thread.sleep(1000);
//				i++;
//				//��ʾ��JLabel��
//				jLabel.setText(""+i);
//				
//			}catch(InterruptedException e){
//				e.printStackTrace();
//			}
//		}
			while(IsRun) {
				try {
					Thread.sleep(1000);
					i++;
					jLabel.setText(""+i);
					if(i==60) {
						y++;
						i=0;
					}
					if(y==60) {
						x++;
						y=0;
					}
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				jLabel.setText(x+" : "+y+" : "+ i);
			}
			
		
//		while (isst) {
//			while (IsRun) {
//				try {
//					Thread.sleep(100);
//				} catch (Exception e) {
//					// TODO: handle exception
////					System.out.println("sdhsdfkjsdfh");
//					e.printStackTrace();
//				}
//				if (i==60)	{
//					y++;
//					i=0;
//				}
//				if (y==60)  {
//					x++;
//					y=0;
//				}
//				System.out.println("���ڼ�ʱ��");
//				mb.setText(x+" : "+y+" : "+ i++);
//			}
//			System.out.println("��ͣ��ʱ");
//		}

	}
}

