package controller;

public class TestControllerImpl implements TestController {

	@Override
	public String setTextArea(String s) { //View 요청을 처리해주는 Controller / Service
		String str = "";
		for(int row = 2; row <= 9; row++) {  //구구단~!
			for(int col = 1; col <= 9; col++) {
				str = str + row + "*" + col + "=" + (row*col) + "\n";
			}
		}
		// TODO Auto-generated method stub
		str = str + s + "\n";
		return str;
	}

	@Override
	public String appendsetTextArea(String s) {
		// TODO Auto-generated method stub
		String str ="Hello JavaFX" + s + "\n";
		return str;
	}

}
