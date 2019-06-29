package com.java.time;


import javax.swing.JLabel;

public class MyThread extends Thread{
	private JLabel jLabel;//通信，传值
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
//				//显示在JLabel上
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
//				System.out.println("正在计时中");
//				mb.setText(x+" : "+y+" : "+ i++);
//			}
//			System.out.println("暂停计时");
//		}

	}
}

