package blatt2;

public class binomialkoeffizient {
	public static long binomialFunc(long n, long k){
		fakult�t faku = new fakult�t();
		long result = faku.fakulFunc(n)/(faku.fakulFunc(k)*faku.fakulFunc(n-k));
		return result;
	}

}
