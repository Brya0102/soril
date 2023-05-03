        class run extends Thread {  

		public void run(){  

		System.out.println("Thread running...");  

		}  

		public static void main(String args[]){  

		run m1=new run();  

		m1.start();  

		 }  

		} 