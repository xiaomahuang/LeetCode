import java.util.Arrays;

public class BigNumber {
	private String string1;
	private String string2;

	public BigNumber(String string1, String string2) {
		this.string1 = string1;
		this.string2 = string2;
	}

	// 这个稍微节省点内存
	public String addNumber() {
		char[] cs1 = string1.toCharArray();
		char[] cs2 = string2.toCharArray();
		int length1 = cs1.length;
		int length2 = cs2.length;
		int maxLength = (length1 > length2) ? length1 : length2;
		int[] num1 = new int[maxLength];
		int[] num2 = new int[maxLength];
		for (int i = length1 - 1; i >= 0; i--) {
			num1[length1 - i - 1] = cs1[i] - '0';
		}
		for (int i = length2 - 1; i >= 0; i--) {
			num2[length2 - i - 1] = cs2[i] - '0';
		}
		int[] addNum = new int[maxLength + 1];
		for (int i = 0; i < maxLength; i++) {
			addNum[i] += (num1[i] + num2[i]);
			if (addNum[i] > 9) {
				addNum[i] -= 10;
				addNum[i + 1] += 1;
			}
		}
		StringBuilder builder = new StringBuilder();
		int m=addNum.length-1;
		for (int i = addNum.length-1;i>=0; i--) {
			if (addNum[i]!=0) {
				break;
			}
			m--;
		}
		for (int i =m; i >= 0; i--) {
			builder.append(addNum[i]);
		}
		return builder.toString();
	}

	public String decNumber() {
		//
		// if (string1.length()>string2.length()) {
		//
		// }else if (string1.length()<string2.length()) {
		//
		// }else {
		// int com = string1.compareTo(string2);
		// }
		int com = string1.compareTo(string2);
		char[] cs1;
		char[] cs2;
		if (com > 0) {
			cs1 = string1.toCharArray();
			cs2 = string2.toCharArray();
		} else if (com < 0) {
			cs1 = string2.toCharArray();
			cs2 = string1.toCharArray();
		} else {
			return 0 + "";
		}
		int length1 = cs1.length;
		int length2 = cs2.length;
		int[] num1 = new int[length1];
		int[] num2 = new int[length2];
		for (int i = length1 - 1; i >= 0; i--) {
			num1[length1 - i - 1] = cs1[i] - '0';
		}
		for (int i = length2 - 1; i >= 0; i--) {
			num2[length2 - i - 1] = cs2[i] - '0';
		}	
		for (int i = 0; i < length2; i++) {
			if (num1[i]<num2[i]) {
				num1[i+1]--;
				num1[i]+=(10-num2[i]);
			}else {
				num1[i]-=num2[i];
			}
		}
		StringBuilder builder = new StringBuilder();
		int m=num1.length-1;
		for (int i = num1.length-1;i>=0; i--) {
			if (num1[i]!=0) {
				break;
			}
			m--;
		}
		for (int i = m; i >= 0; i--) {
			builder.append(num1[i]);
		}
		return builder.toString();
	}

	public String mulNumber(){
		char[] cs1 = string1.toCharArray();
		char[] cs2 = string2.toCharArray();
		int length1 = cs1.length;
		int length2 = cs2.length;
		int[] num1 = new int[length1];
		int[] num2 = new int[length2];
		for (int i = length1 - 1; i >= 0; i--) {
			num1[length1 - i - 1] = cs1[i] - '0';
		}
		for (int i = length2 - 1; i >= 0; i--) {
			num2[length2 - i - 1] = cs2[i] - '0';
		}
		int[] mulNum=new int[length1+length2+3];// 两数乘积位数不会超过乘数位数和+ 3位
		for (int i = 0; i < length1; i++) {
			for (int j = 0; j <length2; j++) {
				mulNum[i+j]=num1[i]*num2[j];
			}
		}
		for (int i = 0; i < mulNum.length-1; i++) {
			int carry=mulNum[i]/10;
			mulNum[i]%=10;
			mulNum[i+1]+=carry;
		}
		int m=mulNum.length-1;
		for (int i = mulNum.length-1;i>=0; i--) {
			if (mulNum[i]!=0) {
				break;
			}
			m--;
		}
		StringBuilder builder = new StringBuilder();
		for (int i =m; i >= 0; i--) {
			builder.append(mulNum[i]);
		}

		return builder.toString();
		
	}
}
