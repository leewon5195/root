package day17;

public class TextMessage {
	private int megNumber; //번호
	private String msg; // 메세지 내용
	
	public TextMessage(int msgNumber,String msg) {
		this.megNumber = msgNumber;
		this.msg = msg;
	}
	
	//메소드를 활용해서 private 접근제한자를 꺼내는 메서드
	public int getMsgNumber() {
		return megNumber;
	}
	
	public String getMsg() {
		return msg;
	}
	public int hashCode() {
		return megNumber;
	}
	
	//equals : 동등비교 == 동동비교(주소==주소) || equals()
	
	//@override
	public boolean equals(Object obj) {
		if(obj instanceof TextMessage) {
			TextMessage compare = (TextMessage)obj;
			if(this.msg.equals(compare.getMsg())) {
				return true;
			}else {
				return false;
			}
			
		}
		return false;
	}
}
