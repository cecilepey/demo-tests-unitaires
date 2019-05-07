package dev.utils;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance() {
		int resultat = 0;
		try {
			resultat = StringUtils.levenshteinDistance("Chine", "Chien");
		} catch (NullException e) {
			Assert.fail();
		}
		Assert.assertEquals(2, resultat);

	}

	@Test(expected = NullException.class)
	public void testLevenshteinNull() throws NullException {
		StringUtils.levenshteinDistance("Chine", null);

	}

	@Test(expected = NullException.class)
	public void testLevenshteinNull1() throws NullException {
		StringUtils.levenshteinDistance(null, "Chine");

	}

	@Test(expected = NullException.class)
	public void testLevenshteinNull2() throws NullException {

		StringUtils.levenshteinDistance(null, null);

	}

	/*
	 * @Test public void testLevenshteinNull2() { int resultat =
	 * StringUtils.levenshteinDistance(null, "Chine"); Assert.assertEquals(5,
	 * resultat); }
	 * 
	 * @Test public void testLevenshteinNull3() { int resultat =
	 * StringUtils.levenshteinDistance(null, null); Assert.assertEquals(0,
	 * resultat); }
	 * 
	 * @Test public void testLevenshteinDistance1() { int resultat =
	 * StringUtils.levenshteinDistance("", ""); Assert.assertEquals(0,
	 * resultat); }
	 */

}
