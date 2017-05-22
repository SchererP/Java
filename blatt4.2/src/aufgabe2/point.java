package aufgabe2;


public class point { //Klassennamen werden per Konvention groß geschrieben
	double x, y; //Instanzvariablen sollte private sein
	
	public point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double distance(point p1, point p2){ //kann in dieser Fassung auch static sein
		double x = p1.x - p2.x;
		double y = p1.y - p2.y;
		return Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
	}
	public point getpoint(){
		return this;
	}
	public double getx(){ //getter machen bei Paket-sichtbaren Variablen nur wenig Sinn
		return this.x;
	}
	public double gety(){
		return this.y;
	}
	public String x_koordinate(){
		return String.valueOf(x);
	}
	public String y_koordinate(){
		return String.valueOf(y);
	}
	public String string(){
		return String.format("X: " + x_koordinate() + "\nY: " + y_koordinate());
	}
}
