
public class SwitchEx {

	public static void main(String[] args) {
		int month=6;
		switch (month){
		case(1):
		case(3):
		case(5):
		case(7):
		case(8):
		case(10):
		case(12): System.out.println("Number of Days = "+31);break;
		case(2):System.out.println("Number of Days = "+28);break;
		case(4):
		case(6):
		case(9):
		case(11):System.out.println("Number of Days = "+30);break;
		
		}

	}

}
