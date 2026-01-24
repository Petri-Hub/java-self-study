import java.util.*;

// import java.util.concurrent.atomic.*;

class ShowcasingChildImportsProble {
	public static void main(String[] args){
		/*
		 * The below piece of code fails even that we're
		 * importing the upmost 'java.util' package where teh 
		 * 'AtomicInteger' class resides.
		 *
		 * This causes errors as using the wildcard import (*) does
		 * not include child packages, which means the secondary
		 * commented out import is required.
		 */
		new AtomicInteger();
	}
}	
