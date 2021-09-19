class Code {
	int digit;
	Code subcode;

	public Code(int input) {

		int digit = (int)Math.round(input/10);

		if (digit > 0) {

			System.out.println ( input % (digit * 10));

		}			

		else {
			System.out.println(input);
		}
	}


	public String toString() {

		int result = hashCode();
		
		String s = Integer.toString(result);

		return s;

	}
}
