class UnderscoresInNumericLiterals {

	/*
	 * The numbers below cause compilation failures, as they
	 * don't use underscores in valid places.
	 */
	double notAtStart = _10000.00;
	double notAtEnd = 10000.00_;
	double notBeforeDecimal = 1000_.00;
	double notAfterDecimal = 1000._00;

	/*
	 * These values work, but some are discouraged as they're
	 * more confusing than the standard no underscore approach.
	 */
	int normalPlacement = 1_000_000;
	int strangePlacement = 1_0_00_00;
	double weirdPlacement = 10000.0_0;
	double strangestPlacement = 1_______2; // 12
}
