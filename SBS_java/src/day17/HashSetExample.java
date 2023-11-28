package day17;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<TextMessage> msgSet = new HashSet<>();
		
		TextMessage msg1 = new TextMessage(1001,"안녕하세요");
		TextMessage msg2 = new TextMessage(1001,"안녕하세요");
		TextMessage msg3 = new TextMessage(1001,"안녕하세요");
		TextMessage msg4 = new TextMessage(1002,"안녕하세요");
		TextMessage msg5 = new TextMessage(1003,"안녕");
		
		msgSet.add(msg1);
		msgSet.add(msg2);
		msgSet.add(msg3);
		msgSet.add(msg4);
		msgSet.add(msg5);
		
		System.out.println("사이즈:"+msgSet.size());
		for(TextMessage msg:msgSet) {
			System.out.println("번호:"+msg.getMsgNumber()+"메세지:"+msg.getMsg());
		}
		
		msgSet.remove(msg5);
		System.out.println("사이즈:"+msgSet.size());
		
	}

}
