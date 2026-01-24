class PrankConstructor {
	PrankConstructor(){
		System.out.println("In constructor");
	}

	/*
	 * This looks like a constructor, but it is
	 * a standard method with an uncommon casing.
	 *
	 * This probably will apepar on the exam.
	 */
	void PrankConstructor(){
		System.out.println("I'm just a method disguised");
	}

	public static void main(String[] args){
		PrankConstructor p = new PrankConstructor();

		p.PrankConstructor();
	}
}
