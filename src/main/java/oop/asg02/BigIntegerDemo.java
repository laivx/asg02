package oop.asg02;

import java.math.BigInteger;

public class BigIntegerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger bigInteger1 = new BigInteger("123456789");
		BigInteger bigInteger2 = new BigInteger("9999999999999");

		BigInteger bigIntResultAdd = bigInteger1.add(bigInteger2);
		BigInteger bigIntResultSubstract = bigInteger1.subtract(bigInteger2);

		System.out.println(bigIntResultAdd.toString());
		System.out.println(bigIntResultSubstract.toString());

	}

}
