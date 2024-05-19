public class Polynomial{

	public double[] coefficients;
	
	public Polynomial(double[]arr) {
		this.coefficients = arr;
	}
	
	public Polynomial(){
		double[]zon = {0};
		this.coefficients = zon;
		
		
	}
	
	
	public Polynomial add(Polynomial p) {
		if(this.coefficients.length == p.coefficients.length) {
		  double[]sumArray = new double[this.coefficients.length];
			for (int i = 0; i < p.coefficients.length; i++) {  
	            sumArray[i] = p.coefficients[i] + this.coefficients[i];  
	        }
		 return new Polynomial(sumArray);
		}
		else if(this.coefficients.length > p.coefficients.length) {
			
			double[]sumArr = new double[this.coefficients.length];
			 for( int i = 0; i < (this.coefficients.length); i++  ) {
					 if(i < p.coefficients.length ) {
					  sumArr[i] = this.coefficients[i]+ p.coefficients[i];
					  }
					 else{
						 sumArr[i] = this.coefficients[i];
					 }
				 }
			  return new Polynomial(sumArr);
			  
		  }
		else {
		 double[]sumArr2 = new double[p.coefficients.length];
			for(int i = 0; i < (p.coefficients.length);i++  ) {
					if(i < this.coefficients.length ) {
					  sumArr2[i] = this.coefficients[i]+ p.coefficients[i];
							  }
					else{
						sumArr2[i] = p.coefficients[i];
					}
						 }
				return new Polynomial(sumArr2);
					  
			
		}
			 
		  }
	public double evaluate(double x) {
		double eval = 0;
		for(int i = 0; i < this.coefficients.length;i++) {
			eval = eval + (this.coefficients[i]* Math.pow(x, i));
		}
	 return eval;
	}
	public boolean hasRoot(double x) {
		return evaluate(x)== 0;
	}
	

	}
