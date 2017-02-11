package observerPattern;

public class TestObserverPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientQueue testQueue = new ClientQueue();	// 主題
        testQueue.addClientListener(new ClientLogger());	// 註冊觀察者(也可以直接寫在觀察者的建構式裡面，在這裡也就是ClientLogger(){}中)
        testQueue.addClientListener(new ClientSuperLogger());
        Client c1 = new Client("127.0.0.1", "caterpillar");
        Client c2 = new Client("192.168.0.2", "justin");
        testQueue.add(c1);	// 迴圈去跑每一個註冊過的觀察者，讓每一個觀察者呼叫自己的method，客製化通知訊息
        testQueue.add(c2);
        testQueue.remove(c1);
        testQueue.remove(c2);
	}

}
