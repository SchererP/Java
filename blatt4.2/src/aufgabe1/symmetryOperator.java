package aufgabe1;

public class symmetryOperator implements Operator {
	public Object execute(Matrix2D a) {
		double [][] m = a.getMatrix();
		int c = 0;
		for(int i = 0; i < ((a.matrix.length)/2) + 1; i++){
			for(int j = 0; j < a.matrix.length; j++){
				if(m[i][j] != m[j][i]){
					 c++; //kompakter: return false;
				}if(c != 0){
				break;
				}
			}
		}
		if(c == 0){
			return true;
		}else{
			return false;
		}
		//mit obiger Lösung: return true;
	}
}
