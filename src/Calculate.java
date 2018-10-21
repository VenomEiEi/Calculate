
public class Calculate {
	public int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isCalculat(int number) {
		if(this.number >= 0 && this.number <= 9) {
			return true;
		}else {
			return false;
		}
	}
	
<<<<<<< HEAD
	public String number() {
		String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		if(this.isCalculat(number) == true) {
			return num[this.number];
		}else {
			return "input 0-9";
		}
 	}
=======
	public String Month() {
		
		String[] array = {"January","February","March","April","May","June","July","August","September","October"};
		
		if(this.isCalculat(number) == true) {
			return array[this.number];
		}else {
			return "input 0-9";
		}
		
		
	}
>>>>>>> ProjectB

}
