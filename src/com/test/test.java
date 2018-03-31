package com.test;

import com.domain.task;
import com.domain.trial;

public class test {
	public static void main(String[] args) {
		task a=new task();
		trial b=new trial();
		//这里用start()方法是间接的调用run()方法作为线程，会混搭输出
		/*new Thread(a).start();
		new Thread(b).start();*/
		//这里用run()是作为普通方法输出。先执行完a后执行b
		new Thread(a).run();
		new Thread(b).run();
	}
}
