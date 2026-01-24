class InvalidNestedMultilineComment {
	/*
	 * Here is a standard message inside the 
	 * multiline comment.
	 *
	 * /* This is an invalid nested multiline comment
	 *  * inside another multiline comment.
	 *  * 
	 *  * Compilers can't compile this as the ending part of
	 *  * this nested multiline comment is considered the end
	 *  * of the outer multiline comments, leaving all the parts
	 *  * below as "actual code".
	 *  */
	 */
}
