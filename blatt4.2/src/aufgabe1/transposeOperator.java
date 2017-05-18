package aufgabe1;

public class transposeOperator implements Operator{
	public Object execute(Matrix2D a){
		double[][] m = a.getMatrix();
		Matrix2D transpose = new Matrix2D(a.getMatrix());
		for(int i = 0; i < a.matrix.length; i++){
			for(int j  = 0; j < a.matrix.length; j++){
				transpose.matrix[j][i] = m[i][j];
			}
		}
		return transpose;
	}

}
